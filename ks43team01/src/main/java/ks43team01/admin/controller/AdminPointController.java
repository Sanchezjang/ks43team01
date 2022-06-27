package ks43team01.admin.controller;

import java.util.List;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ks43team01.dto.Point;
import ks43team01.dto.PointSaveByGrade;
import ks43team01.service.PointService;


@Controller
@RequestMapping("/adminpage/pointDetails")
public class AdminPointController {
	
	
	private static final Logger log = LoggerFactory.getLogger(AdminPointController.class);

	private final PointService pointService;
	
	public AdminPointController(PointService pointService) {
		this.pointService = pointService;
	}
	
	
	/* 포인트 삭제 */
	@PostMapping("/pointList")
	public String removePoint(String pointDetailsCode) {
		
		pointService.removePoint(pointDetailsCode);
		
		return "adminpage/pointDetails/pointList"; 
	
	
	}
	/* 관리자 페이지 포인트 기준 내역 조회*/
	@GetMapping("/pointGradeList")
	public String getPointGradeList(Model model) {
		
		List<PointSaveByGrade> pointGradeList = pointService.getPointGradeList();
		
		model.addAttribute("pointGradeList",pointGradeList);
		
		return "adminpage/pointDetails/pointGradeList";
	}
	
	
	
	/* 관리자 페이지 회원 포인트 적립 내역 테이블 조회 */
	@GetMapping("/pointList")
	public String getPointList(Model model) {
		
		log.info("관리자 페이지 회원 포인트 적립 내역 테이블 조회 : {}" ,"test");
		List<Point> pointList = pointService.getPointList();
		
		model.addAttribute("pointList", pointList);
		
		return "adminpage/pointDetails/pointList";
	}
	
}