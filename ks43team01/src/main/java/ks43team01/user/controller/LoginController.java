package ks43team01.user.controller;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.Cookie;
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
		return "redirect:/";
	}
	@GetMapping("/login")

	public String login() {
	
		return "userpage/user/login";
	}
	@PostMapping("/login")
	public String login(@RequestParam(name="userId",required = false)String userId
						,@RequestParam(name="userPw",required = false)String userPw	
						,HttpSession session,HttpServletRequest request,UserLog userLog,UserLevelExp userLevelExp,User user, HttpServletResponse response) throws IOException {
		Cookie cookie = new Cookie("name","sonny");
		cookie.setMaxAge(60*60);
		response.addCookie(cookie);
		User user1 = userService.getUserInfoById(userId);
		String OS =	System.getProperty("os.version");
		log.info("운영체제 출력   :   {}",OS);
		String  userAgent = request.getHeader("User-Agent");
		log.info("브라우져 기록하기!!!  : {}",userAgent);
		log.info("user에서 받아온값 :   {}",user1);
	
		if(user1 != null) {
			String userPwCheck = user1.getUserPw();
			if(userPw != null && userPw.equals(userPwCheck)) {
				session.setAttribute("UID"   , userId);
				session.setAttribute("UNAME"   , user1.getUserName());
				String loginUserIp = request.getRemoteAddr();
				userLog.setLoginIp(loginUserIp);
				userLog.setUserIdCode(userId);
				userLevelExp.setUserIdCode(userId);
				log.info("로그기록 남기기!!!!",userLog);
				userService.addUserLog(userLog, request);
				userService.addUserLevelExp(userLevelExp);
				log.info("request값  :  {}",request);
				
				String requestUri = request.getRequestURI();
				String preUri = (String) session.getAttribute("PRE_ADDR");
				log.info("preUri session 후::: {}", preUri);
				log.info("session pre session 후::: {}", requestUri);
				
				if(preUri != null && !requestUri.equals(preUri)) return "redirect:" + preUri;
				Cookie cookies = new Cookie("name","sanchez");
			    ((HttpServletResponse) response).addCookie(cookies);
			    log.info("--------------cookies쿠키만들어졌는지????!!!  : {}=-----------------",cookies);
			    log.info("cookies쿠키유효기간 : {}",cookies.getMaxAge());
			    log.info("cookies/getComment  : {}",cookies.getComment());
			    log.info("cookies/getDomain  : {}",cookies.getDomain());
			    log.info("cookies/getName  : {}",cookies.getName());
			    log.info("cookies/getPath  : {}",cookies.getPath());
			    log.info("cookies/getValue  : {}",cookies.getValue());
			    log.info("cookies/getSecure  : {}",cookies.getSecure());
			    log.info("cookies/getVersion  : {}",cookies.getVersion());
				return "redirect:/";
			}
		}
		response.setCharacterEncoding("UTF-8");/*테스트를 위한 작업..궁금했음...*/
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<script>alert('아이디 또는 비밀번호를 확인해주세요~!'+'&'); self.close();</script>");
		out.flush();
		return "userpage/user/login";
	}
	
}
