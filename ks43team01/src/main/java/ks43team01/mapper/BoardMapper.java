package ks43team01.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import ks43team01.dto.Board;
import ks43team01.dto.BoardCategory;

@Mapper
public interface BoardMapper {

	// 일반 게시글 등록
	public int addBoard(Board board);
	
	//3. 사용자용 공지사항 목록 조회
	public List<Board> getFreeBoardList();
	
	//2. 사용자용 공지사항 목록 조회
	public List<Board> getFaqBoardList();
	
	//1. 사용자용 공지사항 목록 조회
	public List<Board> getNoticeBoardList();
}
