package ks43team01.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import ks43team01.dto.Board;
import ks43team01.dto.BoardAnswer;
import ks43team01.dto.BoardCategory;
import ks43team01.dto.BoardComment;
import ks43team01.dto.BoardLargeCategory;
import ks43team01.dto.BoardMediumCategory;
import ks43team01.dto.QnaBoard;

@Mapper
public interface BoardMapper {
	
	/*
	 * 사용자 화면
	 * (일반 게시글 : 공지사항, 자주묻는 질문, 자유 게시판)
	 * */
	
	/*1:1 문의 게시글*/
	
	//게시글 검색
	public List<QnaBoard> getSearchQnaBoardList(String searchKey, String searchValue);
	
	//첨부파일 수정
	List <Map<String,Object>> selectBoardFileDetail(Map<String, String> Map);
	
	//게시글 조회수 업데이트
	public int updateQnaBoardPageView(String boardQuestionCode);
	
	//답변 삭제
	public int removeQnaBoardReply(String boardQuestionReplyCode);
	
	//답변 수정
	public int modifyQnaBoardReply(QnaBoard qnaBoard);
	
	//답변 등록
	public int addQnaBoardReply(QnaBoard qnaBoard);
	

	//게시글 이미지 삭제
	public int removeImageQnaBoard(String boardQuestionCode);
	
	//게시글 삭제
	public int removeQnaBoard(String boardQuestionCode);
	
	//게시글 수정
	public int modifyQnaBoard(QnaBoard qnaboard);
	
	//2차 카테고리(등록화면)
	public List<BoardMediumCategory> getBoardMediumCategory(String boardLargeCategory);
	
	//1차 카테고리(등록화면)
	public List<BoardLargeCategory> getBoardLargeCategory();
		
	//게시글 상세 조회 + 게시글 답변 상세보기
	public QnaBoard getQnaBoardByCode(String boardQuestionCode);
	
	//게시글 등록
	public int addQnaBoard(QnaBoard qnaBoard);
	
	//게시글 페이징
	public List<Map<String, Object>> getQnaBoardList(Map<String, Object> paramMap);
	
	//1:1 문의 게시글 목록 row 수
	public int getQnaBoardListCount();

	
	
	/*일반 게시글 */
	
	//자유게시판 게시글 검색
	public List<Board> getSearchFreeList(String searchKey, String searchValue);
	//자주 하는 질문 게시글 검색
	public List<Board> getSearchFaqList(String searchKey, String searchValue);
	//공지사항 게시글 검색
	public List<Board> getSearchBoardList(String searchKey, String searchValue);
	
	//댓글 삭제
	public int removeComment(String boardCommentCode);
	
	//댓글 수정 
	public int modifyComment(BoardComment boardComment);
	
	//댓글 등록
	public int addComment(BoardComment boardComment);
	
	//댓글 조회
	public List<BoardComment> getBoardPostCommentList(String boardPostCode);

	//게시글 조회수 업데이트
	public int updateBoardPageView(String boardPostCode);
	
	//게시글 삭제
	public int removeBoard(String boardPostCode);
	
	//게시글 수정
	public int modifyBoard(Board board);
	
	//게시글 상세 조회
	public Board getBoardByCode(String boardPostCode);	
	
	//1:1문의 아이디별 검색
	public List<QnaBoard> getQnaBoard(String userIdCode);
	//자유게시판 게시글 등록
	public int addFreeBoard(Board board);
	//자유게시판 목록 조회
	public List<Board> getFreeBoardList();
	
	//자주묻는 질문 게시글 등록
	public int addFaqBoard(Board board);
	//자주묻는 질문 목록 조회
	public List<Board> getFaqBoardList();
	
	//공지사항 게시글 등록
	public int addNoticeBoard(Board board);
	//공지사항 목록 조회
	public List<Board> getNoticeBoardList();
	
	//1:1 게시글 테이블 수
	public int getQnaBoardRow();
	
	/*
	 * 관리자 화면
	 * */

	
	//게시글 답변 모음 삭제
	public int removeBoardAnswer(String boardAnswerCode);
	//게시글 답변 모음 수정
	public int modifyBoardAnswer(BoardAnswer boardAnswer);
	//게시글 답변 모음 상세 조회
	public BoardAnswer getBoardAnswerByCode(String boardAnswerCode);
	//게시글 답변 모음 등록
	public int addBoardAnswer(BoardAnswer boardAnswer);
	//게시글 답변 모음 목록 조회
	public List<BoardAnswer> getBoardAnswerList();
	
	//일반 게시글 댓글 목록 조회
	public List<BoardComment> getBoardCommentList();

	//문의 게시판 2차 카테고리 삭제
	public int removeBoardMediumCategory(String boardMediumCategoryCode);
	//문의 게시판 2차 카테고리 수정
	public int modifyBoardMediumCategory(BoardMediumCategory boardMediumCategory);
	//문의 게시판 2차 카테고리  상세 조회
	public BoardMediumCategory getBoardMediumCategoryByCode(String boardMediumCategoryCode);	
	//문의 게시판 2차 카테고리 등록
	public int addBoardMediumCategory(BoardMediumCategory boardMediumCategory);
	//문의 게시판 2차 카테고리 조회
	public List<BoardMediumCategory> getBoardMediumCategoryList();

	//문의 게시판 1차 카테고리 삭제
	public int removeBoardLargeCategory(String boardLargeCategoryCode);
	//문의 게시판 1차 카테고리 수정
	public int modifyBoardLargeCategory(BoardLargeCategory boardLargeCategory);
	//문의 게시판 1차 카테고리  상세 조회
	public BoardLargeCategory getBoardLargeCategoryByCode(String boardLargeCategoryCode);	
	//문의 게시판 1차 카테고리 등록
	public int addBoardLargeCategory(BoardLargeCategory boardLargeCategory);
	//문의 게시판 1차 카테고리 조회 
	public List<BoardLargeCategory> getBoardLargeCategoryList();
	
	//게시판 대분류 카테고리 삭제
	public int removeBoardCategory(String boardCategoryCode);
	//게시판 대분류 카테고리 수정
	public int modifyBoardCategory(BoardCategory boardCategory);
	//게시판 대분류 카테고리 상세 조회
	public BoardCategory getBoardCategoryByCode(String boardCategoryCode);	
	//게시판 대분류 카테고리 등록
	public int addBoardCategory(BoardCategory boardCategory);
	//게시판 대분류 카테고리 조회
	public List<BoardCategory> getBoardCategoryList();
	
	//전체 게시글 목록 조회 
	public List<Board> getBoardList();
}
