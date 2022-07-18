package ks43team01.dto;

public class OrderStatusStandard {

	private String orderStatusStandardCode;
	private String orderStatusStandardDatail;
	private String userIdCode;
	private String orderStatusStandardRegDate;
	public String getOrderStatusStandardCode() {
		return orderStatusStandardCode;
	}
	public void setOrderStatusStandardCode(String orderStatusStandardCode) {
		this.orderStatusStandardCode = orderStatusStandardCode;
	}
	public String getOrderStatusStandardDatail() {
		return orderStatusStandardDatail;
	}
	public void setOrderStatusStandardDatail(String orderStatusStandardDatail) {
		this.orderStatusStandardDatail = orderStatusStandardDatail;
	}
	public String getUserIdCode() {
		return userIdCode;
	}
	public void setUserIdCode(String userIdCode) {
		this.userIdCode = userIdCode;
	}
	public String getOrderStatusStandardRegDate() {
		return orderStatusStandardRegDate;
	}
	public void setOrderStatusStandardRegDate(String orderStatusStandardRegDate) {
		this.orderStatusStandardRegDate = orderStatusStandardRegDate;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("OrderStatusStandard [orderStatusStandardCode=");
		builder.append(orderStatusStandardCode);
		builder.append(", orderStatusStandardDatail=");
		builder.append(orderStatusStandardDatail);
		builder.append(", userIdCode=");
		builder.append(userIdCode);
		builder.append(", orderStatusStandardRegDate=");
		builder.append(orderStatusStandardRegDate);
		builder.append("]");
		return builder.toString();
	}
	
}
