package ks43team01.user.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import ks43team01.dto.Point;
import ks43team01.dto.ReviewContentsReg;
import ks43team01.service.PointService;
import ks43team01.service.ReviewService;

@Controller
@RequestMapping("/userpage/reviewUser")
public class UserReviewController {

	private static final Logger log = LoggerFactory.getLogger(UserReviewController.class);

	private final ReviewService reviewService;
	private final PointService pointService;

	public UserReviewController(ReviewService reviewService, PointService pointService) {
		this.reviewService = reviewService;
		this.pointService = pointService;
	}

	/* 리뷰 수정 (post) */
	@PostMapping("/modifyReview")
	@ResponseBody
	public Map<String, Object> modifyReview(ReviewContentsReg reviewContentsReg, RedirectAttributes reAttr) {
		log.info("reviewContentsReg: {}", reviewContentsReg);

		reviewService.modifyReview(reviewContentsReg);
		String reviewCode = reviewContentsReg.getReviewCode();
		reAttr.addAttribute("reviewCode", reviewCode);
		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("reviewCode", reviewCode);
		resultMap.put("href", "/userpage/reviewUser/reviewUserList");
		return resultMap;
	}

	/* 리뷰 수정 (get) */
	@GetMapping("/modifyReview")
	public String modifyReview(@RequestParam(value = "reviewCode", required = false) String reviewCode, Model model) {

		ReviewContentsReg reviewContentsReg = reviewService.getReviewByCode(reviewCode);

		model.addAttribute("reviewContentsReg", reviewContentsReg);
		model.addAttribute("reviewCode",reviewCode);
		log.info("reviewCode:{}",reviewCode);
		return "userpage/reviewUser/modifyReview";
	}

	/* 리뷰 삭제 */
	@GetMapping("/removeReview")
	public String removeReview(@RequestParam(value = "reviewCode") String reviewCode
			  				  ,Point point) {
		log.info("나가는 값:{}", "test");
		reviewService.removeImageReview(reviewCode);
		reviewService.removeReview(reviewCode);
		pointService.removeGradeList(reviewCode);
		return "redirect:/userpage/reviewUser/reviewUserList";
	}


	/* 리뷰 등록-포인트 적립 (post), */
	@PostMapping("/addReview")
	public String addReview(ReviewContentsReg reviewContentsReg
							,Point point
							,@RequestParam(value = "pointAmount", required = false) String pointAmount
							,@RequestParam MultipartFile[] reviewImageReg
							,HttpServletRequest request
							,HttpSession session
							,RedirectAttributes reAttr) {
		String serverName = request.getServerName();
		String ip = (String) request.getRemoteAddr();
		String userId = (String) session.getAttribute("UID");
		String fileRealPath = "";
		reviewContentsReg.setReviewRegIp(ip);
		reviewContentsReg.setUserIdCode(userId);
		if ("localhost".equals(serverName)) {
			// server 가 localhost 일때 접근
			fileRealPath = System.getProperty("user.dir") + "/src/main/resources/static/";
			System.out.println(System.getProperty("user.dir"));
			// fileRealPath =
			// request.getSession().getServletContext().getRealPath("/WEB-INF/classes/static/");
		} else {
			// 배포용 주소
			fileRealPath = request.getSession().getServletContext().getRealPath("/WEB-INF/classes/static/");
		}
		log.info("pointAmount:{}", pointAmount);
		log.info("아이피 가저오는지   :  {}", ip);
		log.info("아이디 값 가져오는지 : {}", userId);
		log.info("들어오는 값 :{} ", reviewContentsReg);
		reviewService.userSavePoint(userId);
		reviewService.addReview(reviewContentsReg, reviewImageReg, fileRealPath);
		point.setUserIdCode(userId);
		pointService.addPointList(point);
		log.info("들어오는 값 :{} ", point);

		return "redirect:/userpage/reviewUser/reviewUserList";
	}

	/* 리뷰 등록(get) */
	@GetMapping("/addReview")
	public String addReview(Model model,
			@RequestParam(name = "reviewStarScore", required = false) String reviewStarScore,
			@RequestParam(name = "userIdCode", required = false) String usedIdCode,
			@RequestParam(name = "goodsCode", required = false) String goodsCode,
			@RequestParam(name = "reviewCode", required = false) String reviewCode,
			@RequestParam(name = "reviewScoreStandardCode", required = false) String reviewScoreStandardCode) {

		List<ReviewContentsReg> reviewUserList = reviewService.getReviewUserList();
		model.addAttribute("reviewUserList", reviewUserList);
		model.addAttribute("goodsCode", goodsCode);
		model.addAttribute("reviewCode",reviewCode);
		model.addAttribute("reviewScoreStandardCode", reviewScoreStandardCode);
		return "/userpage/reviewUser/addReview";
	}

	/* 유저 페이지 회원 리뷰 상품코드별 조회 */
	@GetMapping("/reviewGoodsList")
	public String getReviewByGoodsCode(@RequestParam(name = "goodsCode", required = false) String goodsCode,
										@RequestParam(name = "userName", required = false) String userName,
										@RequestParam(value = "reviewCode", required = false) String reviewCode
										, Model model) {

		List<ReviewContentsReg> reviewGoodsList = reviewService.getReviewByGoodsCode(goodsCode);
		
		
		model.addAttribute("reviewGoodsList", reviewGoodsList);
		model.addAttribute("goodsCode",goodsCode);
		model.addAttribute("reviewCode",reviewCode);
		log.info("reviewGoodsList goodsCode값:{}", goodsCode);
		log.info("reviewImageList goodsCode값:{}", goodsCode);
		
		return "/userpage/reviewUser/reviewGoodsList";

	}
	


	/* 유저페이지 회원 리뷰 목록 조회 */
	@GetMapping("/reviewUserList")
	public String getReviewUserList(Model model) {
		
		List<ReviewContentsReg> reviewUserList = reviewService.getReviewUserList();
		model.addAttribute("reviewUserList", reviewUserList);
		return "/userpage/reviewUser/reviewUserList";

	}
}
