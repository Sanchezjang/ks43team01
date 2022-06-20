package ks43team01.user.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;
import javax.xml.ws.http.HTTPBinding;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import ks43team01.dto.SellerBusiness;
import ks43team01.dto.SellerCareer;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import ks43team01.dto.SellerBusiness;
import ks43team01.dto.SellerCareer;
import ks43team01.dto.SellerEducation;
import ks43team01.dto.User;
import ks43team01.dto.UserLog;
import ks43team01.dto.goodsSubCategory;
import ks43team01.dto.goodsTopCategory;
import ks43team01.service.UserService;

@Controller
public class UserController {
	
	
	
	private static final Logger log = LoggerFactory.getLogger(UserController.class);

	//DI//
	private final UserService userService;

	private Object userIdCode;
	public UserController(UserService userService) {
		this.userService = userService;
	}
	@GetMapping("/user/main")
	public String userMain() {
		return "userpage/main_user";
	}
	
	@GetMapping("/userjoin") //회원가입시겟맵핑 잡아주는거//
	public String addUserInsert() {
		
		return "userpage/user/userjoin";
	}
	/*@PostMapping("/userjoin") //회원가입시겟맵핑 잡아주는거//
	public String addUserInsert(User user,HttpSession session) {
	
		userService.addUserInsert(user);
		log.info("받아온멤버",user);
		session.setAttribute("UID", user.getUserId());//세션에 있는 정보를 입력한정보가 맞는지 확인//
		session.setAttribute("CheckName", user.getUserName());
		session.setAttribute("CheckPhone", user.getUserContact());
		session.setAttribute("CheckEmail", user.getUserEmail());
		session.setAttribute("CheckArea", user.getUserArea());
		return "userpage/user/userjoinCheck";
	}*/
	@GetMapping("/adminpage/user/userList")//admin회원총리스트 가져오기//
	public String getAdminUserList(Model model) {
		List<User> userList = userService.getAdminUserList();
		log.info("회원리스트 잘들어왓는지 확인  :   {}", userList); 
		model.addAttribute("userList", userList);
		
		return "/adminpage/user/userList";
	}
	@GetMapping("/adminpage/user/userLogDate")//admin로그인총이력//
	public String getLogDate(Model model) {
		
		List<UserLog> userLogDate = userService.getLogDate(); 
		
		model.addAttribute("userLogDate", userLogDate);
		log.info("userLogDate값   : {}" , userLogDate);
		return "/adminpage/user/userLogDate";
	}
	
	@GetMapping("/sellerjoin")// 판매자회원추가진행로
	public String userInsertCheck(Model model) {
		
		List<goodsTopCategory> expertBusinessField = userService.getTopCategory();
		model.addAttribute("topcategory",expertBusinessField);//탑카테고리 받아옴
		log.info("탑카테고리들어온값   :{}",expertBusinessField);
		return "userpage/user/sellerjoin";
	}
	@GetMapping("/getCategory")//탑카테고리잡아서 서브 카테고리 출력
	@ResponseBody
	public List<goodsSubCategory> getSubCategory(@RequestParam(name="expertBusinessField")String expertBusinessField) {
		List<goodsSubCategory> scategory = userService.getSubCategory(expertBusinessField);
		log.info("서브카테고리받아온값제이즌  :{}", scategory);
		return scategory;
	}
	
	@PostMapping("/sellerBusiness")////판매자 비지니스 내용 제출폼..//
	public String addSellerBusiness(SellerBusiness sellerBusiness,HttpSession session) {
		session.setAttribute("userIdCode",sellerBusiness.getUserIdCode());
		
		log.info("셀러비지니스분야입력   :{}",sellerBusiness);
		log.info("세션아이디 받아오는지  :  {}", userIdCode);
		userService.addSellerBusiness(sellerBusiness);
		return "userpage/user/sellerBusiness";
	}
	@GetMapping("/sellerBusiness")
	public String addSellerBusiness() {
		return "userpage/user/sellerCareer";
	}
	//판매자 근무이력 null처리
		@GetMapping("/nullSellerCareer")
		public String nullSellerCareer(SellerCareer sellerCareer,HttpSession session) {
			String UID =  (String)session.getAttribute("UID");
			sellerCareer.setUserIdCode(UID);
			userService.nullSellerCareer(sellerCareer);
			
			return "userpage/user/sellerEducation";
		}
	
	@PostMapping("/sellerEducation")//판매자 커리어 전달받음(이미지파일도 첨부완)//
	public String addSellerCareer(SellerCareer sellerCareer,HttpSession session,HttpServletRequest request) {
		String UID =  (String)session.getAttribute("UID");
		sellerCareer.setUserIdCode(UID);
		String downFile = request.getParameter("expertCareerProofMattersAttachments");
		log.info("파일값받아오는지  :  {}",downFile);
		log.info("세션아이디 받아오는지  :  {}",UID);
		userService.addSellerCareer(sellerCareer);
		return "userpage/user/sellerEducation";
	}
	@GetMapping("/sellerEducation")
		public String addSellerCareer() {
			return "userpage/user/sellerEducation";
	}
	@GetMapping("/nullSellerComplete")//학력처리 null처리//
	public String NullSellerEducation(SellerEducation sellerEducation,HttpSession session) {
		
		String UID =  (String)session.getAttribute("UID");
		sellerEducation.setUserIdCode(UID);
		userService.NullSellerEducation(sellerEducation);
		log.info("학력null값   ; {}",sellerEducation);
		
		return "userpage/user/login"; 
	}
	@PostMapping("/sellerComplete")//판매자 학력사항 전달받음(이미지파일도 첨부완)//
	public String addSellerEducation(SellerEducation sellerEducation,HttpSession session,HttpServletRequest request) {
		String UID =  (String)session.getAttribute("UID");
		sellerEducation.setUserIdCode(UID);
		String downFile = request.getParameter("expertAcademicDocument");
		log.info("파일값받아오는지  :  {}",downFile);
		log.info("세션아이디 받아오는지  :  {}",UID);
		userService.SellerEducation(sellerEducation);
		log.info("sellerEducation분야입력   :{}",sellerEducation);
		return "userpage/user/login";
	}
	@GetMapping("/userinfomation")
	public String getUserInfomation(){
		
		return "userpage/user/userinfomation";
	}
	@PostMapping("/idCheck")////아이디 중복체크!!!!!
	@ResponseBody
	public boolean CheckId(@RequestParam(name = "userId")String userId) {
			
		log.info("아이디 중복체크 : {}", userId);

		boolean isIdCheck = true;
		
		User user = userService.getUserInfoById(userId);
		
		if(user != null) {
			isIdCheck = false;
		}
		return isIdCheck;
	}
	
	
		
	
}
