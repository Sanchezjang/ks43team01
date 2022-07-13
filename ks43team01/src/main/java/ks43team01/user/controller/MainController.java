package ks43team01.user.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import ks43team01.dto.GoodsSubCategory;
import ks43team01.dto.GoodsTopCategory;
import ks43team01.service.GoodsService;
import ks43team01.service.UserService;

@RestController
public class MainController {
	
	private static final Logger log = LoggerFactory.getLogger(MainController.class);
	
	private final GoodsService goodsService;

	public MainController(GoodsService goodsService) {
		this.goodsService = goodsService;
	}

	@GetMapping("/topCategory")
	public List<GoodsTopCategory> getTopCategory(){ 

		List<GoodsTopCategory> goodsTopCategory = goodsService.getGoodsTopCategory();
		
		return goodsTopCategory;
	
	}
	
	@GetMapping("/subCategory")
	public List<GoodsSubCategory> getSubCategory(@RequestParam(name="goodsTopCategoryCode", required = false) String goodsTopCategoryCode){ 
		
		List<GoodsSubCategory> goodsSubCategory = goodsService.getGoodsSubCategory(goodsTopCategoryCode);

		return goodsSubCategory;
		
	}
}
