package ks43team01.dto;

public class Goods {
	
	public String goodsCode;
	public String goodsBasicInfoCode;
	public String goodsPriceSettingCode;
	public String goodsImageCode;
	public String goodsRequestsCode;
	public String userIdCode;
	public String goodsRegDate;
	private String goodsSubCategoryCode;
	private String goodsDescription;
	private String goodsName;
	private String goodsBasicInfoRegDate;
	private String goodsTopCategoryName;
	private String goodsSubCategoryName;
	@Override
	public String toString() {
		return "Goods [goodsCode=" + goodsCode + ", goodsBasicInfoCode=" + goodsBasicInfoCode
				+ ", goodsPriceSettingCode=" + goodsPriceSettingCode + ", goodsImageCode=" + goodsImageCode
				+ ", goodsRequestsCode=" + goodsRequestsCode + ", userIdCode=" + userIdCode + ", goodsRegDate="
				+ goodsRegDate + ", goodsSubCategoryCode=" + goodsSubCategoryCode + ", goodsDescription="
				+ goodsDescription + ", goodsName=" + goodsName + ", goodsBasicInfoRegDate=" + goodsBasicInfoRegDate
				+ ", goodsTopCategoryName=" + goodsTopCategoryName + ", goodsSubCategoryName=" + goodsSubCategoryName
				+ "]";
	}
	public String getGoodsCode() {
		return goodsCode;
	}
	public void setGoodsCode(String goodsCode) {
		this.goodsCode = goodsCode;
	}
	public String getGoodsBasicInfoCode() {
		return goodsBasicInfoCode;
	}
	public void setGoodsBasicInfoCode(String goodsBasicInfoCode) {
		this.goodsBasicInfoCode = goodsBasicInfoCode;
	}
	public String getGoodsPriceSettingCode() {
		return goodsPriceSettingCode;
	}
	public void setGoodsPriceSettingCode(String goodsPriceSettingCode) {
		this.goodsPriceSettingCode = goodsPriceSettingCode;
	}
	public String getGoodsImageCode() {
		return goodsImageCode;
	}
	public void setGoodsImageCode(String goodsImageCode) {
		this.goodsImageCode = goodsImageCode;
	}
	public String getGoodsRequestsCode() {
		return goodsRequestsCode;
	}
	public void setGoodsRequestsCode(String goodsRequestsCode) {
		this.goodsRequestsCode = goodsRequestsCode;
	}
	public String getUserIdCode() {
		return userIdCode;
	}
	public void setUserIdCode(String userIdCode) {
		this.userIdCode = userIdCode;
	}
	public String getGoodsRegDate() {
		return goodsRegDate;
	}
	public void setGoodsRegDate(String goodsRegDate) {
		this.goodsRegDate = goodsRegDate;
	}
	public String getGoodsSubCategoryCode() {
		return goodsSubCategoryCode;
	}
	public void setGoodsSubCategoryCode(String goodsSubCategoryCode) {
		this.goodsSubCategoryCode = goodsSubCategoryCode;
	}
	public String getGoodsDescription() {
		return goodsDescription;
	}
	public void setGoodsDescription(String goodsDescription) {
		this.goodsDescription = goodsDescription;
	}
	public String getGoodsName() {
		return goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	public String getGoodsBasicInfoRegDate() {
		return goodsBasicInfoRegDate;
	}
	public void setGoodsBasicInfoRegDate(String goodsBasicInfoRegDate) {
		this.goodsBasicInfoRegDate = goodsBasicInfoRegDate;
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
	
}
