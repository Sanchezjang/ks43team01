package ks43team01.user.controller;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ks43team01.dto.Goods;
import ks43team01.service.GoodsService;
@Controller
public class GoodsController {

	private static final Logger log = LoggerFactory.getLogger(GoodsController.class);
	
	public final GoodsService goodsService;
	
	public GoodsController(GoodsService goodsService) {
		this.goodsService = goodsService;
	}
	
	
	/* 3. 디자인카테고리 상품리스트*/
	@GetMapping("/designBoardList")
	public String getDesignBoardList(Model model) {
		List<Goods> designBoardList = goodsService.getDesignBoardList();
		log.info("design카테고리 상품 목록: {}", designBoardList);
		model.addAttribute("designBoardList", designBoardList);
		
		return "userpage/goods/designBoardList";
	}
}
