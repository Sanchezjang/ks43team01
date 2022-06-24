package ks43team01.dto;

public class GoodsImage {
	
	private String goodsImageCode;
	private String goodsImageReg;
	private String userIdCode;
	private String goodsImageRegDate;
	
	@Override
	public String toString() {
		return "GoodsImage [goodsImageCode=" + goodsImageCode + ", goodsImageReg=" + goodsImageReg + ", userIdCode="
				+ userIdCode + ", goodsImageRegDate=" + goodsImageRegDate + "]";
	}
	public String getGoodsImageCode() {
		return goodsImageCode;
	}
	public void setGoodsImageCode(String goodsImageCode) {
		this.goodsImageCode = goodsImageCode;
	}
	public String getGoodsImageReg() {
		return goodsImageReg;
	}
	public void setGoodsImageReg(String goodsImageReg) {
		this.goodsImageReg = goodsImageReg;
	}
	public String getUserIdCode() {
		return userIdCode;
	}
	public void setUserIdCode(String userIdCode) {
		this.userIdCode = userIdCode;
	}
	public String getGoodsImageRegDate() {
		return goodsImageRegDate;
	}
	public void setGoodsImageRegDate(String goodsImageRegDate) {
		this.goodsImageRegDate = goodsImageRegDate;
	}
}
