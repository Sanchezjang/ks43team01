package ks43team01.admin.controller;

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

import ks43team01.dto.BoardCategory;
import ks43team01.dto.OrderStatusStandard;
import ks43team01.service.BoardService;
import ks43team01.service.OrderService;
import ks43team01.user.controller.BoardController;

@RequestMapping("/adminpage/orderAdmin")
@Controller
public class AdminOrderController {

	private static final Logger log = LoggerFactory.getLogger(AdminOrderController.class);


	public final OrderService orderService;
	
	public AdminOrderController(OrderService orderService) {
		this.orderService = orderService;
	}
	
	
	@GetMapping("/orderStatusStandardList")
	public String getOrderStatusStandardList(Model model) {
		List<OrderStatusStandard> orderStatusStandardList = orderService.getOrderStatusStandardList();
		log.info("주문 현황 기준 목록: {}", orderStatusStandardList);
		model.addAttribute("orderStatusStandardList", orderStatusStandardList);
		
		return "adminpage/orderAdmin/orderStatusStandardList";
	}
	

	
}
