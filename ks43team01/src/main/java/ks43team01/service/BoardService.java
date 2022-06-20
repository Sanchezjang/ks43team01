package ks43team01.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ks43team01.dto.Board;
import ks43team01.dto.BoardCategory;
import ks43team01.dto.QnaBoard;
import ks43team01.mapper.BoardMapper;

@Service
@Transactional
public class BoardService {
	
	private final BoardMapper boardMapper;
	
	public BoardService(BoardMapper boardMapper) {
		this.boardMapper = boardMapper;
	}
	
	/* 1:1 게시판 게시글 조회*/
	public List<QnaBoard> getQnaBoardList(){
		List<QnaBoard> qnaBoardList = boardMapper.getQnaBoardList();
		return qnaBoardList;
	}
	

	/*게시판 대분류 카테고리 조회*/
	public List<BoardCategory> getBoardCategoryList(){
		List<BoardCategory> boardCategoryList = boardMapper.getBoardCategoryList();
		return boardCategoryList;
	}
	/* 4-2. 자유게시판 게시글 등록 */
	public int addFreeBoard(Board board) {
		int result = boardMapper.addFreeBoard(board);
		
		return result;
	}
	
	/* 4. 사용자용 자유게시판 목록 조회 */
	public List<Board> getFreeBoardList(){
		List<Board> freeBoardList = boardMapper.getFreeBoardList();
		return freeBoardList;
	}
	
	/* 3-2. 공지사항 게시글 등록 */
	public int addFaqBoard(Board board) {
		int result = boardMapper.addFaqBoard(board);
		
		return result;
	}
	
	/* 3. 사용자용 자주묻는 질문 목록 조회 */
	public List<Board> getFaqBoardList(){
		List<Board> faqBoardList = boardMapper.getFaqBoardList();
		return faqBoardList;
	}
	
	/* 2-2. 공지사항 게시글 등록 */
	public int addNoticeBoard(Board board) {
		int result = boardMapper.addNoticeBoard(board);
		
		return result;
	}
	
	/* 2. 사용자용 공지사항 목록 조회 */
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
