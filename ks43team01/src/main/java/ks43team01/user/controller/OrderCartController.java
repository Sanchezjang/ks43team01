package ks43team01.user.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import groovyjarjarantlr.Lookahead;
import ks43team01.dto.OrderCart;
import ks43team01.dto.User;
import ks43team01.service.OrderCartService;
import ks43team01.service.UserService;

@Controller
public class OrderCartController {
		
		private static final Logger log = LoggerFactory.getLogger(OrderCartController.class);

	////DI///
	private final OrderCartService orderCartService;
	private final UserService userService;
	public OrderCartController(OrderCartService orderCartService,UserService userService) {
		this.orderCartService = orderCartService;
		this.userService = userService;
	}
	/* 사용자화면 장바구니 리스트 출력 */
	@GetMapping("/orderCart")
	public String addOderCartList(HttpSession session, Model model,OrderCart orderCart) {
		String userIdCode = (String) session.getAttribute("UID");
		orderCart.setUserIdCode(userIdCode);
		List<OrderCart> orderCartList =orderCartService.getOrderCartList(orderCart);
		model.addAttribute("orderCartList", orderCartList);
		log.info("가져오는 장바구니값  :  {}",orderCartList);
		session.setAttribute("OrderCart", orderCart);
		
		return "userpage/order/orderCart";
	}
	/* 사용자화면 장바구니 삭제로직 */
	@GetMapping("/removeOrderCart")
	public String removeOrderCart(@RequestParam("orderCartCode")String ocCode) {
		orderCartService.removeOrderCart(ocCode);
		log.info("삭제 아이디 받아 오는지 :  {}",ocCode);
		return "redirect:/orderCart";
	}
	/* 사용자화면 장바구니 전체삭제(비우기) */
	@GetMapping("/removeAllOrderCart")
	public String removeAllOrderCart(@RequestParam("userIdCode")String userIdCode) {
		orderCartService.removeAllOrderCart(userIdCode);
		return "redirect:/orderCart";
	}
	/*사용자가 선택한 제품만 주문으로 이동*/
	@PostMapping("/orderCheck")
	@ResponseBody
	public String orderCheck(@RequestBody List<Map<String, Object>> checkOrder,OrderCart orderCart) {
		log.info("선택한주문 들어왔는지 확인:   {}",checkOrder);
	for(int i=0; i<checkOrder.size(); i++) {
		for(Map<String, Object> map : checkOrder){
			Map<String, Object>	check=checkOrder.get(i);
			        log.info("밸류값  : {}",check.values());
		}
	}
		
		return "userpage/order/addOrderCurrentStatus";
	}
	@GetMapping("/orderCheck1")
	public String orderCheck1(Model model,User user,HttpSession session) {
		String userIdCode = (String) session.getAttribute("UID");
		user.setUserIdCode(userIdCode);
		User userList = userService.getUserInfoById(userIdCode);
		model.addAttribute("userList", userList);
		log.info("주문자 정보 받아오는지 출력!!  :  {}",userList);
		return "userpage/order/addOrderCurrentStatus";
	}
}
