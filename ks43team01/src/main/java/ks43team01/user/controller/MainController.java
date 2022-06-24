package ks43team01.user.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ks43team01.dto.goodsTopCategory;
import ks43team01.service.UserService;

@Controller
public class MainController {
	
	private static final Logger log = LoggerFactory.getLogger(MainController.class);
	
	private final UserService userService;
	public MainController(UserService userService) {
		this.userService = userService;
	}

	@GetMapping("/test")
	public String index(Model model, goodsTopCategory goodsTopCategory){ 
		
		List<goodsTopCategory> expertBusinessField = userService.getTopCategory();
		model.addAttribute("topcategory",expertBusinessField);//탑카테고리 받아옴
		log.info("탑카테고리 받아온값   :   {}",expertBusinessField);
	
		return "userpage/goods/goodsRegistration";
	
	}
	
	
}
