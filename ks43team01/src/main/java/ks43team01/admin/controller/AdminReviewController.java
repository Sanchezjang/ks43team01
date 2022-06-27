package ks43team01.admin.controller;

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
@RequestMapping("/adminpage/reviewAdmin")
public class AdminReviewController {
	
	private static final Logger log = LoggerFactory.getLogger(AdminReviewController.class);

	private final ReviewService reviewService;
	
	public AdminReviewController(ReviewService reviewService) {
		this.reviewService = reviewService;
	}
	
	
	
	
	/* 관리자 페이지 회원 리뷰 삭제*/
		@GetMapping("/removeAdminReview")
		public String removeAdminReview(String reviewCode) {
			
			reviewService.removeAdminReview(reviewCode);
			
			return "redirect:/adminpage/reviewAdmin/reviewAdminList";
		}
	
	/* 관리자 페이지 회원 리뷰 조회 */
		@GetMapping("/reviewAdminList")
		public String getReviewAdminList(Model model) {
			
			List<ReviewContentsReg> reviewAdminList = reviewService.getReviewUserList();
			model.addAttribute("reviewAdminList",reviewAdminList);
			
			return "/adminpage/reviewAdmin/reviewAdminList";
					
		}
}
