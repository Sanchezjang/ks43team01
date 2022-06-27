package ks43team01.user.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ks43team01.dto.OrderCart;
import ks43team01.service.OrderCartService;

@Controller
public class OrderCartController {
		
		private static final Logger log = LoggerFactory.getLogger(OrderCartController.class);

	////DI///
	private final OrderCartService orderCartService;
	public OrderCartController(OrderCartService orderCartService) {
		this.orderCartService = orderCartService;
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
	@GetMapping("/removeOrderCart")
	public String removeOrderCart(@RequestParam(value = "odercartcode" OrderCart orderCart) {
		orderCartService.removeOrderCart(orderCart.getOrderCartCode());
		
		log.info("삭제 아이디 받아 오는지 :  {}",orderCart.getOrderCartCode());
		return "redirect:/orderCart";
	}
	
}
