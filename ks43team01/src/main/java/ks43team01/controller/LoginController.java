package ks43team01.controller;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ks43team01.dto.User;
import ks43team01.service.UserService;


@Controller
public class LoginController {

	
	private static final Logger log = LoggerFactory.getLogger(LoginController.class);

	
	private final UserService userService;
	
	public  LoginController(UserService userService) {
		this.userService = userService;
	}
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "index";
	}
	@GetMapping("/login")

	public String login() {
	
		return "userpage/user/login";
	}
	@PostMapping("/login")
	public String login(@RequestParam(name="userId",required = false)String userId
						,@RequestParam(name="userPw",required = false)String userPw
						,HttpSession session) {
		
		User user = userService.getUserInfoById(userId);
		log.info("user에서 받아온값 :   {}",user);

		if(user != null) {
			String userPwCheck = user.getUserPw();
			if(userPw != null && userPw.equals(userPwCheck)) {
				session.setAttribute("UID"   , userId);
				return "redirect:/";
		}
	}
	return "redirect:/login";
	}
	
}
