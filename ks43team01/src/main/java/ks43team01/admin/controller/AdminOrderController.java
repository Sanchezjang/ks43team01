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
import org.springframework.web.bind.annotation.RequestParam;

import ks43team01.dto.BoardCategory;
import ks43team01.dto.OrderCurrentStatus;
import ks43team01.dto.OrderStatusStandard;
import ks43team01.dto.Payment;
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
	//현재 주문 상태 조회 상세내역
		@GetMapping("/orderCurrentStatusInfo")
		public String orderCurrentStatusInfo(@RequestParam(value = "orderCode")String orderCode, Model model) {
			
			OrderCurrentStatus orderCurrentStatus = orderService.getOrderCurrentStatusInfoCode(orderCode);
			log.info("orderCurrentStatus :{}", orderCurrentStatus);
			model.addAttribute("orderCurrentStatus", orderCurrentStatus);
			return "adminpage/orderAdmin/orderCurrentStatusInfo";
			
		}
	
	/* 현재 주문 상태 조회 */
	@GetMapping("/orderCurrentStatusList")
	public String getOrderCurrentStatusList(Model model) {
		List<OrderCurrentStatus> orderCurrentStatusList = orderService.getOrderCurrentStatusList();
		log.info("현재 주문 상태 목록: {}", orderCurrentStatusList);
		model.addAttribute("orderCurrentStatusList", orderCurrentStatusList);
		
		return "adminpage/orderAdmin/orderCurrentStatusList";
	}
	/* 상품 주문 현황 기준 등록 (post) */
	@PostMapping("/addOrderStatusStandard")
	public String addOrderStatusStandard(HttpSession session
										, OrderStatusStandard orderStatusStandard
										, HttpServletRequest request) {
		String sessionId = (String) session.getAttribute("UID");
		orderService.addOrderStatusStandard(sessionId, orderStatusStandard);
		
		return "redirect:/adminpage/orderAdmin/orderStatusStandardList";
	}
	
	/* 상품 주문 현황 기준 등록 (get) */
	@GetMapping("/addOrderStatusStandard")
	public String addOrderStatusStandard(Model model) {
		List<OrderStatusStandard> orderStatusStandardList = orderService.getOrderStatusStandardList();
		
		model.addAttribute("orderStatusStandardList", orderStatusStandardList);
		return "adminpage/orderAdmin/addOrderStatusStandard";
	}
	
	
	/* 상품 주문 현황 기준 조회 */
	@GetMapping("/orderStatusStandardList")
	public String getOrderStatusStandardList(Model model) {
		List<OrderStatusStandard> orderStatusStandardList = orderService.getOrderStatusStandardList();
		log.info("주문 현황 기준 목록: {}", orderStatusStandardList);
		model.addAttribute("orderStatusStandardList", orderStatusStandardList);
		
		return "adminpage/orderAdmin/orderStatusStandardList";
	}
	

	
}
