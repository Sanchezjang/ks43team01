package ks43team01.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks43team01.dto.Payment;

@Mapper
public interface PaymentMapper {

	//결제 상세내역
	public Payment getPaymentInfoCode(String paymentCode);

	//결제내역 리스트
	public List<Payment> getPaymentList();
	
	//결제화면에서 결제
	public int goodsPayment(Payment payment);
	
}
