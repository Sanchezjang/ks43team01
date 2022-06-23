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

import ks43team01.dto.Payment;
import ks43team01.service.PaymentService;


@Controller
@RequestMapping("/userpage/payment")
public class UserPaymentController {
	
	private static final Logger log = LoggerFactory.getLogger(UserPaymentController.class);

	private final PaymentService paymentService;
	
	public UserPaymentController(PaymentService paymentService) {
		this.paymentService = paymentService;
	}
	
	//결제화면에서 입력 받은 값 Insert
	@PostMapping("/goodsPayment")
	public String goodsPayment(HttpSession session
			,Payment payment
			,HttpServletRequest request) {
		
		log.info("결제 처리 payment : {}", payment);
		String sessionId = (String) session.getAttribute("UID");
		
		paymentService.goodsPayment(sessionId, payment);
		
		return "redirect:/userpage/payment/goodsPayment";
	}
	
	//결제화면에서 입력 받은 값 Insert
	@GetMapping("/goodsPayment")
	public String goodsPayment(Model model) {
		
		List<Payment> paymentList = paymentService.getPaymentList();
		
		model.addAttribute("paymentList", paymentList);
		//log.info("지출 등록 내역 : {}", spendingList);
		
		return "userpage/payment/goodsPayment";
	}
	
}