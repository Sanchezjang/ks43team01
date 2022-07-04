package ks43team01.dto;

public class RefundConsultation {
	private String refundBuyerSellerConsultationCode;
	private String refundRequestReasonCode;
	private String 	buyerSellerConsultationRefundWorkProgress;
	private String buyerSellerConsultationRefundRate;
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("RefundConsultation [refundBuyerSellerConsultationCode=");
		builder.append(refundBuyerSellerConsultationCode);
		builder.append(", refundRequestReasonCode=");
		builder.append(refundRequestReasonCode);
		builder.append(", buyerSellerConsultationRefundWorkProgress=");
		builder.append(buyerSellerConsultationRefundWorkProgress);
		builder.append(", buyerSellerConsultationRefundRate=");
		builder.append(buyerSellerConsultationRefundRate);
		builder.append("]");
		return builder.toString();
	}
	public String getRefundBuyerSellerConsultationCode() {
		return refundBuyerSellerConsultationCode;
	}
	public void setRefundBuyerSellerConsultationCode(String refundBuyerSellerConsultationCode) {
		this.refundBuyerSellerConsultationCode = refundBuyerSellerConsultationCode;
	}
	public String getRefundRequestReasonCode() {
		return refundRequestReasonCode;
	}
	public void setRefundRequestReasonCode(String refundRequestReasonCode) {
		this.refundRequestReasonCode = refundRequestReasonCode;
	}
	public String getBuyerSellerConsultationRefundWorkProgress() {
		return buyerSellerConsultationRefundWorkProgress;
	}
	public void setBuyerSellerConsultationRefundWorkProgress(String buyerSellerConsultationRefundWorkProgress) {
		this.buyerSellerConsultationRefundWorkProgress = buyerSellerConsultationRefundWorkProgress;
	}
	public String getBuyerSellerConsultationRefundRate() {
		return buyerSellerConsultationRefundRate;
	}
	public void setBuyerSellerConsultationRefundRate(String buyerSellerConsultationRefundRate) {
		this.buyerSellerConsultationRefundRate = buyerSellerConsultationRefundRate;
	}
}
