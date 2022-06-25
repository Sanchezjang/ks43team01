package ks43team01.user.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ks43team01.dto.OrderCart;
import ks43team01.mapper.OrderCartMapper;

@Controller
public class OrderCartController {
		
		private static final Logger log = LoggerFactory.getLogger(OrderCartController.class);

	////DI///
	private final OrderCartMapper orderCartMapper;
	public OrderCartController(OrderCartMapper orderCartMapper) {
		this.orderCartMapper = orderCartMapper;
	}
	
	@GetMapping("/orderCart")
	public String addOderCartList(HttpSession session, Model model,OrderCart orderCart) {
		String userIdCode = (String) session.getAttribute("UID");
		orderCart.setUserIdCode(userIdCode);
		
		List<OrderCart> orderCartList = orderCartMapper.getOrderCartList(orderCart);
		model.addAttribute("orderCartList", orderCartList);
		log.info("가져오는 장바구니값  :  {}",orderCartList);
		
		return "userpage/order/orderCart";
	}
	@GetMapping("/removeOrderCart")
	public String removeOrderCart(String orderCartCode) {
		
		
		return "redirect:/orderCart";
	}
	
}
