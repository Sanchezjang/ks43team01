package ks43team01.admin.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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

}