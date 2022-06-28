package ks43team01.dto;

public class GoodsTopCategory {

	private String	goodsTopCategoryCode; 
	private String	goodsTopCategoryName;
	private String	userIdCode; 
	private String	goodsTopCategoryRegDate;
	
	@Override
	public String toString() {
		return "GoodsTopCategory [goodsTopCategoryCode=" + goodsTopCategoryCode + ", goodsTopCategoryName="
				+ goodsTopCategoryName + ", userIdCode=" + userIdCode + ", goodsTopCategoryRegDate="
				+ goodsTopCategoryRegDate + "]";
	}
	public String getGoodsTopCategoryCode() {
		return goodsTopCategoryCode;
	}
	public void setGoodsTopCategoryCode(String goodsTopCategoryCode) {
		this.goodsTopCategoryCode = goodsTopCategoryCode;
	}
	public String getGoodsTopCategoryName() {
		return goodsTopCategoryName;
	}
	public void setGoodsTopCategoryName(String goodsTopCategoryName) {
		this.goodsTopCategoryName = goodsTopCategoryName;
	}
	public String getUserIdCode() {
		return userIdCode;
	}
	public void setUserIdCode(String userIdCode) {
		this.userIdCode = userIdCode;
	}
	public String getGoodsTopCategoryRegDate() {
		return goodsTopCategoryRegDate;
	}
	public void setGoodsTopCategoryRegDate(String goodsTopCategoryRegDate) {
		this.goodsTopCategoryRegDate = goodsTopCategoryRegDate;
	}
}
