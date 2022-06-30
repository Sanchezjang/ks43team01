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

import ks43team01.dto.OrderCart;
import ks43team01.dto.OrderCurrent;
import ks43team01.dto.OrderStatusComplete;
import ks43team01.dto.User;
import ks43team01.service.OrderCartService;
import ks43team01.service.OrderService;
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
	public String orderCheck(@RequestBody List<Map<String, Object>> checkOrder,OrderCart orderCart, HttpSession session, OrderCart user, Model model) {
		return "userpage/order/addOrderCurrentStatus";
	}
	/*장바구니에서 체크한 상품만 주문으로 이동하며,주문인정사항불러오기*/
	@GetMapping("/orderCheck1")
	public String orderCheck1(Model model,User user,HttpSession session,OrderCart orderCart) {
		String userIdCode = (String) session.getAttribute("UID");
		orderCart.setUserIdCode(userIdCode);
		List<OrderCart> orderCartList = orderCartService.getOrderCartList(orderCart);
		model.addAttribute("orderCartList", orderCartList);
		log.info("주문값 들어오는지 확인!!   :   {}",orderCartList);
		User userList = userService.getUserInfoById(userIdCode);
		model.addAttribute("userList", userList);
		log.info("주문자 정보 받아오는지 출력!!  :  {}",userList);
		return "userpage/order/addOrderCurrentStatus";
	}
	/*주문내역을포스트맵핑으로 보냄 13번 테이블로 정보를 쌓는다.*/
	@PostMapping("/orderSuccess")
	public String orderSuccess(Model model,OrderCurrent orderCurrent,HttpSession session, OrderCart orderCart){
		String userIdCode = (String) session.getAttribute("UID");
		orderCurrent.setUserIdCode(userIdCode);
		log.info("????!!!!-------:{}",11);
		orderCartService.addOrderCurrent(orderCurrent);
		model.addAttribute("orderCurrentID",orderCurrent.getOrderCode());
		return "userpage/order/orderSuccess";
	}
	/*주문>결제시 13번 테이블로 인썰트되는정보*/
	@GetMapping("/orderSuccess")
	public String orderSuccess(HttpSession session,User user) {
	 String userIdCode = (String) session.getAttribute("UID");
		user.setUserIdCode(userIdCode);
		return "userpage/order/orderSuccess";
	}
	/*주문>결제완료시 15번 테이블로 인썰트되는정보 처리후 이동경로 잡아줘야함!!!!*/
	@PostMapping("/orderComplate")
	public String orderComplate1(OrderStatusComplete orderStatusComplete) {
		orderCartService.addOrderStatusComplete(orderStatusComplete);
		return "userpage/user/login";
	}
	@GetMapping("/orderComplate")
	public String orderComplate(Model model, OrderStatusComplete orderStatusComplete,OrderCurrent orderCurrent) {
		List<OrderCurrent> complateList = orderCartService.getOrderCurrent(null);
		model.addAttribute("complateList", complateList);
		log.info("출력잘되는지   :   {}",complateList);
		return "userpage/user/login";
	}
}
