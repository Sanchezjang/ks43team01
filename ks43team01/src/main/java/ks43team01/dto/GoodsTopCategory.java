package ks43team01.dto;

import java.util.List;

public class GoodsTopCategory {

	private String	goodsTopCategoryCode; 
	private String	goodsTopCategoryName;
	private String	userIdCode; 
	private String	goodsTopCategoryRegDate;
	private List<GoodsSubCategory> goodsSubCategoryList;
	
	@Override
	public String toString() {
		return "GoodsTopCategory [goodsTopCategoryCode=" + goodsTopCategoryCode + ", goodsTopCategoryName="
				+ goodsTopCategoryName + ", userIdCode=" + userIdCode + ", goodsTopCategoryRegDate="
				+ goodsTopCategoryRegDate + ", goodsSubCategoryList=" + goodsSubCategoryList + "]";
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
	public List<GoodsSubCategory> getGoodsSubCategoryList() {
		return goodsSubCategoryList;
	}
	public void setGoodsSubCategoryList(List<GoodsSubCategory> goodsSubCategoryList) {
		this.goodsSubCategoryList = goodsSubCategoryList;
	}
}
