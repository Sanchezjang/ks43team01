package ks43team01.user.controller;


import java.util.List;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import ks43team01.dto.PaymentGoods;
import ks43team01.dto.RefundPayment;
import ks43team01.dto.RefundReason;
import ks43team01.service.PaymentRefundService;


@Controller
public class OrderCancleController {
	
	
	private static final Logger log = LoggerFactory.getLogger(OrderCancleController.class);
/////DI/////
	private final PaymentRefundService paymentRefundService;
	public OrderCancleController(PaymentRefundService paymentRefundService) {
		this.paymentRefundService = paymentRefundService;
	}
	@PostMapping("userpage/order/orderCancel")
	public String addRefundRequest(RefundPayment refundPayment) {
		paymentRefundService.addRefundRequest(refundPayment);
		return "main";
	}
	
	@GetMapping("userpage/order/orderCancel")/*01.환불사유 선택 카테고리*/
	public String addOrderCancle(Model model,HttpSession session) {
		List<RefundReason> reasonList = paymentRefundService.getReasonList();
		model.addAttribute("reasonList", reasonList);
		log.info("환불이유 받아오는지 확실허게 보자!!!   :{}",reasonList);
		List<PaymentGoods> requstList = paymentRefundService.getReasonRequest();
		model.addAttribute("requstList", requstList);
		log.info("리퀘스트리스트   :{}",requstList);
		return "userpage/order/orderCancel";
	}
	
	
	
}
