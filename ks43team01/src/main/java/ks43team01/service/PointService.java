package ks43team01.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ks43team01.dto.Point;
import ks43team01.dto.PointStandard;
import ks43team01.dto.PointStandardDetails;
import ks43team01.mapper.PointMapper;

@Service
@Transactional
public class PointService {
	private final PointMapper pointMapper;
	
	public PointService(PointMapper pointMapper) {
		this.pointMapper = pointMapper;

	}
	
	private static final Logger log = LoggerFactory.getLogger(PointService.class);

	/* 포인트 기준 내용 코드 */
	public PointStandardDetails getPointStandardDetails() {
	
	PointStandardDetails pointStandardDetails = pointMapper.getPointStandardDetails();
	
	return pointStandardDetails;
	}
	
	/* 포인트 기준 코드  */
	public PointStandard getPointStandard() {
		
		PointStandard pointStandard = pointMapper.getPointStandard();
		
		return pointStandard;
	}
	
	/*	포인트 내역 조회  */
	 public List<Point> getPointList() {
		 log.info("test");
		 List<Point> pointList = pointMapper.getPointList();
		 
		 return pointList;
	 }
}