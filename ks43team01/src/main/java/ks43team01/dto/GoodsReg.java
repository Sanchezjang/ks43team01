package ks43team01.dto;

public class GoodsReg {

	private String goodsCode;
	private String goodsBasicInfoCode;
	private String goodsPriceSettingCode;
	private String goodsImageCode;
	private String goodsRequestsCode;
	private String userIdCode;
	private String goodsRegDate;
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("GoodsReg [goodsCode=");
		builder.append(goodsCode);
		builder.append(", goodsBasicInfoCode=");
		builder.append(goodsBasicInfoCode);
		builder.append(", goodsPriceSettingCode=");
		builder.append(goodsPriceSettingCode);
		builder.append(", goodsImageCode=");
		builder.append(goodsImageCode);
		builder.append(", goodsRequestsCode=");
		builder.append(goodsRequestsCode);
		builder.append(", userIdCode=");
		builder.append(userIdCode);
		builder.append(", goodsRegDate=");
		builder.append(goodsRegDate);
		builder.append("]");
		return builder.toString();
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

	
}
