package ks43team01.dto;

public class ReviewContentsReg {
	private String reviewCode;
	private String goodsBasicInfoCode;
	private String userIdCode;
	private String reviewScoreStandardCode;
	private String reviewContent;
	private int reviewRecommendationsCount;
	private int reviewDecommendationsCount;
	private String reviewRegDate;
	private int reviewRegBuyerExp;
	private String reviewRegIp;
	private String reviewStarScore;
	
	private GoodsBasicInfo goodsBasicInfo;
	private ReviewByScore scoreByReview; 
	private User user;
	private PointSaveByReview pointSaveByReview;
	
	
	
	@Override
	public String toString() {
		return "ReviewContentsReg [reviewCode=" + reviewCode + ", goodsBasicInfoCode=" + goodsBasicInfoCode
				+ ", userIdCode=" + userIdCode + ", reviewScoreStandardCode=" + reviewScoreStandardCode
				+ ", reviewContent=" + reviewContent + ", reviewRecommendationsCount=" + reviewRecommendationsCount
				+ ", reviewDecommendationsCount=" + reviewDecommendationsCount + ", reviewRegDate=" + reviewRegDate
				+ ", reviewRegBuyerExp=" + reviewRegBuyerExp + ", reviewRegIp=" + reviewRegIp + ", reviewStarScore="
				+ reviewStarScore + ", goodsBasicInfo=" + goodsBasicInfo + ", scoreByReview=" + scoreByReview
				+ ", user=" + user + ", pointSaveByReview=" + pointSaveByReview + "]";
	}
	public String getReviewCode() {
		return reviewCode;
	}
	public void setReviewCode(String reviewCode) {
		this.reviewCode = reviewCode;
	}
	public String getGoodsBasicInfoCode() {
		return goodsBasicInfoCode;
	}
	public void setGoodsBasicInfoCode(String goodsBasicInfoCode) {
		this.goodsBasicInfoCode = goodsBasicInfoCode;
	}
	public String getUserIdCode() {
		return userIdCode;
	}
	public void setUserIdCode(String userIdCode) {
		this.userIdCode = userIdCode;
	}
	public String getReviewScoreStandardCode() {
		return reviewScoreStandardCode;
	}
	public void setReviewScoreStandardCode(String reviewScoreStandardCode) {
		this.reviewScoreStandardCode = reviewScoreStandardCode;
	}
	public String getReviewContent() {
		return reviewContent;
	}
	public void setReviewContent(String reviewContent) {
		this.reviewContent = reviewContent;
	}
	public int getReviewRecommendationsCount() {
		return reviewRecommendationsCount;
	}
	public void setReviewRecommendationsCount(int reviewRecommendationsCount) {
		this.reviewRecommendationsCount = reviewRecommendationsCount;
	}
	public int getReviewDecommendationsCount() {
		return reviewDecommendationsCount;
	}
	public void setReviewDecommendationsCount(int reviewDecommendationsCount) {
		this.reviewDecommendationsCount = reviewDecommendationsCount;
	}
	public String getReviewRegDate() {
		return reviewRegDate;
	}
	public void setReviewRegDate(String reviewRegDate) {
		this.reviewRegDate = reviewRegDate;
	}
	public int getReviewRegBuyerExp() {
		return reviewRegBuyerExp;
	}
	public void setReviewRegBuyerExp(int reviewRegBuyerExp) {
		this.reviewRegBuyerExp = reviewRegBuyerExp;
	}
	public String getReviewRegIp() {
		return reviewRegIp;
	}
	public void setReviewRegIp(String reviewRegIp) {
		this.reviewRegIp = reviewRegIp;
	}
	public String getReviewStarScore() {
		return reviewStarScore;
	}
	public void setReviewStarScore(String reviewStarScore) {
		this.reviewStarScore = reviewStarScore;
	}
	public GoodsBasicInfo getGoodsBasicInfo() {
		return goodsBasicInfo;
	}
	public void setGoodsBasicInfo(GoodsBasicInfo goodsBasicInfo) {
		this.goodsBasicInfo = goodsBasicInfo;
	}
	public ReviewByScore getScoreByReview() {
		return scoreByReview;
	}
	public void setScoreByReview(ReviewByScore scoreByReview) {
		this.scoreByReview = scoreByReview;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public PointSaveByReview getPointSaveByReview() {
		return pointSaveByReview;
	}
	public void setPointSaveByReview(PointSaveByReview pointSaveByReview) {
		this.pointSaveByReview = pointSaveByReview;
	}
	
	
	
}
