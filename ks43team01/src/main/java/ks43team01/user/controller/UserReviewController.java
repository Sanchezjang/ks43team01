package ks43team01.user.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ks43team01.dto.ReviewContentsReg;
import ks43team01.service.ReviewService;

@Controller
@RequestMapping("/userpage/reviewUser")
public class UserReviewController {
	
	private static final Logger log = LoggerFactory.getLogger(UserReviewController.class);

	private final ReviewService reviewService;
	
	public UserReviewController(ReviewService reviewService) {
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
	
	/* 유저화면 리뷰 상세 페이지 */
	@GetMapping("/reviewDetail")
	public String reviewDetail(@RequestParam(value = "reviewCode")String reviewCode, Model model) {
		
		ReviewContentsReg reviewContentsReg = reviewService.getReviewByCode(reviewCode);
		log.info("reviewContentsReg :{}", reviewContentsReg);
		model.addAttribute("reviewContentsReg", reviewContentsReg);
		return "userpage/reviewUser/reviewDetail" ;
		
	}
	
	
	
	/* 리뷰 등록 (post)*/
	@PostMapping("/addReview")
	public String addReview(ReviewContentsReg reviewContentsReg
						   ,HttpServletRequest request
						   ,HttpSession session
						   ) {
		
		String ip = request.getRemoteAddr();
		String userIdCode =(String) session.getAttribute("UID");
		String goodsBasicInfoCode = (String)session.getAttribute("GoodsBasicInfoCode");
		reviewContentsReg.setReviewRegIp(ip);
		reviewContentsReg.setUserIdCode(userIdCode);
		reviewContentsReg.setGoodsBasicInfoCode(goodsBasicInfoCode);
		log.info("아이피 가저오는지   :  {}",ip);
		log.info("아이디 값 가져오는지 : {}", userIdCode);
		log.info("상품기본정보 값 가져오는지 : {}", goodsBasicInfoCode);
		log.info("들어오는 값 :{} ", reviewContentsReg);
		reviewService.addReview(reviewContentsReg);
		
		
		return "redirect:/userpage/reviewUser/reviewUserList";
	}
	
	
	
	/* 리뷰 등록(get) */
	@GetMapping("/addReview")
	public String addReview(Model model
						   ,@RequestParam(name = "reviewStarScore" , required = false)String reviewStarScore) {
		
		List<ReviewContentsReg> reviewUserList = reviewService.getReviewUserList();
		model.addAttribute("reviewUserList", reviewUserList);
		
		return "/userpage/reviewUser/addReview";
	}
	
	
	/* 유저 페이지 회원 리뷰 목록 조회 */
	@GetMapping("/reviewUserList")
	public String getReviewUserList(Model model) {
		
		List<ReviewContentsReg> reviewUserList = reviewService.getReviewUserList();
		model.addAttribute("reviewUserList",reviewUserList);
		
		return "/userpage/reviewUser/reviewUserList";
				
	}
	
	
	
	
}

