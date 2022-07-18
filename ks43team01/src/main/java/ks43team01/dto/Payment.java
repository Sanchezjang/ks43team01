package ks43team01.dto;

public class Payment {
	private String paymentCode;
	private String orderCode;
	private String userIdCode;
	private String goodsCode;
	private String paymentInputAccountCardNumber;
	private String paymentAgencyType;
	private String paymentAgency;
	private String paymentPoint;
	private String paymentRealtime;
	private String paymentVirtual;
	private String paymentSellerCalculateAmount;
	private String siteFee;
	private String buyerExp;
	private String sellerExp;
	private String paymentByCashTime;
	
	@Override
	public String toString() {
		return "Payment [paymentCode=" + paymentCode + ", orderCode=" + orderCode + ", userIdCode=" + userIdCode
				+ ", goodsCode=" + goodsCode + ", paymentInputAccountCardNumber=" + paymentInputAccountCardNumber
				+ ", paymentAgencyType=" + paymentAgencyType + ", paymentAgency=" + paymentAgency + ", paymentPoint="
				+ paymentPoint + ", paymentRealtime=" + paymentRealtime + ", paymentVirtual=" + paymentVirtual
				+ ", paymentSellerCalculateAmount=" + paymentSellerCalculateAmount + ", siteFee=" + siteFee
				+ ", buyerExp=" + buyerExp + ", sellerExp=" + sellerExp + ", paymentByCashTime=" + paymentByCashTime
				+ "]";
	}
	public String getPaymentCode() {
		return paymentCode;
	}
	public void setPaymentCode(String paymentCode) {
		this.paymentCode = paymentCode;
	}
	public String getOrderCode() {
		return orderCode;
	}
	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}
	public String getUserIdCode() {
		return userIdCode;
	}
	public void setUserIdCode(String userIdCode) {
		this.userIdCode = userIdCode;
	}
	public String getGoodsCode() {
		return goodsCode;
	}
	public void setGoodsCode(String goodsCode) {
		this.goodsCode = goodsCode;
	}
	public String getPaymentInputAccountCardNumber() {
		return paymentInputAccountCardNumber;
	}
	public void setPaymentInputAccountCardNumber(String paymentInputAccountCardNumber) {
		this.paymentInputAccountCardNumber = paymentInputAccountCardNumber;
	}
	public String getPaymentAgencyType() {
		return paymentAgencyType;
	}
	public void setPaymentAgencyType(String paymentAgencyType) {
		this.paymentAgencyType = paymentAgencyType;
	}
	public String getPaymentAgency() {
		return paymentAgency;
	}
	public void setPaymentAgency(String paymentAgency) {
		this.paymentAgency = paymentAgency;
	}
	public String getPaymentPoint() {
		return paymentPoint;
	}
	public void setPaymentPoint(String paymentPoint) {
		this.paymentPoint = paymentPoint;
	}
	public String getPaymentRealtime() {
		return paymentRealtime;
	}
	public void setPaymentRealtime(String paymentRealtime) {
		this.paymentRealtime = paymentRealtime;
	}
	public String getPaymentVirtual() {
		return paymentVirtual;
	}
	public void setPaymentVirtual(String paymentVirtual) {
		this.paymentVirtual = paymentVirtual;
	}
	public String getPaymentSellerCalculateAmount() {
		return paymentSellerCalculateAmount;
	}
	public void setPaymentSellerCalculateAmount(String paymentSellerCalculateAmount) {
		this.paymentSellerCalculateAmount = paymentSellerCalculateAmount;
	}
	public String getSiteFee() {
		return siteFee;
	}
	public void setSiteFee(String siteFee) {
		this.siteFee = siteFee;
	}
	public String getBuyerExp() {
		return buyerExp;
	}
	public void setBuyerExp(String buyerExp) {
		this.buyerExp = buyerExp;
	}
	public String getSellerExp() {
		return sellerExp;
	}
	public void setSellerExp(String sellerExp) {
		this.sellerExp = sellerExp;
	}
	public String getPaymentByCashTime() {
		return paymentByCashTime;
	}
	public void setPaymentByCashTime(String paymentByCashTime) {
		this.paymentByCashTime = paymentByCashTime;
	}
}