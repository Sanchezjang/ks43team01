package ks43team01.dto;

public class RefundCompaleted {
	private String refundCode;
	private String userIdCode;
	private String refundRequestCode;
	private String buyerExp;
	private String sellerExp;
	private String refundPoint;
	private String finalRefundAmount;
	private String refundRrogressStatus;
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("RefundCompaleted [refundCode=");
		builder.append(refundCode);
		builder.append(", userIdCode=");
		builder.append(userIdCode);
		builder.append(", refundRequestCode=");
		builder.append(refundRequestCode);
		builder.append(", buyerExp=");
		builder.append(buyerExp);
		builder.append(", sellerExp=");
		builder.append(sellerExp);
		builder.append(", refundPoint=");
		builder.append(refundPoint);
		builder.append(", finalRefundAmount=");
		builder.append(finalRefundAmount);
		builder.append(", refundRrogressStatus=");
		builder.append(refundRrogressStatus);
		builder.append("]");
		return builder.toString();
	}
	public String getRefundCode() {
		return refundCode;
	}
	public void setRefundCode(String refundCode) {
		this.refundCode = refundCode;
	}
	public String getUserIdCode() {
		return userIdCode;
	}
	public void setUserIdCode(String userIdCode) {
		this.userIdCode = userIdCode;
	}
	public String getRefundRequestCode() {
		return refundRequestCode;
	}
	public void setRefundRequestCode(String refundRequestCode) {
		this.refundRequestCode = refundRequestCode;
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
	public String getRefundPoint() {
		return refundPoint;
	}
	public void setRefundPoint(String refundPoint) {
		this.refundPoint = refundPoint;
	}
	public String getFinalRefundAmount() {
		return finalRefundAmount;
	}
	public void setFinalRefundAmount(String finalRefundAmount) {
		this.finalRefundAmount = finalRefundAmount;
	}
	public String getRefundRrogressStatus() {
		return refundRrogressStatus;
	}
	public void setRefundRrogressStatus(String refundRrogressStatus) {
		this.refundRrogressStatus = refundRrogressStatus;
	}
}
