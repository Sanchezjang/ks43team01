package ks43team01.dto;

public class OrderCurrentStatus {
	
	private String orderCode;
	private String orderStatusCode;
	private String userIdCode;
	private String goodsCode;
	private String orderReceiveAddr;
	private String orderReceiveContact;
	private String orderSendName;
	private String orderSendPhone;
	private String orderDate;
	
	private OrderStatusStandard orderStatusStandard;
	
	public OrderStatusStandard getOrderStatusStandard() {
		return orderStatusStandard;
	}
	public void setOrderStatusStandard(OrderStatusStandard orderStatusStandard) {
		this.orderStatusStandard = orderStatusStandard;
	}
	public String getOrderCode() {
		return orderCode;
	}
	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}
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
	public String getOrderReceiveAddr() {
		return orderReceiveAddr;
	}
	public void setOrderReceiveAddr(String orderReceiveAddr) {
		this.orderReceiveAddr = orderReceiveAddr;
	}
	public String getOrderReceiveContact() {
		return orderReceiveContact;
	}
	public void setOrderReceiveContact(String orderReceiveContact) {
		this.orderReceiveContact = orderReceiveContact;
	}
	public String getOrderSendName() {
		return orderSendName;
	}
	public void setOrderSendName(String orderSendName) {
		this.orderSendName = orderSendName;
	}
	public String getOrderSendPhone() {
		return orderSendPhone;
	}
	public void setOrderSendPhone(String orderSendPhone) {
		this.orderSendPhone = orderSendPhone;
	}
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("OrderCurrentStatus [orderCode=");
		builder.append(orderCode);
		builder.append(", orderStatusCode=");
		builder.append(orderStatusCode);
		builder.append(", userIdCode=");
		builder.append(userIdCode);
		builder.append(", goodsCode=");
		builder.append(goodsCode);
		builder.append(", orderReceiveAddr=");
		builder.append(orderReceiveAddr);
		builder.append(", orderReceiveContact=");
		builder.append(orderReceiveContact);
		builder.append(", orderSendName=");
		builder.append(orderSendName);
		builder.append(", orderSendPhone=");
		builder.append(orderSendPhone);
		builder.append(", orderDate=");
		builder.append(orderDate);
		builder.append(", orderStatusStandard=");
		builder.append(orderStatusStandard);
		builder.append("]");
		return builder.toString();
	}

	
	
}
