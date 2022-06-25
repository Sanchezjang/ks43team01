package ks43team01.dto;

public class OrderCart {

	private String orderCartCode;
	private String userIdCode;
	private String sellerIdCode;
	private String sellerPhoneNumber;
	private String goodsImg;
	private String goodsPrice;
	private String goodsCode;
	private String goodsName;
	private String goodsDetails;
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("OrderCart [orderCartCode=");
		builder.append(orderCartCode);
		builder.append(", userIdCode=");
		builder.append(userIdCode);
		builder.append(", sellerIdCode=");
		builder.append(sellerIdCode);
		builder.append(", sellerPhoneNumber=");
		builder.append(sellerPhoneNumber);
		builder.append(", goodsImg=");
		builder.append(goodsImg);
		builder.append(", goodsPrice=");
		builder.append(goodsPrice);
		builder.append(", goodsCode=");
		builder.append(goodsCode);
		builder.append(", goodsName=");
		builder.append(goodsName);
		builder.append(", goodsDetails=");
		builder.append(goodsDetails);
		builder.append("]");
		return builder.toString();
	}
	public String getOrderCartCode() {
		return orderCartCode;
	}
	public void setOrderCartCode(String orderCartCode) {
		this.orderCartCode = orderCartCode;
	}
	public String getUserIdCode() {
		return userIdCode;
	}
	public void setUserIdCode(String userIdCode) {
		this.userIdCode = userIdCode;
	}
	public String getSellerIdCode() {
		return sellerIdCode;
	}
	public void setSellerIdCode(String sellerIdCode) {
		this.sellerIdCode = sellerIdCode;
	}
	public String getSellerPhoneNumber() {
		return sellerPhoneNumber;
	}
	public void setSellerPhoneNumber(String sellerPhoneNumber) {
		this.sellerPhoneNumber = sellerPhoneNumber;
	}
	public String getGoodsImg() {
		return goodsImg;
	}
	public void setGoodsImg(String goodsImg) {
		this.goodsImg = goodsImg;
	}
	public String getGoodsPrice() {
		return goodsPrice;
	}
	public void setGoodsPrice(String goodsPrice) {
		this.goodsPrice = goodsPrice;
	}
	public String getGoodsCode() {
		return goodsCode;
	}
	public void setGoodsCode(String goodsCode) {
		this.goodsCode = goodsCode;
	}
	public String getGoodsName() {
		return goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	public String getGoodsDetails() {
		return goodsDetails;
	}
	public void setGoodsDetails(String goodsDetails) {
		this.goodsDetails = goodsDetails;
	}   
	
	
	
}
