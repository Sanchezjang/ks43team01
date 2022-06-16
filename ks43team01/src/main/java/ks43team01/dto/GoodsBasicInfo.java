package ks43team01.dto;

public class GoodsBasicInfo {
	private String goodsSubCategoryCode;
	private String goodsDescription;
	private String goodsName;
	private String userIdCode;
	private String goodsBasicInfoRegDate;
	private String goodsBasicInfoCode;
	
	
	@Override
	public String toString() {
		return "GoodsBasicInfo [goodsSubCategoryCode=" + goodsSubCategoryCode + ", goodsDescription=" + goodsDescription
				+ ", goodsName=" + goodsName + ", userIdCode=" + userIdCode + ", goodsBasicInfoRegDate="
				+ goodsBasicInfoRegDate + ", goodsBasicInfoCode=" + goodsBasicInfoCode + "]";
	}
	public String getGoodsBasicInfoCode() {
		return goodsBasicInfoCode;
	}
	public void setGoodsBasicInfoCode(String goodsBasicInfoCode) {
		this.goodsBasicInfoCode = goodsBasicInfoCode;
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
	public String getUserIdCode() {
		return userIdCode;
	}
	public void setUserIdCode(String userIdCode) {
		this.userIdCode = userIdCode;
	}
	public String getGoodsBasicInfoRegDate() {
		return goodsBasicInfoRegDate;
	}
	public void setGoodsBasicInfoRegDate(String goodsBasicInfoRegDate) {
		this.goodsBasicInfoRegDate = goodsBasicInfoRegDate;
	}
}
