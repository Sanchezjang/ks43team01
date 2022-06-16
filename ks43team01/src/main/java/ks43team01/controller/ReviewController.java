package ks43team01.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ks43team01.dto.ReviewContentsReg;
import ks43team01.service.ReviewService;

@Controller
@RequestMapping("adminpage/review")
public class ReviewController {
	
	private static final Logger log = LoggerFactory.getLogger(ReviewController.class);

	private final ReviewService reviewService;
	
	public ReviewController(ReviewService reviewService) {
		this.reviewService = reviewService;
	}
	
	
	
	
	
	/* 리뷰 목록 조회 */
	@GetMapping("/reviewList")
	public String getReviewList(Model model) {
		
	List<ReviewContentsReg> reviewList = reviewService.getReviewList();
	log.info(" 리뷰목록조회:{} ", "test");
	model.addAttribute("reviewList",reviewList);
	
	return "/adminpage/review/reviewList";
		
	}
	
}

