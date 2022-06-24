package ks43team01.user.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ks43team01.dto.Goods;
import ks43team01.service.GoodsService;

@Controller
public class UserGoodsController {
	
	private static final Logger log = LoggerFactory.getLogger(UserGoodsController.class);
	
	public final GoodsService goodsService;
	
	public UserGoodsController(GoodsService goodsService) {
		this.goodsService = goodsService;
	}
	
	//매출 내역
	@GetMapping("/List")
	public String getUserGoodsList(Model model) {
		
		List<Goods> userGoodsList = goodsService.getUserGoodsList();
		//log.info("매출 내역 : {}", salesList);
		model.addAttribute("userGoodsList", userGoodsList);
		
		return "userpage/goods/userGoodsList";
	}

}