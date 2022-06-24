package ks43team01.user.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ks43team01.dto.Goods;
import ks43team01.service.GoodsService;

@Controller
@RequestMapping("/userpage/goods")
public class UserGoodsController {
	
	private static final Logger log = LoggerFactory.getLogger(UserGoodsController.class);
	
	public final GoodsService goodsService;
	
	public UserGoodsController(GoodsService goodsService) {
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
	@GetMapping("/goodsRegistration")
	public String addGoodsRegistration() {
		
		
		
		return "userpage/goods/userGoodsList";
	}

}
