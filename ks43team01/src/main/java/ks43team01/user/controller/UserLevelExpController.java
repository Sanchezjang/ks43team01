package ks43team01.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import ks43team01.dto.UserLevelExp;
import ks43team01.service.UserLevelExpService;

@Controller
public class UserLevelExpController {
	
	//DI//주입
	private final UserLevelExpService userLevelExpService;
	public UserLevelExpController(UserLevelExpService userLevelExpService) {
	
		this.userLevelExpService = userLevelExpService;
	}
	
	public String addUserLevelExp(UserLevelExp userLevelExp) {
		
		userLevelExpService.addUserLevelExp(userLevelExp);
		
		return "/";
	}
}
