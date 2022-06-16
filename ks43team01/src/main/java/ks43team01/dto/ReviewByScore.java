package ks43team01.dto;

public class ReviewByScore {
	private String reviewScoreStandardCode;
	private String reviewStarScore;
	private String reviewScoreStandardDetails;
	
	
	@Override
	public String toString() {
		return "ScoreByReview [reviewScoreStandardCode=" + reviewScoreStandardCode + ", reviewStarScore="
				+ reviewStarScore + ", reviewScoreStandardDetails=" + reviewScoreStandardDetails + "]";
	}
	public String getReviewScoreStandardCode() {
		return reviewScoreStandardCode;
	}
	public void setReviewScoreStandardCode(String reviewScoreStandardCode) {
		this.reviewScoreStandardCode = reviewScoreStandardCode;
	}
	public String getReviewStarScore() {
		return reviewStarScore;
	}
	public void setReviewStarScore(String reviewStarScore) {
		this.reviewStarScore = reviewStarScore;
	}
	public String getReviewScoreStandardDetails() {
		return reviewScoreStandardDetails;
	}
	public void setReviewScoreStandardDetails(String reviewScoreStandardDetails) {
		this.reviewScoreStandardDetails = reviewScoreStandardDetails;
	}
}
