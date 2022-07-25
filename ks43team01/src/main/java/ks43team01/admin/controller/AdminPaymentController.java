package ks43team01.admin.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ks43team01.dto.Payment;
import ks43team01.service.PaymentService;

@Controller
@RequestMapping("/adminpage/payment")
public class AdminPaymentController {
	
	private static final Logger log = LoggerFactory.getLogger(AdminPaymentController.class);

	private final PaymentService paymentService;
	
	public AdminPaymentController(PaymentService paymentService) {
		this.paymentService = paymentService;
	}
	
	//결제 상세내역
	@GetMapping("/paymentInfo")
	public String paymentInfo(@RequestParam(value = "paymentCode")String paymentCode, Model model) {
		
		Payment payment = paymentService.getPaymentInfoCode(paymentCode);

		model.addAttribute("payment", payment);
		
		return "adminpage/payment/paymentInfo";
		
	}
	
	//결제 내역 리스트
	@GetMapping("/paymentList")
	public String getPaymentList(Model model) {
		
		List<Payment> paymentList = paymentService.getPaymentList();
		
		String str = "";

		model.addAttribute("paymentList", paymentList);
		model.addAttribute("str", str);
		
		return "adminpage/payment/paymentList";
	}

	public static Logger getLog() {
		return log;
	}
	
}