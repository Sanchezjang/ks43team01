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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
	
	//상품 수정
	@PostMapping("/modifyGoods")
	public String modifyGoods(Goods goods
			,RedirectAttributes reAttr) {
		log.info("goods: {}", goods);
		
		goodsService.modifyGoods(goods);
		String goodsCode = goods.getGoodsCode();
		reAttr.addAttribute("goodsCode", goodsCode);
		return "redirect:/userpage/goods/userGoodsList";
	}
	
	//상품 수정
	@GetMapping("/modifyGoodsInfo")
	public String modifyGoods(@RequestParam(value="goodsCode", required= false)String goodsCode
			,Model model) {
		
		log.info("123 {}", goodsCode);
		Goods goods = goodsService.getModifyGoodsInfoCode(goodsCode);
		List<GoodsTopCategory> goodsTopCategory = goodsService.getGoodsTopCategory();
		
		log.info("goods {}", goods);
		
		model.addAttribute("goods", goods);
		model.addAttribute("goodsTopCategory", goodsTopCategory);
		
		return "userpage/goods/modifyGoodsInfo";
	}
		
	//상품 등록
	@PostMapping("/addGoods")
	public String addGoods(HttpSession session
			,Goods goods
			,HttpServletRequest request) {
		
		//log.info("상품 등록 처리 goods : {}", goods);
		String sessionId = (String) session.getAttribute("UID");
		
		goodsService.addGoods(sessionId, goods);
		
		return "redirect:/userpage/goods/userGoodsList";
	}
	
	//상품 등록
	@GetMapping("/addGoods")
	public String addGoods(Model model) {
		
		List<Goods> userGoodsList = goodsService.getUserGoodsList();
		List<GoodsTopCategory> goodsTopCategory = goodsService.getGoodsTopCategory();
		
		model.addAttribute("userGoodsList", userGoodsList);
		model.addAttribute("goodsTopCategory", goodsTopCategory);
		log.info("상위 카테고리  :{}", goodsTopCategory);
		
		return "userpage/goods/addGoods";
	}
	
	//상위카테고리에 해당하는 하위카테고리 불러오기
	@GetMapping("/getGoodsSubCategory")
	@ResponseBody
	public List<GoodsSubCategory> getGoodsSubCategory(@RequestParam(name="goodsTopCategoryName")String goodsTopCategory) {
		
		log.info("서브카테고리받아온값제이즌  :{}", goodsTopCategory);
		List<GoodsSubCategory> getGoodsSubCategory = goodsService.getGoodsSubCategory(goodsTopCategory);
		return getGoodsSubCategory;
	}

}
