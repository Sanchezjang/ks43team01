package ks43team01.service;

import java.util.List;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ks43team01.dto.Account;
import ks43team01.dto.Payment;
import ks43team01.dto.Sales;
import ks43team01.dto.Spending;
import ks43team01.mapper.PaymentMapper;
import ks43team01.mapper.ProfitAndLossMapper;

@Service
@Transactional
public class PaymentService {
	
	// 3. 생성자 메서드 주입방식 
	private final PaymentMapper paymentMapper;
	
	public PaymentService(PaymentMapper paymentMapper) {
		this.paymentMapper = paymentMapper;
	}
	
	/*
	 * 손익 계정과목 리스트
	 * */
	public List<Payment> getPaymentList(){
		
		List<Payment> paymentList = paymentMapper.getPaymentList();
		
		return paymentList;
	}
	
}
