package ks43team01.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ks43team01.dto.Point;
import ks43team01.dto.PointSaveByGrade;
import ks43team01.dto.PointStandardDetails;
import ks43team01.mapper.PointMapper;

@Service
@Transactional
public class PointService {
	private final PointMapper pointMapper;

	private static final Logger log = LoggerFactory.getLogger(PointService.class);
	
	public PointService(PointMapper pointMapper) {
		this.pointMapper = pointMapper;

	}
	
	/* 관리자 페이지 포인트 기준 별 검색 내역 조회 */
	public List<Point> standardPointList(String searchKey, String searchValue){
		
		List<Point> standardPointList = pointMapper.standardPointList(searchKey, searchValue);
		
		return standardPointList;
	}
	/* 관리자 페이지 아이디 별 적립 검색 내역 조회 */
	public List<Point> userIdPointList(String searchKey, String searchValue){
		
		List<Point> userIdPointList = pointMapper.userIdPointList(searchKey, searchValue);
				
		return userIdPointList;
	}
	
	/* 관리자 페이지  수단 별 적립 검색 내역 조회 */
	public List<Point> meansPointList(String searchKey, String searchValue){
		
		List<Point> pointList = pointMapper.meansPointList(searchKey, searchValue);
		log.info("pointList-service : {}",pointList);
		return pointList;
	}
	
	/* 관리자 페이지 포인트 내역 날짜 별 조회 */
	public List<Point> getDatePointList(String startDate, String endDate) {
		log.info("startDate:{}",startDate);
		log.info("endDate:{}",endDate);
		List<Point> pointList = pointMapper.getDatePointList(startDate, endDate);
		log.info("pointList:{}",pointList);
		
		return pointList;
		
	}
	
	/* 관리자 페이지 포인트 기준 내역 수정 */
	public int modifyGradeList(PointSaveByGrade pointSaveByGrade) {
		log.info("pointSaveByGrade:{}",pointSaveByGrade);
		int result = pointMapper.modifyGradeList(pointSaveByGrade);
		
		return result;
	}
	
	/* 관리자 페이지 포인트 기준 내역 삭제 */
	public int removeGradeList(String pointBuySaveStandardGradeCode) {
		log.info("pointBuySaveStandardGradeCode: {}",pointBuySaveStandardGradeCode);
		int result = pointMapper.removeGradeList(pointBuySaveStandardGradeCode);
		
		return result;
	}
	
	
	/* 관리자 페이지 포인트 기준 등록*/
	public int addPointGradeList(HashMap<String, Object> addGrade ) {
	
		int result = pointMapper.addPointGradeList(addGrade);
		
		return result;
	}
	
	
	/* 관리자 페이지 포인트 기준 조회 */
	public List<PointSaveByGrade> getPointGradeList(){
		
		List<PointSaveByGrade> pointGradeList = pointMapper.getPointGradeList();
		
		return pointGradeList;
	}

	/* 관리자 페이지 포인트 기준 삭제*/
	public int removePointStandard(String pointDetailsCode) {
		log.info("pointDetailsCode: {}",pointDetailsCode);
		int result = pointMapper.removePointStandard(pointDetailsCode);
		
		return result;
	}
	
	/* 관리자 페이지 포인트 내역 추가  */
	public int addPointList(Point point) {
		
		int result = pointMapper.addPointList(point);
		
		return result;
	}
	
	/*	관리자 페이지 회원 포인트 조회  */
	 public List<Point> getPointList() {
		 log.info("test");
		 List<Point> pointList = pointMapper.getPointList();
		 
		 return pointList;
	 }
}