package ks43team01.dto;

public class Goods {
	private GoodsBasicInfo goodsBasicInfo;
	private GoodsImage goodsImage;
	private GoodsPriceSetting goodsPriceSetting;
	private GoodsReg goodsReg;
	private GoodsRequest goodsRequest;
	private GoodsSubCategory goodsSubCategory;
	private GoodsTopCategory goodsTopCategory;
	GoodsBasicInfo goodsBasicInfo1;
	
	public GoodsBasicInfo getGoodsBasicInfo1() {
		return goodsBasicInfo1;
	}
	public void setGoodsBasicInfo1(GoodsBasicInfo goodsBasicInfo1) {
		this.goodsBasicInfo1 = goodsBasicInfo1;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Goods [goodsBasicInfo=");
		builder.append(goodsBasicInfo);
		builder.append(", goodsImage=");
		builder.append(goodsImage);
		builder.append(", goodsPriceSetting=");
		builder.append(goodsPriceSetting);
		builder.append(", goodsReg=");
		builder.append(goodsReg);
		builder.append(", goodsRequest=");
		builder.append(goodsRequest);
		builder.append(", goodsSubCategory=");
		builder.append(goodsSubCategory);
		builder.append(", goodsTopCategory=");
		builder.append(goodsTopCategory);
		builder.append(", goodsBasicInfo1=");
		builder.append(goodsBasicInfo1);
		builder.append("]");
		return builder.toString();
	}
	public GoodsBasicInfo getGoodsBasicInfo() {
		return goodsBasicInfo;
	}
	public void setGoodsBasicInfo(GoodsBasicInfo goodsBasicInfo) {
		this.goodsBasicInfo = goodsBasicInfo;
	}
	public GoodsImage getGoodsImage() {
		return goodsImage;
	}
	public void setGoodsImage(GoodsImage goodsImage) {
		this.goodsImage = goodsImage;
	}
	public GoodsPriceSetting getGoodsPriceSetting() {
		return goodsPriceSetting;
	}
	public void setGoodsPriceSetting(GoodsPriceSetting goodsPriceSetting) {
		this.goodsPriceSetting = goodsPriceSetting;
	}
	public GoodsReg getGoodsReg() {
		return goodsReg;
	}
	public void setGoodsReg(GoodsReg goodsReg) {
		this.goodsReg = goodsReg;
	}
	public GoodsRequest getGoodsRequest() {
		return goodsRequest;
	}
	public void setGoodsRequest(GoodsRequest goodsRequest) {
		this.goodsRequest = goodsRequest;
	}
	public GoodsSubCategory getGoodsSubCategory() {
		return goodsSubCategory;
	}
	public void setGoodsSubCategory(GoodsSubCategory goodsSubCategory) {
		this.goodsSubCategory = goodsSubCategory;
	}
	public GoodsTopCategory getGoodsTopCategory() {
		return goodsTopCategory;
	}
	public void setGoodsTopCategory(GoodsTopCategory goodsTopCategory) {
		this.goodsTopCategory = goodsTopCategory;
	}
}
