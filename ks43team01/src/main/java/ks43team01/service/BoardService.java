package ks43team01.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import ks43team01.common.FileUtils;
import ks43team01.dto.Board;
import ks43team01.dto.BoardAnswer;
import ks43team01.dto.BoardCategory;
import ks43team01.dto.BoardComment;
import ks43team01.dto.BoardLargeCategory;
import ks43team01.dto.BoardMediumCategory;
import ks43team01.dto.QnaBoard;
import ks43team01.dto.QnaBoardReply;
import ks43team01.mapper.BoardMapper;
import ks43team01.mapper.FileMapper;

@Service
@Transactional
public class BoardService {
	
	private final BoardMapper boardMapper;
	private final FileMapper fileMapper;
	
	public BoardService(BoardMapper boardMapper, FileMapper fileMapper) {
		this.boardMapper = boardMapper;
		this.fileMapper = fileMapper;
	}
	
	private static final Logger log = LoggerFactory.getLogger(BoardService.class);
	
	/*
	 * 사용자 화면
	 * */
	
	/* 1:1 게시글 답변글 등록 */
	public int addQnaBoardReply(String sessionId, QnaBoard qnaBoard) {
		qnaBoard.setUserIdCode(sessionId);
		
		int result = boardMapper.addQnaBoardReply(qnaBoard);
		
		return result;
	}
	

	
	/* 1:1 게시글 등록 */
	public String addQnaBoard(String sessionId, QnaBoard qnaBoard, MultipartFile[] boardImgFile, String fileRealPath) {
		qnaBoard.setUserIdCode(sessionId);
		
		// 1. 1:1 문의 게시글 첨부파일 업로드
		// 2. 파일 업로드 시 파일 DB insert
		// 3. 게시글 insert
		// 4. 결과값 return
		
		/*첨부파일을 포함하지 않을 때 조건문 실행*/
		boolean fileCheck = true;
		
		for (MultipartFile multipartFile : boardImgFile){
			if(!multipartFile.isEmpty()) {
				fileCheck = false;
			}
		}
		
		if (!fileCheck) {
			
		//파일 업로드 객체 생성
		FileUtils fu = new FileUtils(boardImgFile, qnaBoard.getUserIdCode(), fileRealPath);
		List<Map<String, String>> dtoFileList = fu.parseFileInfo();
		
		// t_file 테이블에 삽입
				System.out.println(dtoFileList + "<<<dtoFileList입니다.");
				fileMapper.uploadFile(dtoFileList);
						
				boardMapper.addQnaBoard(qnaBoard);
				String boardQuestionCode= qnaBoard.getBoardQuestionCode();
				
				// 릴레이션 테이블에 삽입
				 List<Map<String, String>> relationFileList = new ArrayList<>();
				 for(Map<String, String> m : dtoFileList) {
				 m.put("boardQuestionCode", boardQuestionCode);
				 relationFileList.add(m);
				 		}
				 System.out.println(relationFileList + "<<<relationFileList입니다.");
			 		fileMapper.uploadRelationFileWithQnaBoard(relationFileList);
			     	
					System.out.println("-----------------------게시글 등록 서비스 끝------------------------------");
					return boardQuestionCode;
				}else {
					
					int result = boardMapper.addQnaBoard(qnaBoard);
					return Integer.toString(result);
				}
	}
	
	   /* 5. 1:1 게시판 게시글 목록 조회*/
	   public Map<String, Object> getQnaBoardList(int currentPage){
	      int rowPerPage = 10;
	      int startPageNum = 1;
	      int endPageNum = 3;
	      
	      double rowCount = boardMapper.getQnaBoardListCount();
	      int lastPage = (int)Math.ceil(rowCount/rowPerPage);
	      int startRow = (currentPage - 1) * rowPerPage;
	      
	      Map<String, Object> paramMap = new HashMap<String, Object>();
	      paramMap.put("startRow", startRow);
	      paramMap.put("rowPerPage", rowPerPage);
	      
	      List<QnaBoard> getQnaBoardList = boardMapper.getQnaBoardList(paramMap);
	      
	      System.out.println("getQnaBoardList: {}" + getQnaBoardList);
	      
	      if(currentPage > 6) {
	         startPageNum = currentPage - 5;
	         endPageNum = currentPage + 4; // 자신 포함 / last-21페이지 픽스. 21-4 = 17부터는 움직이지않겠다. 17커런트로왔을때

	         if (endPageNum >= lastPage) { // 17이상부터 클릭시 숫자가 늘어나지않고 고정되는 모습
	            startPageNum = lastPage - 9; // 라스트페이지해당 21-9 = 12부터 고정시키겠다.
	            endPageNum = lastPage;
	         }
	      }
	      Map<String, Object> resultMap = new HashMap<String, Object>();
	      resultMap.put("lastPage", lastPage);
	      resultMap.put("getQnaBoardList", getQnaBoardList);
	      resultMap.put("startPageNum", startPageNum);
	      resultMap.put("endPageNum", endPageNum);
	      resultMap.put("rowCount", rowCount);
	      
	      return resultMap;
	   }
	
	// 1:1 문의 2차 카테고리
	public List<BoardMediumCategory> getBoardMediumCategory(String boardLargeCategory) {
		List<BoardMediumCategory> boardMediumCategory = boardMapper.getBoardMediumCategory(boardLargeCategory);
		log.info("선택시 가져오는 값 : {}", boardMediumCategory);
		
		return boardMediumCategory;
	}
	//1:1 문의 1차 카테고리
	public List<BoardLargeCategory> getBoardLargeCategory() {
		List<BoardLargeCategory> boardLargeCategory= boardMapper.getBoardLargeCategory();
		return boardLargeCategory;
	}

	/*1:1 문의 게시글 상세 조회 */
	public QnaBoard getQnaBoardByCode(String boardQuestionCode) {
	      System.out.println("___________getQnaBoardByCode____________");
	      return boardMapper.getQnaBoardByCode(boardQuestionCode);
	  }
	/*1:1 문의 게시글 아이디별정보추출.. */
	public List<QnaBoard> getQnaBoard(String userIdCode) {
		List<QnaBoard> resultList = boardMapper.getQnaBoard(userIdCode);
		return resultList;
	}
	/*게시글 댓글 삭제*/
	public int removeComment(String boardCommentCode) {
		int result = boardMapper.removeComment(boardCommentCode);
		
		return result;
	}
	
	/*게시글 댓글 수정*/
	public int modifyComment(BoardComment boardComment) {
		int result = boardMapper.modifyComment(boardComment);
		
		return result;
	}
	
	/*게시글 댓글 작성*/
	public int addComment(String sessionId, String sessionName, BoardComment boardComment) {
		boardComment.setUserIdCode(sessionId);
		boardComment.setUserName(sessionName);
		
		int result = boardMapper.addComment(boardComment);
	
		return result;
	}
	
	/*게시글 댓글 조회 */
	public List<BoardComment> getBoardPostCommentList(String boardPostCode){
		List<BoardComment> boardPostCommentList = boardMapper.getBoardPostCommentList(boardPostCode);
		return boardPostCommentList;
	}
	

	/*게시글삭제*/
	public int removeBoard(String boardPostCode) {
		int result = boardMapper.removeBoard(boardPostCode);
		
		return result;
	}

	/*게시글  수정*/
	public int modifyBoard(Board board) {
		int result = boardMapper.modifyBoard(board);
		
		return result;
	}

	/* 게시글 상세 조회 */
	public Board getBoardByCode(String boardPostCode) {
		System.out.println("___________getBoardByCode____________");
		return boardMapper.getBoardByCode(boardPostCode);
	}

	/* 자유게시판 게시글 등록 */
	public int addFreeBoard(String sessionId, Board board) {
		board.setUserIdCode(sessionId);
		int result = boardMapper.addFreeBoard(board);
		
		return result;
	}
	
	/* 자유게시판 목록 조회 */
	public List<Board> getFreeBoardList(){
		List<Board> freeBoardList = boardMapper.getFreeBoardList();
		return freeBoardList;
	}
	

	/* 자주묻는 질문 게시글 등록 */
	public int addFaqBoard(String sessionId, Board board) {
		board.setUserIdCode(sessionId);
		int result = boardMapper.addFaqBoard(board);
		
		return result;
	}
	
	/* 자주묻는 질문 목록 조회 */
	public List<Board> getFaqBoardList(){
		List<Board> faqBoardList = boardMapper.getFaqBoardList();
		return faqBoardList;
	}

	/* 공지사항 게시글 등록 */
	public int addNoticeBoard(String sessionId, Board board) {
		board.setUserIdCode(sessionId);
		int result = boardMapper.addNoticeBoard(board);
		
		return result;
	}
	
	/* 공지사항 목록 조회  */
	public List<Board> getNoticeBoardList(){
		List<Board> noticeBoardList = boardMapper.getNoticeBoardList();
		return noticeBoardList;
	}
	
	/*
	 * 관리자 화면
	 * */
	
	/* 게시글 답변모음 목록 조회 */
	public List<BoardAnswer> getBoardAnswerList(){
		List<BoardAnswer> boardAnswerList = boardMapper.getBoardAnswerList();
		return boardAnswerList;
	}
	
	/* 게시글 댓글 목록 조회 */
	public List<BoardComment> getBoardCommentList(){
		List<BoardComment> boardCommentList = boardMapper.getBoardCommentList();
		return boardCommentList;
	}
	
	
	/*문의 게시판 2차 카테고리 등록*/
	public int addBoardMediumCategory(String sessionId, BoardMediumCategory boardMediumCategory) {
		boardMediumCategory.setUserIdCode(sessionId);
		int result = boardMapper.addBoardMediumCategory(boardMediumCategory);
		
		return result;
	}

	/*문의 게시판 2차 카테고리 조회*/
	public List<BoardMediumCategory> getBoardMediumCategoryList(){
		List<BoardMediumCategory> boardMediumCategoryList = boardMapper.getBoardMediumCategoryList();
		return boardMediumCategoryList;
	}
	
	/*문의 게시판 1차 카테고리 등록*/
	public int addBoardLargeCategory(String sessionId, BoardLargeCategory boardLargeCategory) {
		boardLargeCategory.setUserIdCode(sessionId);
		int result = boardMapper.addBoardLargeCategory(boardLargeCategory);
		
		return result;
	}
	
	/*문의 게시판 1차 카테고리 조회*/
	public List<BoardLargeCategory> getBoardLargeCategoryList(){
		List<BoardLargeCategory> boardLargeCategoryList = boardMapper.getBoardLargeCategoryList();
		return boardLargeCategoryList;
	}	
	
	/*게시판 대분류 카테고리 등록*/
	public int addBoardCategory(String sessionId, BoardCategory boardCategory) {
		boardCategory.setUserIdCode(sessionId);
		int result = boardMapper.addBoardCategory(boardCategory);
		
		return result;
	}
	/*게시판 대분류 카테고리 조회*/
	public List<BoardCategory> getBoardCategoryList(){
		List<BoardCategory> boardCategoryList = boardMapper.getBoardCategoryList();
		return boardCategoryList;
	}
	
	/*전체 게시글 목록 조회*/
	public List<Board> getBoardList(){
		List<Board> boardList = boardMapper.getBoardList();
		return boardList;
	}
	
}
