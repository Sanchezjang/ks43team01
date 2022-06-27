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
import ks43team01.dto.GoodsSubCategory;
import ks43team01.dto.GoodsTopCategory;
import ks43team01.service.GoodsService;

@Controller
@RequestMapping("/userpage/goods")
public class UserGoodsController {
	
	private static final Logger log = LoggerFactory.getLogger(UserGoodsController.class);
	
	public final GoodsService goodsService;
	
	public UserGoodsController(GoodsService goodsService) {
		this.goodsService = goodsService;
	}
	
	//상품 삭제
	@GetMapping("/removeUserGoods")
	public String removeUserGoods(@RequestParam(value= "goodsCode")String goodsCode) {
		
		//log.info("삭제  : {}" , goodsCode);
		goodsService.removeUserGoods(goodsCode);
		return "userpage/goods/removeUserGoods";
	}
	
	//개별 상품 보기
	@GetMapping("/goodsInfo")
	public String goodsInfo(@RequestParam(value = "goodsCode")String goodsCode, Model model) {
		
		Goods goods = goodsService.getGoodsInfoCode(goodsCode);
		//log.info("goods :{}", goods);
		model.addAttribute("goods", goods);
		return "userpage/goods/goodsInfo" ;
		
	}
	
	//상품리스트
	@GetMapping("/userGoodsList")
	public String getUserGoodsList(Model model) {
		
		List<Goods> userGoodsList = goodsService.getUserGoodsList();
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
		
		goodsService.addGoods(sessionId, goods);
		
		return "redirect:/userpage/goods/userGoodsList";
	}
	
	//상품 등록
	@GetMapping("/addGoods")
	public String addGoods(Model model) {
		
		List<Goods> userGoodsList = goodsService.getUserGoodsList();
		List<GoodsTopCategory> goodsTopCategoryList = goodsService.getGoodsTopCategoryList();
		List<GoodsSubCategory> goodsSubCategoryList = goodsService.getGoodsSubCategoryList();
		
		model.addAttribute("userGoodsList", userGoodsList);
		model.addAttribute("goodsTopCategoryList", goodsTopCategoryList);
		model.addAttribute("goodsSubCategoryList", goodsSubCategoryList);
		//log.info("지출 등록 내역 : {}", salesList);
		
		return "userpage/goods/addGoods";
	}

}
