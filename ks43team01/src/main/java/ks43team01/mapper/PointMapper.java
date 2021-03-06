package ks43team01.mapper;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import ks43team01.dto.Point;
import ks43team01.dto.PointSaveByGrade;
import ks43team01.dto.PointStandardDetails;


@Mapper
public interface PointMapper {
	
	/* 관리자 페이지 포인트 기준 별 검색 내역 조회 */
	public List<Point> standardPointList(String searchKey, String searchValue);
	
	/* 관리자 페이지 아이디 별 적립 검색 내역 조회 */
	public List<Point> userIdPointList(String searchKey, String searchValue); 
	
	/* 관리자 페이지  수단 별 적립  검색 내역 조회 */
	public List<Point> meansPointList(String searchKey, String searchValue); 
	
	/* 관리자 페이지 포인트 내역 날짜 별 조회 */
	public List<Point> getDatePointList(String startDate, String endDate);
	
	/* 관리자 페이지 포인트 기준 내역 수정 */
	public int modifyGradeList(PointSaveByGrade pointSaveByGrade);
	
	/* 관리자 페이지 포인트 기준 내역 삭제*/
	public int removeGradeList(String pointBuySaveStandardGradeCode);
	
	/* 관리자 페이지 포인트 기준 등록 */
	public int addPointGradeList(HashMap<String, Object> addGrade);
	
	/* 관리자 페이지 포인트 내역  삭제 */
	public int removePointStandard(String pointDetailsCode);
	
	/* 관리자 페이지 포인트 내역 추가 */
	public int addPointList(Point point);
	
	/* 관리자 페이지 포인트 기준 조회*/
	public List<PointSaveByGrade> getPointGradeList();
	
	/* 관리자 페이지 회원 포인트 조회 */
	public List<Point> getPointList();
}
