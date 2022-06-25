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

import ks43team01.dto.Goods;
import ks43team01.service.GoodsAllService;

@Controller
@RequestMapping("/userpage/goods")
public class UserGoodsController {
	
	private static final Logger log = LoggerFactory.getLogger(UserGoodsController.class);
	
	public final GoodsAllService goodsService;
	
	public UserGoodsController(GoodsAllService goodsService) {
		this.goodsService = goodsService;
	}
	
	//상품리스트 가져오기///
	@GetMapping("/userGoodsList")
	public String getUserGoodsList(Model model) {
		
		List<Goods> userGoodsList = goodsService.getUserGoodsList();
		model.addAttribute("userGoodsList", userGoodsList);
		log.info("상품리스트 : {}", userGoodsList);
		
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
		
		model.addAttribute("userGoodsList", userGoodsList);
		//log.info("지출 등록 내역 : {}", salesList);
		
		return "userpage/goods/addGoods";
	}

}
