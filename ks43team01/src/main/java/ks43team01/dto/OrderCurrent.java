package ks43team01.dto;

public class OrderCurrent {

	private String orderCode;
	private String userIdCode;
	private String goodsCode;
	private String orderReceiveAddr;
	private String orderReceiveContact ;
	private String orderSendname;
	private String orderSendphone;
	private String orderDate;
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("orderCode [orderCode=");
		builder.append(orderCode);
		builder.append(", userIdCode=");
		builder.append(userIdCode);
		builder.append(", goodsCode=");
		builder.append(goodsCode);
		builder.append(", orderReceiveAddr=");
		builder.append(orderReceiveAddr);
		builder.append(", orderReceiveContact=");
		builder.append(orderReceiveContact);
		builder.append(", orderSendname=");
		builder.append(orderSendname);
		builder.append(", orderSendphone=");
		builder.append(orderSendphone);
		builder.append(", orderDate=");
		builder.append(orderDate);
		builder.append("]");
		return builder.toString();
	}
	public String getOrderCode() {
		return orderCode;
	}
	public void setOorderCode(String orderCode) {
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
	public String getOrderSendname() {
		return orderSendname;
	}
	public void setOrderSendname(String orderSendname) {
		this.orderSendname = orderSendname;
	}
	public String getOrderSendphone() {
		return orderSendphone;
	}
	public void setOrderSendphone(String orderSendphone) {
		this.orderSendphone = orderSendphone;
	}
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	
	
	
}
