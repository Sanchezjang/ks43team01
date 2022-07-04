package ks43team01.user.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class OrderCancleController {
	
	
	private static final Logger log = LoggerFactory.getLogger(OrderCancleController.class);

	@GetMapping("userpage/order/orderCancel")
	public String addOrderCancle() {
		
		return "userpage/order/orderCancel";
	}
	
	
}
