package ks43team01.user.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ks43team01.dto.GoodsReg;
import ks43team01.service.GoodsRegService;

@Controller
public class OrderCancleController {
	
	
	private static final Logger log = LoggerFactory.getLogger(OrderCancleController.class);

	
	private final GoodsRegService goodsRegService;///의존성 주입///
	public OrderCancleController(GoodsRegService goodsRegService) {
		this.goodsRegService = goodsRegService;
	}
	
	/*
	 * @GetMapping("/orderCancle") public String oderCancle(Model model) {
	 * List<GoodsReg> goodsReg = goodsRegService.orderCancle();
	 * model.addAttribute("goodsReg", goodsReg);
	 * log.info("goodsReg  :  {}",goodsReg); return "redirect:/"; }
	 */
	
}
