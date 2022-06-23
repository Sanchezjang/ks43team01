package ks43team01.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminOrderCancelController {
	
	@GetMapping("/orderCancel")
	public String getOrderCancelList() {
		return "/adminpage/orderCancel/orderCancel";
	}
	@GetMapping("/adminpage/orderCancel/orderRefund")
	public String getOrderRefund() {
		return "/adminpage/orderCancel/orderRefund";
	}
	
}
