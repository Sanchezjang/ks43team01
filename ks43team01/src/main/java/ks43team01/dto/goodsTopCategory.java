package ks43team01.dto;

public class goodsTopCategory {

	private String	goodsTopCategoryName; 
	private String	goodsTopCategoryCode; 
	private String	userIdCode; 
	private String	goodsTopCategoryRegDate;
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("goodsTopCategory [goodsTopCategoryName=");
		builder.append(goodsTopCategoryName);
		builder.append(", goodsTopCategoryCode=");
		builder.append(goodsTopCategoryCode);
		builder.append(", userIdCode=");
		builder.append(userIdCode);
		builder.append(", goodsTopCategoryRegDate=");
		builder.append(goodsTopCategoryRegDate);
		builder.append("]");
		return builder.toString();
	}
	public String getGoodsTopCategoryName() {
		return goodsTopCategoryName;
	}
	public void setGoodsTopCategoryName(String goodsTopCategoryName) {
		this.goodsTopCategoryName = goodsTopCategoryName;
	}
	public String getGoodsTopCategoryCode() {
		return goodsTopCategoryCode;
	}
	public void setGoodsTopCategoryCode(String goodsTopCategoryCode) {
		this.goodsTopCategoryCode = goodsTopCategoryCode;
	}
	public String getUserIdocde() {
		return userIdCode;
	}
	public void setUserIdocde(String userIdocde) {
		this.userIdCode = userIdocde;
	}
	public String getGoodsTopCategoryRegDate() {
		return goodsTopCategoryRegDate;
	}
	public void setGoodsTopCategoryRegDate(String goodsTopCategoryRegDate) {
		this.goodsTopCategoryRegDate = goodsTopCategoryRegDate;
	}
	
	
	
	
	
}
