package ks43team01.user.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ks43team01.dto.OrderCurrentStatus;
import ks43team01.dto.OrderStatusStandard;
import ks43team01.service.OrderService;

@Controller
@RequestMapping("/userpage/order")
public class OrderController {

	private static final Logger log = LoggerFactory.getLogger(OrderController.class);

	public final OrderService orderService;

	public OrderController(OrderService orderService) {
		this.orderService = orderService;
	}

	/*
	 * 현재 상품 주문 현황 등록 (post)
	 * 
	 * @PostMapping("/addOrderCurrentStatus") public String
	 * addOrderCurrentStatus(HttpSession session , OrderCurrentStatus
	 * orderCurrentStatus , HttpServletRequest request) { String sessionId =
	 * (String) session.getAttribute("UID");
	 * orderService.addOrderCurrentStatus(sessionId, orderCurrentStatus);
	 * 
	 * return "redirect:/userpage/order/addOrderCurrentStatus"; }
	 */
	/* 현재 상품 주문 현황 등록 (get) */
	@GetMapping("/addOrderCurrentStatus")
	public String addOrderCurrentStatus(Model model) {
		List<OrderCurrentStatus> orderCurrentStatusList = orderService.getOrderCurrentStatusList();

		model.addAttribute("orderCurrentStatusList", orderCurrentStatusList);
		return "userpage/order/addOrderCurrentStatus";
	}
}
