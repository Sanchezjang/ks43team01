/*
 * package ks43team01.admin.controller;
 * 
 * import java.util.List;
 * 
 * import org.slf4j.Logger; import org.slf4j.LoggerFactory; import
 * org.springframework.stereotype.Controller; import
 * org.springframework.ui.Model; import
 * org.springframework.web.bind.annotation.GetMapping;
 * 
 * import ks43team01.dto.ReviewContentsReg; import
 * ks43team01.service.ReviewService; import
 * ks43team01.user.controller.ReviewController;
 * 
 * @Controller
 * 
 * public class AdminReviewController { private static final Logger log =
 * LoggerFactory.getLogger(ReviewController.class);
 * 
 * private final ReviewService reviewService;
 * 
 * public ReviewController(ReviewService reviewService) { this.reviewService =
 * reviewService; }
 * 
 * 관리자 페이지 회원 리뷰 목록 조회
 * 
 * @GetMapping("adminpage/reviewAdmin/reviewAdminList") public String
 * getReviewAdminList(Model model) {
 * 
 * List<ReviewContentsReg> reviewAdminList = reviewService.getReviewAdminList();
 * log.info(" 리뷰목록조회:{} ", "test");
 * model.addAttribute("reviewAdminList",reviewAdminList);
 * 
 * return "/adminpage/reviewAdmin/reviewAdminList"; } }
 */