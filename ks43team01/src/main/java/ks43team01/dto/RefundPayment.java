package ks43team01.dto;



public class RefundPayment{
	
	private String refundRequestCode;
	private String paymentCode;
	private String goodsCode;
	private String orderCode;
	private String refundRequestReasonCode;
	private String refundBuyerWorkStatusCompletionRate;
	private String paymentByCashTime;
	private String refundRequestDatetime;
	private String refundRequestCheck;
	private String refundRequestmoney;
	private String refundBuyerSellerConsultationCode;
	
	private Goods goods;
	private RefundReason refundReason;
	
	
	public RefundReason getRefundReason() {
		return refundReason;
	}
	public void setRefundReason(RefundReason refundReason) {
		this.refundReason = refundReason;
	}
	public Goods getGoods() {
		return goods;
	}
	public void setGoods(Goods goods) {
		this.goods = goods;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("RefundPayment [refundRequestCode=");
		builder.append(refundRequestCode);
		builder.append(", paymentCode=");
		builder.append(paymentCode);
		builder.append(", goodsCode=");
		builder.append(goodsCode);
		builder.append(", orderCode=");
		builder.append(orderCode);
		builder.append(", refundRequestReasonCode=");
		builder.append(refundRequestReasonCode);
		builder.append(", refundBuyerWorkStatusCompletionRate=");
		builder.append(refundBuyerWorkStatusCompletionRate);
		builder.append(", paymentByCashTime=");
		builder.append(paymentByCashTime);
		builder.append(", refundRequestDatetime=");
		builder.append(refundRequestDatetime);
		builder.append(", refundRequestCheck=");
		builder.append(refundRequestCheck);
		builder.append(", refundRequestmoney=");
		builder.append(refundRequestmoney);
		builder.append(", refundBuyerSellerConsultationCode=");
		builder.append(refundBuyerSellerConsultationCode);
		builder.append(", goods=");
		builder.append(goods);
		builder.append("]");
		return builder.toString();
	}
	public String getRefundRequestCode() {
		return refundRequestCode;
	}
	public void setRefundRequestCode(String refundRequestCode) {
		this.refundRequestCode = refundRequestCode;
	}
	public String getPaymentCode() {
		return paymentCode;
	}
	public void setPaymentCode(String paymentCode) {
		this.paymentCode = paymentCode;
	}
	public String getGoodsCode() {
		return goodsCode;
	}
	public void setGoodsCode(String goodsCode) {
		this.goodsCode = goodsCode;
	}
	public String getOrderCode() {
		return orderCode;
	}
	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}
	public String getRefundRequestReasonCode() {
		return refundRequestReasonCode;
	}
	public void setRefundRequestReasonCode(String refundRequestReasonCode) {
		this.refundRequestReasonCode = refundRequestReasonCode;
	}
	public String getRefundBuyerWorkStatusCompletionRate() {
		return refundBuyerWorkStatusCompletionRate;
	}
	public void setRefundBuyerWorkStatusCompletionRate(String refundBuyerWorkStatusCompletionRate) {
		this.refundBuyerWorkStatusCompletionRate = refundBuyerWorkStatusCompletionRate;
	}
	public String getPaymentByCashTime() {
		return paymentByCashTime;
	}
	public void setPaymentByCashTime(String paymentByCashTime) {
		this.paymentByCashTime = paymentByCashTime;
	}
	public String getRefundRequestDatetime() {
		return refundRequestDatetime;
	}
	public void setRefundRequestDatetime(String refundRequestDatetime) {
		this.refundRequestDatetime = refundRequestDatetime;
	}
	public String getRefundRequestCheck() {
		return refundRequestCheck;
	}
	public void setRefundRequestCheck(String refundRequestCheck) {
		this.refundRequestCheck = refundRequestCheck;
	}
	public String getRefundRequestmoney() {
		return refundRequestmoney;
	}
	public void setRefundRequestmoney(String refundRequestmoney) {
		this.refundRequestmoney = refundRequestmoney;
	}
	public String getRefundBuyerSellerConsultationCode() {
		return refundBuyerSellerConsultationCode;
	}
	public void setRefundBuyerSellerConsultationCode(String refundBuyerSellerConsultationCode) {
		this.refundBuyerSellerConsultationCode = refundBuyerSellerConsultationCode;
	}
	
}
