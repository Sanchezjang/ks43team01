package ks43team01.service;

import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ks43team01.dto.Payment;
import ks43team01.mapper.PaymentMapper;

@Service
@Transactional
public class PaymentService {
	
	// 생성자 메서드 주입방식 
	private final PaymentMapper paymentMapper;
	
	public PaymentService(PaymentMapper paymentMapper) {
		this.paymentMapper = paymentMapper;
	}
	
	/*
	 * 결제 상세내역
	 * */
	public Payment getPaymentInfoCode(String paymentCode) {
		
		return  paymentMapper.getPaymentInfoCode(paymentCode);
	
	}
	
	/*
	 * 결제내역 리스트
	 * */
	public List<Payment> getPaymentList(){
		
		List<Payment> paymentList = paymentMapper.getPaymentList();
		
		return paymentList;
	}
	
	/*
	 * 결제하기
	 * */
	public int goodsPayment(String sessionId, Payment payment) {
		
		payment.setUserIdCode(sessionId);
		
		int result = paymentMapper.goodsPayment(payment);
		
		return result;
	}
	
}
