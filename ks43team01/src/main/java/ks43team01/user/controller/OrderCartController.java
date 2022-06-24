package ks43team01.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OrderCartController {

	@GetMapping("/orderCart")
	public String addOderCartList() {
		
		return "userpage/order/orderCart";
	}
	
}
