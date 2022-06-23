package ks43team01.admin.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ks43team01.dto.Payment;
import ks43team01.service.PaymentService;

@Controller
@RequestMapping("/adminpage/payment")
public class AdminPaymentController {
	
	private static final Logger log = LoggerFactory.getLogger(AdminPaymentController.class);

	
	//DI (의존성 주입)
	// 3. 생성자 메서드 주입방식
	private final PaymentService paymentService;
	
	public AdminPaymentController(PaymentService paymentService) {
		this.paymentService = paymentService;
	}
	
	//결제 상세내역
	@GetMapping("/paymentInfo")
	public String getPaymentInfo(Model model) {
		
		List<Payment> paymentInfo = paymentService.getPaymentInfo();
		
		String str = "";
		log.info("결제 상세내역 : {}", paymentInfo);
		model.addAttribute("paymentInfo", paymentInfo);
		model.addAttribute("str", str);
		
		return "adminpage/payment/paymentInfo";
	}
	
	//결제 내역 리스트
	@GetMapping("/paymentList")
	public String getPaymentList(Model model) {
		
		List<Payment> paymentList = paymentService.getPaymentList();
		
		String str = "";
		//log.info("결제 내역 리스트 : {}", paymentList);
		model.addAttribute("paymentList", paymentList);
		model.addAttribute("str", str);
		
		return "adminpage/payment/paymentList";
	}
	
}