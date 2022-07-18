package ks43team01.dto;

public class RefundReason {
	private String refundRequestReasonCode;
	private String refundRequestReasonCodeName;
	private String refundBuyerRequestDetails;
	private String userIdCode;
	private String refundRequestReasonRegistrationDate;
	private String refundRequestReasonDisposalDate;
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("RefundReason [refundRequestReasonCode=");
		builder.append(refundRequestReasonCode);
		builder.append(", refundRequestReasonCodeName=");
		builder.append(refundRequestReasonCodeName);
		builder.append(", refundBuyerRequestDetails=");
		builder.append(refundBuyerRequestDetails);
		builder.append(", userIdCode=");
		builder.append(userIdCode);
		builder.append(", refundRequestReasonRegistrationDate=");
		builder.append(refundRequestReasonRegistrationDate);
		builder.append(", refundRequestReasonDisposalDate=");
		builder.append(refundRequestReasonDisposalDate);
		builder.append("]");
		return builder.toString();
	}
	public String getRefundRequestReasonCode() {
		return refundRequestReasonCode;
	}
	public void setRefundRequestReasonCode(String refundRequestReasonCode) {
		this.refundRequestReasonCode = refundRequestReasonCode;
	}
	public String getRefundRequestReasonCodeName() {
		return refundRequestReasonCodeName;
	}
	public void setRefundRequestReasonCodeName(String refundRequestReasonCodeName) {
		this.refundRequestReasonCodeName = refundRequestReasonCodeName;
	}
	public String getRefundBuyerRequestDetails() {
		return refundBuyerRequestDetails;
	}
	public void setRefundBuyerRequestDetails(String refundBuyerRequestDetails) {
		this.refundBuyerRequestDetails = refundBuyerRequestDetails;
	}
	public String getUserIdCode() {
		return userIdCode;
	}
	public void setUserIdCode(String userIdCode) {
		this.userIdCode = userIdCode;
	}
	public String getRefundRequestReasonRegistrationDate() {
		return refundRequestReasonRegistrationDate;
	}
	public void setRefundRequestReasonRegistrationDate(String refundRequestReasonRegistrationDate) {
		this.refundRequestReasonRegistrationDate = refundRequestReasonRegistrationDate;
	}
	public String getRefundRequestReasonDisposalDate() {
		return refundRequestReasonDisposalDate;
	}
	public void setRefundRequestReasonDisposalDate(String refundRequestReasonDisposalDate) {
		this.refundRequestReasonDisposalDate = refundRequestReasonDisposalDate;
	}
	
	
}
