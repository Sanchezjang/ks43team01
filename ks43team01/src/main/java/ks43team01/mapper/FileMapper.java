package ks43team01.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface FileMapper {
	public void uploadFile(List<Map<String, String>> dtoFileList);

	public void uploadRelationFile(List<Map<String, String>> relationFileList);
	
	//게시판, 파일 릴레이션 테이블 삽입
	public void uploadRelationFileWithQnaBoard(List<Map<String, String>> relationFileList);
	
	//리뷰, 파일 릴레이션 테이블 삽입
	public void uploadRelationFileWithReview(List<Map<String, String>> relationFileList);
	
	//상품, 파일 릴레이션 테이블 삽입
	public void uploadRelationFileWithGoods(List<Map<String, String>> relationFileList);
	
	//전문가, 파일 릴레이션 테이블 삽입
	
}
