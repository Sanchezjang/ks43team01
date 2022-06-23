package ks43team01.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminOrderCancelController {
	
	@GetMapping("/adminpage/order/orderCancel")
	public String getOrderCancelList() {
		return "/adminpage/order/orderCancel";
	}
	@GetMapping("/adminpage/order/orderRefund")
	public String getOrderRefund() {
		return "/adminpage/order/orderRefund";
	}
	
}
