package ks43team01.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ks43team01.dto.Board;
import ks43team01.dto.BoardAnswer;
import ks43team01.dto.BoardCategory;
import ks43team01.dto.BoardComment;
import ks43team01.dto.BoardLargeCategory;
import ks43team01.dto.BoardMediumCategory;
import ks43team01.dto.BoardPostFile;
import ks43team01.dto.GoodsSubCategory;
import ks43team01.dto.GoodsTopCategory;
import ks43team01.dto.QnaBoard;
import ks43team01.mapper.BoardMapper;

@Service
@Transactional
public class BoardService {
	
	private final BoardMapper boardMapper;
	
	public BoardService(BoardMapper boardMapper) {
		this.boardMapper = boardMapper;
	}
	
	private static final Logger log = LoggerFactory.getLogger(BoardService.class);
	
	
	// 1:1 문의 2차 카테고리
	public List<BoardMediumCategory> getBoardMediumCategory(String boardLargeCategory) {
		
		List<BoardMediumCategory> boardMediumCategory = boardMapper.getBoardMediumCategory(boardLargeCategory);
		
		return boardMediumCategory;
	}
	
	//1:1 문의 1차 카테고리
	public List<BoardLargeCategory> getBoardLargeCategory() {
		
		List<BoardLargeCategory> boardLargeCategory =boardMapper.getBoardLargeCategory();
		
		return boardLargeCategory;
	}
	
	
	/*1:1 문의 게시글 상세 조회 */
	public QnaBoard getQnaBoardByCode(String boardQuestionCode) {
	      System.out.println("___________getQnaBoardByCode____________");
	      return boardMapper.getQnaBoardByCode(boardQuestionCode);
	  }
	
	/* 사용자용 게시글 댓글 삭제*/
	public int removeComment(String boardCommentCode) {
		int result = boardMapper.removeComment(boardCommentCode);
		
		return result;
	}
	
	/* 사용자용 게시글  수정*/
	public int modifyComment(BoardComment boardComment) {
		int result = boardMapper.modifyComment(boardComment);
		
		return result;
	}
	
	/* 게시글 댓글 작성*/
	public int addComment(String sessionId, String sessionName, BoardComment boardComment) {
		boardComment.setUserIdCode(sessionId);
		boardComment.setUserName(sessionName);
		
		int result = boardMapper.addComment(boardComment);
	
		return result;
	}
	
	/* 사용자용 게시글 댓글 조회 */
	public List<BoardComment> getBoardPostCommentList(String boardPostCode){
		List<BoardComment> boardPostCommentList = boardMapper.getBoardPostCommentList(boardPostCode);
		return boardPostCommentList;
	}
	
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

	/* 사용자용 게시글삭제*/
	public int removeBoard(String boardPostCode) {
		int result = boardMapper.removeBoard(boardPostCode);
		
		return result;
	}

	/* 사용자용 게시글  수정*/
	public int modifyBoard(Board board) {
		int result = boardMapper.modifyBoard(board);
		
		return result;
	}

	   /* 게시글 상세 조회 */
	   public Board getBoardByCode(String boardPostCode) {
	      System.out.println("___________getBoardByCode____________");
	      return boardMapper.getBoardByCode(boardPostCode);
	   }
	
	/*게시글 첨부파일 목록 조회*/
	public List<BoardPostFile> getBoardPostFileList(){
		List<BoardPostFile> boardPostFileList = boardMapper.getBoardPostFileList();
		return boardPostFileList;
	}
	
	/* 8-2. 문의 게시판 2차 카테고리 등록*/
	public int addBoardMediumCategory(String sessionId, BoardMediumCategory boardMediumCategory) {
		boardMediumCategory.setUserIdCode(sessionId);
		int result = boardMapper.addBoardMediumCategory(boardMediumCategory);
		
		return result;
	}
	
	
	/* 8. 문의 게시판 2차 카테고리 조회*/
	public List<BoardMediumCategory> getBoardMediumCategoryList(){
		List<BoardMediumCategory> boardMediumCategoryList = boardMapper.getBoardMediumCategoryList();
		return boardMediumCategoryList;
	}
	
	/* 7-2. 문의 게시판 1차 카테고리 등록*/
	public int addBoardLargeCategory(String sessionId, BoardLargeCategory boardLargeCategory) {
		boardLargeCategory.setUserIdCode(sessionId);
		int result = boardMapper.addBoardLargeCategory(boardLargeCategory);
		
		return result;
	}
	
	/* 7. 문의 게시판 1차 카테고리 조회*/
	public List<BoardLargeCategory> getBoardLargeCategoryList(){
		List<BoardLargeCategory> boardLargeCategoryList = boardMapper.getBoardLargeCategoryList();
		return boardLargeCategoryList;
	}	
	
	/* 6-2. 게시판 대분류 카테고리 등록*/
	public int addBoardCategory(String sessionId, BoardCategory boardCategory) {
		boardCategory.setUserIdCode(sessionId);
		int result = boardMapper.addBoardCategory(boardCategory);
		
		return result;
	}
	/* 6. 게시판 대분류 카테고리 조회*/
	public List<BoardCategory> getBoardCategoryList(){
		List<BoardCategory> boardCategoryList = boardMapper.getBoardCategoryList();
		return boardCategoryList;
	}
	
	/* 5-2. 1:1 게시글 등록 */
	public int addQnaBoard(String sessionId, String sessionName, QnaBoard qnaBoard) {
		qnaBoard.setUserIdCode(sessionId);
		qnaBoard.setUserName(sessionName);
		int result = boardMapper.addQnaBoard(qnaBoard);
		
		return result;
	}
	
	/* 5. 1:1 게시판 게시글 조회*/
	public List<QnaBoard> getQnaBoardList(){
		List<QnaBoard> qnaBoardList = boardMapper.getQnaBoardList();
		return qnaBoardList;
	}

	/* 4-2. 자유게시판 게시글 등록 */
	public int addFreeBoard(String sessionId, Board board) {
		board.setUserIdCode(sessionId);
		int result = boardMapper.addFreeBoard(board);
		
		return result;
	}
	
	/* 4. 사용자용 자유게시판 목록 조회 */
	public List<Board> getFreeBoardList(){
		List<Board> freeBoardList = boardMapper.getFreeBoardList();
		return freeBoardList;
	}
	

	/* 3-2. 자주묻는 질문 게시글 등록 */
	public int addFaqBoard(String sessionId, Board board) {
		board.setUserIdCode(sessionId);
		int result = boardMapper.addFaqBoard(board);
		
		return result;
	}
	
	/* 3. 사용자용 자주묻는 질문 목록 조회 */
	public List<Board> getFaqBoardList(){
		List<Board> faqBoardList = boardMapper.getFaqBoardList();
		return faqBoardList;
	}

	/* 2-2. 사용자용 공지사항 게시글 등록 */
	public int addNoticeBoard(String sessionId, Board board) {
		board.setUserIdCode(sessionId);
		int result = boardMapper.addNoticeBoard(board);
		
		return result;
	}
	
	/* 2. 사용자용 공지사항 목록 조회  */
	public List<Board> getNoticeBoardList(){
		List<Board> noticeBoardList = boardMapper.getNoticeBoardList();
		return noticeBoardList;
	}
	
	
	/* 1. 관리자용 전체 게시글 목록 조회 */
	public List<Board> getBoardList(){
		List<Board> boardList = boardMapper.getBoardList();
		return boardList;
	}
	
}
