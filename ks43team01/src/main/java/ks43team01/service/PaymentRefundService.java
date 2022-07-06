package ks43team01.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ks43team01.dto.PaymentGoods;
import ks43team01.dto.RefundPayment;
import ks43team01.dto.RefundReason;
import ks43team01.mapper.PaymentRefundMapper;

@Service
@Transactional
public class PaymentRefundService {
	////DI/////
	private final PaymentRefundMapper paymentRefundMapper;
	public PaymentRefundService(PaymentRefundMapper paymentRefundMapper) {
		this.paymentRefundMapper = paymentRefundMapper;
	}
	
	/*환불사유 선택 카테고리*/
	public List<RefundReason> getReasonList(){
		List<RefundReason> ReasonList =	paymentRefundMapper.getReasonList();
		return ReasonList;
	}
	/*환불요청시에 상품 기본정보불러오기*/
	public List<PaymentGoods> getReasonRequest(){
		List<PaymentGoods> requstList = paymentRefundMapper.getReasonRequest();
		return requstList;
	}
	/*환불테이블 1번 입력값*/
	public int addRefundRequest(RefundPayment refundPayment) {
		int result = paymentRefundMapper.addRefundRequest(refundPayment);
		return result;
	}
	/*어드민페이지 환불 내역 총 들어온거 셀렉트*/
	public List<RefundPayment> getRefundRequestList(){
		List<RefundPayment> refundRequestList = paymentRefundMapper.getRefundRequestList();
		 return refundRequestList;
	}
	
}
