package ks43team01.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ks43team01.dto.ReviewContentsReg;
import ks43team01.service.ReviewService;

@Controller
public class ReviewController {
	
	private static final Logger log = LoggerFactory.getLogger(ReviewController.class);

	private final ReviewService reviewService;
	
	public ReviewController(ReviewService reviewService) {
		this.reviewService = reviewService;
	}
	
	/* 리뷰 수정 */
	@PostMapping("/modifyReview")
	public String modifyReview(ReviewContentsReg reviewContentsReg) {
		
		reviewService.modifyReview(reviewContentsReg);
		
		return "redirect:/userpage/reviewUser/reviewUserList";
	}
	
	/* 리뷰 삭제  */
	@PostMapping("/removeReview")
	public String removeReview(String reviewCode) {
		
		reviewService.removeReview(reviewCode);
		
		return "redirect:/userpage/reviewUser/reviewUserList";
	}
	
	/* 리뷰 등록 */
	@PostMapping("/addReview")
	public String addReview(ReviewContentsReg reviewContentsReg) {
		
		reviewService.addReview(reviewContentsReg);
		
		return "redirect:/userpage/reviewUser/reviewUserList";
	}
	/* 리뷰 목록 유저 페이지 조회 */
	@GetMapping("/reviewUserList")
	public String getReviewUserList(Model model) {
		
		List<ReviewContentsReg> reviewUserList = reviewService.getReviewUserList();
		model.addAttribute("reviewUserList",reviewUserList);
		
		return "/userpage/reviewUser/reviewUserList";
				
	}
	
	/* 리뷰 목록 관리자 페이지 조회 */
	@GetMapping("/reviewAdminList")
	public String getReviewAdminList(Model model) {
		
		List<ReviewContentsReg> reviewAdminList = reviewService.getReviewAdminList();
		log.info(" 리뷰목록조회:{} ", "test");
		model.addAttribute("reviewAdminList",reviewAdminList);
		
		return "/adminpage/reviewAdmin/reviewAdminList";
	}
	
}

