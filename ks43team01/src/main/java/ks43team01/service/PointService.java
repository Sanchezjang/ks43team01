package ks43team01.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ks43team01.dto.Point;
import ks43team01.dto.PointSaveByGrade;
import ks43team01.dto.PointStandard;
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
	/* 관리자 페이지 포인트 기준 조회 */
	public List<PointSaveByGrade> getPointGradeList(){
		
		List<PointSaveByGrade> pointGradeList = pointMapper.getPointGradeList();
		
		return pointGradeList;
	}

	/* 관리자 페이지 회원 포인트 삭제 */
	public int removePoint(String pointDetailsCode) {
		
		int result = pointMapper.removePoint(pointDetailsCode);
		
		return result;
	}
	
	
	/*	관리자 페이지 회원 포인트 조회  */
	 public List<Point> getPointList() {
		 log.info("test");
		 List<Point> pointList = pointMapper.getPointList();
		 
		 return pointList;
	 }
}