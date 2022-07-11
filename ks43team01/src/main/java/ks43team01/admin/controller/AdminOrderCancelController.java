package ks43team01.admin.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ks43team01.dto.RefundPayment;
import ks43team01.service.PaymentRefundService;

@Controller
@RequestMapping("adminpage/orderCancel")
public class AdminOrderCancelController {
		
		private static final Logger log = LoggerFactory.getLogger(AdminOrderCancelController.class);

//DI////주입
	private final PaymentRefundService paymentRefundService;
		public AdminOrderCancelController(PaymentRefundService paymentRefundService) {
			this.paymentRefundService = paymentRefundService;
		}
	
	@GetMapping("/")
	public String getOrderCancelList() {
		return "/adminpage/orderCancel/orderCancel";
	}
	@GetMapping("/orderCancel")/*어드민페이지 환불 내역 총 들어온거 셀렉트*/
	public String getRefundRequestList(Model model) {
		List<RefundPayment> refundRequestList = paymentRefundService.getRefundRequestList();
		log.info("refundRequestList  :  {}", refundRequestList);
		model.addAttribute("refundRequestList", refundRequestList);
		return "adminpage/orderCancel/orderCancel";
	}
	@GetMapping("/orderCancelSuccess")
	public String orderCancelSuccess(@RequestParam(name="userIdCode")String userIdcode) {
		paymentRefundService.modifyrefundSucces(userIdcode);
		log.info("-----------환불아이디 가져오는지 확인!!!   :  {}",userIdcode);
		return "redirect:/adminpage/orderCancel/orderCancel";
	}
	@GetMapping("/orderCancelFail")
	public String orderCancelFail(@RequestParam(name="userIdCode")String userIdcode) {
		paymentRefundService.modifyrefundFail(userIdcode);
		return "redirect:/adminpage/orderCancel/orderCancel";
	}
}
