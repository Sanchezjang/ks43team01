package ks43team01.dto;

public class GoodsRequest {

	private String goodsRequestsCode;
	private String goodsPreRequest;
	private String goodsPreRequestsAnswerType;
	private String userIdCode;
	private String goodsRequestsRegDate;
	
	@Override
	public String toString() {
		return "GoodsRequest [goodsRequestsCode=" + goodsRequestsCode + ", goodsPreRequest=" + goodsPreRequest
				+ ", goodsPreRequestsAnswerType=" + goodsPreRequestsAnswerType + ", userIdCode=" + userIdCode
				+ ", goodsRequestsRegDate=" + goodsRequestsRegDate + "]";
	}
	public String getGoodsRequestsCode() {
		return goodsRequestsCode;
	}
	public void setGoodsRequestsCode(String goodsRequestsCode) {
		this.goodsRequestsCode = goodsRequestsCode;
	}
	public String getGoodsPreRequest() {
		return goodsPreRequest;
	}
	public void setGoodsPreRequest(String goodsPreRequest) {
		this.goodsPreRequest = goodsPreRequest;
	}
	public String getGoodsPreRequestsAnswerType() {
		return goodsPreRequestsAnswerType;
	}
	public void setGoodsPreRequestsAnswerType(String goodsPreRequestsAnswerType) {
		this.goodsPreRequestsAnswerType = goodsPreRequestsAnswerType;
	}
	public String getUserIdCode() {
		return userIdCode;
	}
	public void setUserIdCode(String userIdCode) {
		this.userIdCode = userIdCode;
	}
	public String getGoodsRequestsRegDate() {
		return goodsRequestsRegDate;
	}
	public void setGoodsRequestsRegDate(String goodsRequestsRegDate) {
		this.goodsRequestsRegDate = goodsRequestsRegDate;
	}
	
}
