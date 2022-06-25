package ks43team01.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks43team01.dto.Point;
import ks43team01.dto.PointSaveByGrade;
import ks43team01.dto.PointStandard;
import ks43team01.dto.PointStandardDetails;


@Mapper
public interface PointMapper {
	
	
	/* 관리자 페이지 포인트 기준 조회*/
	public List<PointSaveByGrade> getPointGradeList();
	
	/* 관리자 페이지 회원 포인트 수정 */
	public int removePoint(String pointDetailsCode);
	
	
	/* 관리자 페이지 회원 포인트 조회 */
	public List<Point> getPointList();
}
