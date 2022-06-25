package ks43team01.dto;

public class GoodsSubCategory {

	private String goodsSubCategoryCode;
	private String goodsTopCategoryCode;
	private String goodsTopCategoryName;
	private String goodsSubCategoryName;
	private String userIdCode;
	private String goodsSubCategoryRegDate;
	
	@Override
	public String toString() {
		return "GoodsSubCategory [goodsSubCategoryCode=" + goodsSubCategoryCode + ", goodsTopCategoryCode="
				+ goodsTopCategoryCode + ", goodsTopCategoryName=" + goodsTopCategoryName + ", goodsSubCategoryName="
				+ goodsSubCategoryName + ", userIdCode=" + userIdCode + ", goodsSubCategoryRegDate="
				+ goodsSubCategoryRegDate + "]";
	}
	public String getGoodsSubCategoryCode() {
		return goodsSubCategoryCode;
	}
	public void setGoodsSubCategoryCode(String goodsSubCategoryCode) {
		this.goodsSubCategoryCode = goodsSubCategoryCode;
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
	public String getGoodsSubCategoryName() {
		return goodsSubCategoryName;
	}
	public void setGoodsSubCategoryName(String goodsSubCategoryName) {
		this.goodsSubCategoryName = goodsSubCategoryName;
	}
	public String getUserIdCode() {
		return userIdCode;
	}
	public void setUserIdCode(String userIdCode) {
		this.userIdCode = userIdCode;
	}
	public String getGoodsSubCategoryRegDate() {
		return goodsSubCategoryRegDate;
	}
	public void setGoodsSubCategoryRegDate(String goodsSubCategoryRegDate) {
		this.goodsSubCategoryRegDate = goodsSubCategoryRegDate;
	}
}
