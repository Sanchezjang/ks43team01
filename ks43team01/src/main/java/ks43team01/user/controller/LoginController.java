package ks43team01.user.controller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ks43team01.dto.User;
import ks43team01.dto.UserLevelExp;
import ks43team01.dto.UserLog;
import ks43team01.service.UserLevelExpService;
import ks43team01.service.UserService;


@Controller
@RequestMapping("/userpage/login")
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
						,HttpSession session,HttpServletRequest request,UserLog userLog,UserLevelExp userLevelExp,User user) {
		User user1 = userService.getUserInfoById(userId);
		
		log.info("user에서 받아온값 :   {}",user);

		if(user != null) {
			String userPwCheck = user.getUserPw();
			if(userPw != null && userPw.equals(userPwCheck)) {
				session.setAttribute("UID"   , userId);
				session.setAttribute("UNAME"   , user1.getUserName());
				String loginUserIp = request.getRemoteAddr();
				userLog.setLoginIp(loginUserIp);
				userLog.setUserIdCode(userId);
				userLevelExp.setUserIdCode(userId);
				log.info("로그기록 남기기!!!!",userLog);
				userService.addUserLog(userLog);
				userService.addUserLevelExp(userLevelExp);
				return "redirect:/";
		}
	}
	return "redirect:/login";
	}
	
}
