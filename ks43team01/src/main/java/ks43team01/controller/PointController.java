package ks43team01.controller;

import java.util.List;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ks43team01.dto.Point;
import ks43team01.service.PointService;


@Controller
@RequestMapping("/adminpage/pointDetails")
public class PointController {
	
	
	private static final Logger log = LoggerFactory.getLogger(PointController.class);

	private final PointService pointService;
	
	public PointController(PointService pointService) {
		this.pointService = pointService;
	}
	/* 포인트 업데이트 로직  */
	
	
	
	
	
	/* 포인트 적립 내역 테이블 조회 */
	@GetMapping("/pointList")
	public String getPointList(Model model) {
		
		
		log.info("포인트 적립 내역 테이블 조회 : {}" ,"test");
		List<Point> pointList = pointService.getPointList();
		
		model.addAttribute("pointList", pointList);
		
		return "adminpage/pointDetails/pointList";
	}
	
}