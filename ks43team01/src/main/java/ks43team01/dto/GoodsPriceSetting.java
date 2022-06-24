package ks43team01.dto;

public class GoodsPriceSetting {

	private String goodsPriceSettingCode;
	private String goodsPrice;
	private String goodsWorkingPeriod;
	private String goodsModifiedPossibilityCount;
	private String userIdCode;
	private String goodsPriceSettingRegDate;
	
	@Override
	public String toString() {
		return "GoodsPriceSetting [goodsPriceSettingCode=" + goodsPriceSettingCode + ", goodsPrice=" + goodsPrice
				+ ", goodsWorkingPeriod=" + goodsWorkingPeriod + ", goodsModifiedPossibilityCount="
				+ goodsModifiedPossibilityCount + ", userIdCode=" + userIdCode + ", goodsPriceSettingRegDate="
				+ goodsPriceSettingRegDate + "]";
	}

	public String getGoodsPriceSettingCode() {
		return goodsPriceSettingCode;
	}
	public void setGoodsPriceSettingCode(String goodsPriceSettingCode) {
		this.goodsPriceSettingCode = goodsPriceSettingCode;
	}
	public String getGoodsPrice() {
		return goodsPrice;
	}
	public void setGoodsPrice(String goodsPrice) {
		this.goodsPrice = goodsPrice;
	}
	public String getGoodsWorkingPeriod() {
		return goodsWorkingPeriod;
	}
	public void setGoodsWorkingPeriod(String goodsWorkingPeriod) {
		this.goodsWorkingPeriod = goodsWorkingPeriod;
	}
	public String getGoodsModifiedPossibilityCount() {
		return goodsModifiedPossibilityCount;
	}
	public void setGoodsModifiedPossibilityCount(String goodsModifiedPossibilityCount) {
		this.goodsModifiedPossibilityCount = goodsModifiedPossibilityCount;
	}
	public String getUserIdCode() {
		return userIdCode;
	}
	public void setUserIdCode(String userIdCode) {
		this.userIdCode = userIdCode;
	}
	public String getGoodsPriceSettingRegDate() {
		return goodsPriceSettingRegDate;
	}
	public void setGoodsPriceSettingRegDate(String goodsPriceSettingRegDate) {
		this.goodsPriceSettingRegDate = goodsPriceSettingRegDate;
	}
}
