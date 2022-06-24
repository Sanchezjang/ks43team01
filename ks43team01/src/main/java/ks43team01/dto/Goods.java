package ks43team01.dto;

public class Goods {
	private GoodsBasicInfo goodsBasicInfo;
	private GoodsImage goodsImage;
	private GoodsPriceSetting goodsPriceSetting;
	private GoodsReg goodsReg;
	private GoodsRequest goodsRequest;
	private GoodsSubCategory goodsSubCategory;
	private GoodsTopCategory goodsTopCategory;
	
	@Override
	public String toString() {
		return "Goods [goodsBasicInfo=" + goodsBasicInfo + ", goodsImage=" + goodsImage + ", goodsPriceSetting="
				+ goodsPriceSetting + ", goodsReg=" + goodsReg + ", goodsRequest=" + goodsRequest
				+ ", goodsSubCategory=" + goodsSubCategory + ", goodsTopCategory=" + goodsTopCategory + "]";
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
