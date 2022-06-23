package ks43team01.service;

import java.util.List;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ks43team01.dto.Payment;
import ks43team01.mapper.PaymentMapper;

@Service
@Transactional
public class PaymentService {
	
	// 3. 생성자 메서드 주입방식 
	private final PaymentMapper paymentMapper;
	
	public PaymentService(PaymentMapper paymentMapper) {
		this.paymentMapper = paymentMapper;
	}
	
	/*
	 * 결제 상세내역
	 * */
	
	public List<Payment> getPaymentInfo(){
  
	List<Payment> paymentInfo = paymentMapper.getPaymentInfo();
  
	return paymentInfo; }
	 
	
	/*
	 * 결제내역 리스트
	 * */
	public List<Payment> getPaymentList(){
		
		List<Payment> paymentList = paymentMapper.getPaymentList();
		
		return paymentList;
	}
	
}
