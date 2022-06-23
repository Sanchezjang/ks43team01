package ks43team01.dto;


public class OrderStatus {
	private String orderStatusCode;
	private String userIdCode;
	private String goodsCode;
	private String orderCode;
	private String orderStatusStandardCode;
	private String orderStatusUpdateTime;
	public String getOrderStatusCode() {
		return orderStatusCode;
	}
	public void setOrderStatusCode(String orderStatusCode) {
		this.orderStatusCode = orderStatusCode;
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
	public String getOrderCode() {
		return orderCode;
	}
	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}
	public String getOrderStatusStandardCode() {
		return orderStatusStandardCode;
	}
	public void setOrderStatusStandardCode(String orderStatusStandardCode) {
		this.orderStatusStandardCode = orderStatusStandardCode;
	}
	public String getOrderStatusUpdateTime() {
		return orderStatusUpdateTime;
	}
	public void setOrderStatusUpdateTime(String orderStatusUpdateTime) {
		this.orderStatusUpdateTime = orderStatusUpdateTime;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("OrderStatus [orderStatusCode=");
		builder.append(orderStatusCode);
		builder.append(", userIdCode=");
		builder.append(userIdCode);
		builder.append(", goodsCode=");
		builder.append(goodsCode);
		builder.append(", orderCode=");
		builder.append(orderCode);
		builder.append(", orderStatusStandardCode=");
		builder.append(orderStatusStandardCode);
		builder.append(", orderStatusUpdateTime=");
		builder.append(orderStatusUpdateTime);
		builder.append("]");
		return builder.toString();
	}
	
}
