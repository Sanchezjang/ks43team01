package ks43team01.dto;

public class Goods {
	private String goodsCode;
	private String goodsSubCategoryCode;
	private String goodsName;
	private String goodsDescription;
	private String goodsPrice;
	private String goodsWorkingPeriod;
	private String goodsModifiedPossibilityCount;
	private String goodsImageReg;
	private String goodsPreRequestsAnswerType;
	private String goodsPreRequest;
	private String userIdCode;
	private String goodsRegDate;
	
	private GoodsTopCategory goodsTopCategory;
	private GoodsSubCategory goodsSubCategory;
	
	@Override
	public String toString() {
		return "Goods [goodsCode=" + goodsCode + ", goodsSubCategoryCode=" + goodsSubCategoryCode + ", goodsName="
				+ goodsName + ", goodsDescription=" + goodsDescription + ", goodsPrice=" + goodsPrice
				+ ", goodsWorkingPeriod=" + goodsWorkingPeriod + ", goodsModifiedPossibilityCount="
				+ goodsModifiedPossibilityCount + ", goodsImageReg=" + goodsImageReg + ", goodsPreRequestsAnswerType="
				+ goodsPreRequestsAnswerType + ", goodsPreRequest=" + goodsPreRequest + ", userIdCode=" + userIdCode
				+ ", goodsRegDate=" + goodsRegDate + ", goodsTopCategory=" + goodsTopCategory + ", goodsSubCategory="
				+ goodsSubCategory + "]";
	}
	public String getGoodsCode() {
		return goodsCode;
	}
	public void setGoodsCode(String goodsCode) {
		this.goodsCode = goodsCode;
	}
	public String getGoodsSubCategoryCode() {
		return goodsSubCategoryCode;
	}
	public void setGoodsSubCategoryCode(String goodsSubCategoryCode) {
		this.goodsSubCategoryCode = goodsSubCategoryCode;
	}
	public String getGoodsName() {
		return goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	public String getGoodsDescription() {
		return goodsDescription;
	}
	public void setGoodsDescription(String goodsDescription) {
		this.goodsDescription = goodsDescription;
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
	public String getGoodsImageReg() {
		return goodsImageReg;
	}
	public void setGoodsImageReg(String goodsImageReg) {
		this.goodsImageReg = goodsImageReg;
	}
	public String getGoodsPreRequestsAnswerType() {
		return goodsPreRequestsAnswerType;
	}
	public void setGoodsPreRequestsAnswerType(String goodsPreRequestsAnswerType) {
		this.goodsPreRequestsAnswerType = goodsPreRequestsAnswerType;
	}
	public String getGoodsPreRequest() {
		return goodsPreRequest;
	}
	public void setGoodsPreRequest(String goodsPreRequest) {
		this.goodsPreRequest = goodsPreRequest;
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
	public GoodsTopCategory getGoodsTopCategory() {
		return goodsTopCategory;
	}
	public void setGoodsTopCategory(GoodsTopCategory goodsTopCategory) {
		this.goodsTopCategory = goodsTopCategory;
	}
	public GoodsSubCategory getGoodsSubCategory() {
		return goodsSubCategory;
	}
	public void setGoodsSubCategory(GoodsSubCategory goodsSubCategory) {
		this.goodsSubCategory = goodsSubCategory;
	}
}