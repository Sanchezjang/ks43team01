package ks43team01.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
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
						,HttpSession session,HttpServletRequest request) {
		
		log.info("session에서 받아온값 :   {}",request.getRemoteAddr());
		User user = userService.getUserInfoById(userId);
		log.info("user에서 받아온값 :   {}",user);

		if(user != null) {
			String userPwCheck = user.getUserPw();
			if(userPw != null && userPw.equals(userPwCheck)) {
				session.setAttribute("UID"   , userId);
				Date loginTime = new Date();
				SimpleDateFormat format1 = new SimpleDateFormat("yyyy-mm-dd");
				log.info("로그인시간찍기:   {}", format1.format(loginTime));
				return "redirect:/";
		}
	}
	return "redirect:/login";
	}
	
}
