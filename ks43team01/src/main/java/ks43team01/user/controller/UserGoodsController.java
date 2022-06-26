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

import ks43team01.dto.Goods;
import ks43team01.dto.GoodsAll;
import ks43team01.dto.GoodsSubCategory;
import ks43team01.dto.GoodsTopCategory;
import ks43team01.service.GoodsAllService;

@Controller
@RequestMapping("/userpage/goods")
public class UserGoodsController {
	
	private static final Logger log = LoggerFactory.getLogger(UserGoodsController.class);
	
	public final GoodsAllService goodsAllService;
	
	public UserGoodsController(GoodsAllService goodsAllService) {
		this.goodsAllService = goodsAllService;
	}
	
	//상품 삭제
	@GetMapping("/removeUserGoods")
	public String removeUserGoods(@RequestParam(value= "goodsCode")String goodsCode) {
		
		//log.info("삭제  : {}" , goodsCode);
		goodsAllService.removeUserGoods(goodsCode);
		return "redirect:/userpage/goods/userGoodsList";
	}
	
	//개별 상품 보기
	@GetMapping("/goodsInfo")
	public String goodsInfo(@RequestParam(value = "goodsCode")String goodsCode, Model model) {
		
		GoodsAll goodsAll = goodsAllService.getGoodsInfoCode(goodsCode);
		//log.info("goodsAll :{}", goodsAll);
		model.addAttribute("goodsAll", goodsAll);
		return "/userpage/goods/goodsInfo" ;
		
	}
	
	//상품리스트
	@GetMapping("/userGoodsList")
	public String getUserGoodsList(Model model) {
		
		List<GoodsAll> userGoodsList = goodsAllService.getUserGoodsList();
		model.addAttribute("userGoodsList", userGoodsList);
		//log.info("상품리스트 : {}", userGoodsList);
		
		return "userpage/goods/userGoodsList";
	}
	
	//상품 등록
	@PostMapping("/addGoods")
	public String addGoods(HttpSession session
			,Goods goods
			,HttpServletRequest request) {
		
		//log.info("매출 등록 처리 sales : {}", sales);
		String sessionId = (String) session.getAttribute("UID");
		
		goodsAllService.addGoods(sessionId, goods);
		
		return "redirect:/userpage/goods/userGoodsList";
	}
	
	//상품 등록
	@GetMapping("/addGoods")
	public String addGoods(Model model) {
		
		List<GoodsAll> userGoodsList = goodsAllService.getUserGoodsList();
		List<GoodsTopCategory> goodsTopCategoryList = goodsAllService.getGoodsTopCategoryList();
		List<GoodsSubCategory> goodsSubCategoryList = goodsAllService.getGoodsSubCategoryList();
		
		model.addAttribute("userGoodsList", userGoodsList);
		model.addAttribute("goodsTopCategoryList", goodsTopCategoryList);
		model.addAttribute("goodsSubCategoryList", goodsSubCategoryList);
		//log.info("지출 등록 내역 : {}", salesList);
		
		return "userpage/goods/addGoods";
	}

}
