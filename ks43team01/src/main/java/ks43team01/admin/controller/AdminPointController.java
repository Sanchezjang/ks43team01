package ks43team01.admin.controller;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import ks43team01.dto.Point;
import ks43team01.dto.PointSaveByGrade;
import ks43team01.dto.User;
import ks43team01.service.PointService;

@Controller
@RequestMapping("/adminpage/pointDetails")
public class AdminPointController {

	private static final Logger log = LoggerFactory.getLogger(AdminPointController.class);

	private final PointService pointService;

	public AdminPointController(PointService pointService) {
		this.pointService = pointService;
	}

	/* 관리자 페이지 포인트 기준 내역 수정(post) */
	@PostMapping("/modifyGradeList")
	public String modifyGradeList(PointSaveByGrade pointSaveByGrade, RedirectAttributes reAttr) {

		log.info("pointSaveByGrade:{}", pointSaveByGrade);
		pointService.modifyGradeList(pointSaveByGrade);
		String pointBuySaveStandardGradeCode = pointSaveByGrade.getPointBuySaveStandardGradeCode();
		reAttr.addAttribute("pointBuySaveStandardGradeCode", pointBuySaveStandardGradeCode);

		return "redirect:/adminpage/pointDetails/pointGradeList";
	}

	/* 관리자 페이지 포인트 기준 내역 수정(get) */
	@GetMapping("/modifyGradeList")
	public String modifyGradeList(
			@RequestParam(name = "pointBuySaveStandardGradeCode", required = false) String pointBuySaveStandardGradeCode,
			Model model) {

		List<PointSaveByGrade> pointSaveByGrade = pointService.getPointGradeList();
		log.info("pointSaveByGrade:{}", pointSaveByGrade);
		model.addAttribute("pointSaveByGrade", pointSaveByGrade);
		model.addAttribute("pointBuySaveStandardGradeCode", pointBuySaveStandardGradeCode);
		return "/adminpage/pointDetails/modifyGradeList";
	}

	/* 관리자 페이지 포인트 기준 내역 삭제 */
	@GetMapping("/removeGradeList")
	public String removeGradeList(String pointBuySaveStandardGradeCode) {

		log.info("pointBuySaveStandardGradeCode: {}", pointBuySaveStandardGradeCode);
		pointService.removeGradeList(pointBuySaveStandardGradeCode);

		return "redirect:/adminpage/pointDetails/pointGradeList";
	}

	/* 관리자 페이지 포인트 기준 내역 등록(post) */
	@PostMapping("/addPointGradeList")
	public String addPointGradeList(PointSaveByGrade pointSaveByGrade,
			@RequestParam(name = "gradeName", required = false) String gradeName,
			@RequestParam(name = "gradeUserCode", required = false) String gradeUserCode) {

		log.info("값 받아오는지:{}", "test");
		log.info("pointSaveByGrade값 받아오는지:{}", gradeName);
		log.info("pointSaveByGrade값 받아오는지:{}", pointSaveByGrade);

		HashMap<String, Object> addGrade = new HashMap<String, Object>();
		addGrade.put("gradeName", gradeName);
		addGrade.put("gradeUserCode", gradeUserCode);
		addGrade.put("pointSaveByGrade", pointSaveByGrade);
		pointService.addPointGradeList(addGrade);

		if (gradeName != null) {
			if ("뉴비".equals(gradeName)) {
				gradeUserCode = "grade01";
				log.info("gradeName");
			} else if ("브론즈".equals(gradeName)) {
				gradeUserCode = "grade02";
			} else if ("실버".equals(gradeName)) {
				gradeUserCode = "grade03";
			} else if ("골드".equals(gradeName)) {
				gradeUserCode = "grade04";
			}
		}

		pointSaveByGrade.setGradeUserCode(gradeName);

		return "redirect:/adminpage/pointDetails/pointGradeList";

	}

	/* 관리자 페이지 포인트 기준 내역 등록(get) */
	@GetMapping("/addPointGradeList")
	public String addPointGradeList(Model model) {

		List<PointSaveByGrade> pointGradeList = pointService.getPointGradeList();
		List<Point> pointList = pointService.getPointList();
		model.addAttribute("pointGradeList", pointGradeList);
		model.addAttribute("pointList", pointList);
		log.info("test : {}", "test");

		return "adminpage/pointDetails/addPointGradeList";
	}

	/* 관리자 페이지 포인트 기준 내역 조회 */
	@GetMapping("/pointGradeList")
	public String getPointGradeList(Model model) {

		List<PointSaveByGrade> pointGradeList = pointService.getPointGradeList();

		model.addAttribute("pointGradeList", pointGradeList);

		return "adminpage/pointDetails/pointGradeList";
	}

	/* 관리자 페이지 포인트 내역 날짜 별 조회 */
	@GetMapping("/getDatePointList")
	public String getDatePointList(Model model, @RequestParam(name = "startDate", required = false) String startDate,
			@RequestParam(name = "endDate", required = false) String endDate) {
		log.info("startDate", startDate);
		log.info("endDate", endDate);
		List<Point> getDatePointList = pointService.getDatePointList(startDate, endDate);
		model.addAttribute("pointList", getDatePointList);

		return "adminpage/pointDetails/pointList";
	}

	/* 관리자 페이지 포인트 내역 삭제 */
	@GetMapping("/removePointStandard")
	public String removePointStandard(String pointDetailsCode) {
		log.info("pointDetailsCode: {}", pointDetailsCode);
		pointService.removePointStandard(pointDetailsCode);

		return "redirect:/adminpage/pointDetails/pointList";
	}

	/* 관리자 페이지 수단 별 적립 검색 내역 조회 */
	@GetMapping("/meansPointList")
	public String meansPointList(Model model, @RequestParam(name = "searchKey", required = false) String searchKey,
			@RequestParam(name = "searchValue", required = false) String searchValue) {
		log.info("searchKey : {}", searchKey);
		log.info("searchValue : {}", searchValue);
		if (searchKey != null) {
			if (searchKey.indexOf("user_") > -1) {
				searchKey = "pa." + searchKey;
			} else if (searchKey.indexOf("point_") > -1) {
				searchKey = "pd." + searchKey;
			}
		}

		List<Point> pointList = pointService.meansPointList(searchKey, searchValue);
		model.addAttribute("pointList", pointList);
		return "/adminpage/pointDetails/pointList";
	}

	/* 관리자 페이지 회원 포인트 적립 내역 테이블 조회 */
	@GetMapping("/pointList")
	public String getPointList(Model model) {

		log.info("관리자 페이지 회원 포인트 적립 내역 테이블 조회 : {}", "test");
		List<Point> pointList = pointService.getPointList();

		model.addAttribute("pointList", pointList);

		return "adminpage/pointDetails/pointList";
	}

}