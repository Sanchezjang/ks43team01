package ks43team01.admin.controller;

import java.lang.ProcessBuilder.Redirect;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ks43team01.dto.User;
import ks43team01.dto.UserAgree;
import ks43team01.dto.UserAgreeDetails;
import ks43team01.dto.UserLog;
import ks43team01.service.UserService;

@Controller
@RequestMapping("adminpage/user")
public class AdminUserController {
	
	
	private static final Logger log = LoggerFactory.getLogger(AdminUserController.class);

	
	private final UserService userService;
	public AdminUserController(UserService userService) {
		this.userService = userService;
	}
	
	@GetMapping("/userList")//admin회원총리스트 가져오기//
	public String getAdminUserList(Model model) {
		List<User> userList = userService.getAdminUserList();
		model.addAttribute("userList", userList);
		log.info("회원리스트 잘들어왓는지 확인  :   {}", userList); 
		return "/adminpage/user/userList";
	}
	@GetMapping("/userLogDate")//admin로그인총이력//
	public String getLogDate(Model model) {
		
		List<UserLog> userLogDate = userService.getLogDate(); 
		model.addAttribute("userLogDate", userLogDate);
		log.info("userLogDate값   : {}" , userLogDate);
		return "/adminpage/user/userLogDate";
	}
	/*동의항목동의상세테이블*/
	@GetMapping("/userAgreeDetails")
	public String getUserAgreeDetails(Model model){
		List<UserAgreeDetails> agreeDetailsList = userService.getUserAgreeDetails();
		log.info("agreeDetailsList  :  {}",agreeDetailsList);
		model.addAttribute("agreeDetailsList", agreeDetailsList);
		return "/adminpage/user/userAgreeDetails";
	}
	@GetMapping("/userAgreeCheck")/*동의한회원별 동의로그남김*/
	public String getUserAgreeCheck(Model model){
		List<UserAgree> agreeCheckList = userService.getUserAgreeCheck();
		log.info("AgreeCheckList  :  {}",agreeCheckList);
		model.addAttribute("agreeCheckList", agreeCheckList);
		return "/adminpage/user/userAgreeCheck";
	}
	@GetMapping("/deleteLogList")//admin로그이력삭제//	
	public String removeLoginList(@RequestParam(name="loginNum", required = false)String loginNum) {
		int result = userService.removeLoginList(loginNum);
		return "redirect:/adminpage/user/userLogDate";
	}
	@GetMapping("/deleteUserList")//회원삭제///
	public String deleteUserList(@RequestParam(name="userIdCode", required = false)String userIdCode) {
		int result = userService.deleteUserList(userIdCode);
		return "redirect:/adminpage/user/userList";
	}
}
