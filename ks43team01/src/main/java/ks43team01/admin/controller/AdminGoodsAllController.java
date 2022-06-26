package ks43team01.admin.controller;

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

import ks43team01.dto.GoodsAll;
import ks43team01.dto.GoodsSubCategory;
import ks43team01.dto.GoodsTopCategory;
import ks43team01.service.GoodsAllService;

@Controller
@RequestMapping("/adminpage/goods")
public class AdminGoodsAllController {
	
	private static final Logger log = LoggerFactory.getLogger(AdminGoodsAllController.class);

	//DI (의존성 주입)
	// 3. 생성자 메서드 주입방식
	private final GoodsAllService goodsAllService;
	
	public AdminGoodsAllController(GoodsAllService goodsAllService) {
		this.goodsAllService = goodsAllService;
	}
	
	//상품 삭제
	@GetMapping("/removeAdminGoods")
	public String removeAdminGoods(String goodsCode) {
		
		//log.info("삭제  : {}" , goodsCode);
		goodsAllService.removeAdminGoods(goodsCode);
		return "adminpage/goods/removeAdminGoods";
	}
	
	//개별 상품 보기
	@GetMapping("/goodsInfo")
	public String goodsInfo(@RequestParam(value = "goodsCode")String goodsCode, Model model) {
		
		GoodsAll goodsAll = goodsAllService.getGoodsInfoCode(goodsCode);
		//log.info("goodsAll :{}", goodsAll);
		model.addAttribute("goodsAll", goodsAll);
		return "/userpage/goods/goodsInfo" ;
		
	}
	
	//상품 리스트
	@GetMapping("/adminGoodsList")
	public String getAdminGoodsList(Model model) {
		
		List<GoodsAll> adminGoodsList = goodsAllService.getAdminGoodsList();
		//log.info("매출 내역 : {}", adminGoodsList);
		model.addAttribute("adminGoodsList", adminGoodsList);
		
		return "adminpage/goods/adminGoodsList";
	}
	
	//상품 하위 카테고리 삭제
	@GetMapping("/removeGoodsSubCategory")
	public String removeGoodsSubCategory(String goodsSubCategoryCode) {
		
		//log.info("삭제 : {}" , goodsSubCategoryCode);
		goodsAllService.removeGoodsSubCategory(goodsSubCategoryCode);
		return "adminpage/goods/removeGoodsSubCategory";
	}

	//상품 하위 카테고리 리스트
	@GetMapping("/goodsSubCategoryList")
	public String getGoodsSubCategoryList(Model model) {
		
		List<GoodsSubCategory> goodsSubCategoryList = goodsAllService.getGoodsSubCategoryList();
		//log.info("상품 하위 카테고리 : {}", goodsSubCategoryList);
		model.addAttribute("goodsSubCategoryList", goodsSubCategoryList);
		
		return "adminpage/goods/goodsSubCategoryList";
	}
	
	//상품 상위 카테고리 리스트
	@GetMapping("/goodsTopCategoryList")
	public String getGoodsTopCategoryList(Model model) {
		
		List<GoodsTopCategory> goodsTopCategoryList = goodsAllService.getGoodsTopCategoryList();
		//log.info("상품 상위 카테고리 : {}", goodsTopCategoryList);
		model.addAttribute("goodsTopCategoryList", goodsTopCategoryList);
		
		return "adminpage/goods/goodsTopCategoryList";
	}
	
	//상품 하위 카테고리 등록
	@PostMapping("/addGoodsSubCategory")
	public String addGoodsSubCategory(HttpSession session
			,GoodsSubCategory goodsSubCategory
			,HttpServletRequest request) {
		
		//log.info("매출 등록 처리 sales : {}", sales);
		String sessionId = (String) session.getAttribute("UID");
		
		goodsAllService.addGoodsSubCategory(sessionId, goodsSubCategory);

			return "redirect:/adminpage/goods/goodsSubCategoryList";

	}

	//상품 하위 카테고리 등록
	@GetMapping("/addGoodsSubCategory")
	public String addGoodsSubCategory(Model model) {
		
		List<GoodsSubCategory> goodsSubCategoryList = goodsAllService.getGoodsSubCategoryList();
		List<GoodsTopCategory> goodsTopCategoryList = goodsAllService.getGoodsTopCategoryList();
		
		model.addAttribute("goodsSubCategoryList", goodsSubCategoryList);
		model.addAttribute("goodsTopCategoryList", goodsTopCategoryList);
		
		return "adminpage/goods/addGoodsSubCategory";
	}
	
	//상품 상위 카테고리 등록
	@PostMapping("/addGoodsTopCategory")
	public String addGoodsTopCategory(HttpSession session
			,GoodsTopCategory goodsTopCategory
			,HttpServletRequest request) {
		
		//log.info("매출 등록 처리 sales : {}", sales);
		String sessionId = (String) session.getAttribute("UID");
		
		goodsAllService.addGoodsTopCategory(sessionId, goodsTopCategory);
		
		return "redirect:/adminpage/goods/goodsTopCategoryList";
		
	}
	
	//상품 상위 카테고리 등록
	@GetMapping("/addGoodsTopCategory")
	public String addGoodsTopCategory(Model model) {
		
		List<GoodsTopCategory> goodsTopCategoryList = goodsAllService.getGoodsTopCategoryList();
		
		model.addAttribute("goodsTopCategoryList", goodsTopCategoryList);
		
		return "adminpage/goods/addGoodsTopCategory";
	}
	
}