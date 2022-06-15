package ks43team01.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

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
import ks43team01.dto.User;
import ks43team01.dto.goodsSubCategory;
import ks43team01.dto.goodsTopCategory;
import ks43team01.service.UserService;

@Controller
public class UserController {
	
	private static final Logger log = LoggerFactory.getLogger(UserController.class);

	//DI//
	private final UserService userService;
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
	@PostMapping("/userjoin") //회원가입시겟맵핑 잡아주는거//
	public String addUserInsert(User user,HttpSession session) {
	
		userService.addUserInsert(user);
		log.info("받아온멤버",user);
		session.setAttribute("CheckId", user.getUserId());//세션에 있는 정보를 입력한정보가 맞는지 확인//
		session.setAttribute("CheckName", user.getUserName());
		session.setAttribute("CheckPhone", user.getUserContact());
		session.setAttribute("CheckEmail", user.getUserEmail());
		session.setAttribute("CheckArea", user.getUserArea());
		return "userpage/userjoinCheck";
	}
	
	@GetMapping("/sellerjoin")//가입내역을 확인하고 판매자회원추가진행로
	public String userInsertCheck(Model model) {
		
		List<goodsTopCategory> topcategory = userService.getTopCategory();
		model.addAttribute("topcategory",topcategory);//탑카테고리 받아옴
		log.info("탑카테고리들어온값   :{}",topcategory);
		return "userpage/user/sellerjoin";
	}
	@PostMapping("/getCategory")//탑카테고리잡아서 서브 카테고리 출력
	@ResponseBody
	public List<goodsSubCategory> getSubCategory(@RequestParam(name="topCategory")String topCategory) {
		List<goodsSubCategory> scategory = userService.getSubCategory(topCategory);
		log.info("서브카테고리받아온값제이즌  :{}", scategory);
		return scategory;
	}
	
	@PostMapping("/sellerBusiness")
	public String addSellerBusiness(SellerBusiness sellerBusiness,Model model,HttpSession session) {
		session.setAttribute("userId", sellerBusiness.getUserIdCode());
		userService.addSellerBusiness(sellerBusiness);
		log.info("셀러비지니스분야입력   :{}",sellerBusiness);
		return "/sellerCareer";
		
	}
	
}
