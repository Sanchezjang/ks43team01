package ks43team01.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks43team01.dto.PaymentGoods;
import ks43team01.dto.RefundPayment;
import ks43team01.dto.RefundReason;

@Mapper
public interface PaymentRefundMapper {
	/*환불사유 선택 카테고리*/
	public List<RefundReason> getReasonList();
	/* 관리자페이지 회원 리뷰 목록 */
	public List<PaymentGoods> getReasonRequest();
	/*환불테이블 1번 입력값*/
	public int addRefundRequest(RefundPayment refundPayment);
	/*어드민페이지 환불 내역 총 들어온거 셀렉트*/
	public List<RefundPayment> getRefundRequestList();
}
