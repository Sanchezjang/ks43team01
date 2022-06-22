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
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import ks43team01.dto.Account;
import ks43team01.dto.Payment;
import ks43team01.dto.Sales;
import ks43team01.dto.Spending;
import ks43team01.mapper.ProfitAndLossMapper;
import ks43team01.service.PaymentService;
import ks43team01.service.ProfitAndLossService;

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