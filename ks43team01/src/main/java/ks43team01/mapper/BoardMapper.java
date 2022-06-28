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
import ks43team01.dto.BoardPostFile;
import ks43team01.dto.QnaBoard;

@Mapper
public interface BoardMapper {
	//게시글 답변 모음 목록 조회
	public List<BoardAnswer> getBoardAnswerList();
	
	//게시글 댓글 목록 조회
	public List<BoardComment> getBoardCommentList();

	// 사용자용 게시글 삭제
	public int removeBoard(String boardPostCode);
	
	// 사용자용 게시글 수정
	public int modifyBoard(Board board);
	
	//게시글 상세 조회
	public Board getBoardByCode(String boardPostCode);
	
	//게시글 첨부파일 목록 조회
	public List<BoardPostFile> getBoardPostFileList();
	
	//8-2. 문의 게시판 2차 카테고리 등록
	public int addBoardMediumCategory(BoardMediumCategory boardMediumCategory);
	//8. 문의 게시판 2차 카테고리 조회
	public List<BoardMediumCategory> getBoardMediumCategoryList();
	
	//7-2. 문의 게시판 1차 카테고리 등록
	public int addBoardLargeCategory(BoardLargeCategory boardLargeCategory);
	//7. 문의 게시판 1차 카테고리 조회 
	public List<BoardLargeCategory> getBoardLargeCategoryList();
	
	//6-2. 게시판 대분류 카테고리 등록
	public int addBoardCategory(BoardCategory boardCategory);
	//6. 게시판 대분류 카테고리 조회
	public List<BoardCategory> getBoardCategoryList();
	
	//5-2. 1:1 게시글 등록
	public int addQnaBoard(QnaBoard qnaBoard);
	//5. 1:1 게시글 목록 조회
	public List<QnaBoard> getQnaBoardList();
	

	//4-2. 사용자용 자유게시판 등록
	public int addFreeBoard(Board board);
	//4. 사용자용 자유게시판 목록 조회
	public List<Board> getFreeBoardList();
	

	//3-2. 사용자용 자주묻는 질문 게시글 등록
	public int addFaqBoard(Board board);
	//3. 사용자용 자주묻는 질문 목록 조회
	public List<Board> getFaqBoardList();
	

	//2-2. 사용자용 공지사항 게시글 등록
	public int addNoticeBoard(Board board);
	//2. 사용자용 공지사항 목록 조회
	public List<Board> getNoticeBoardList();
	
	
	//1. 관리자용 전체 게시글 목록 조회
	public List<Board> getBoardList();
}
