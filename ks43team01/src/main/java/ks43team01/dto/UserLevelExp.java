package ks43team01.dto;


public class UserLevelExp {
	  
	private String levelUpBuyeyStandardDetailsCode;
	private String levelUpBuyerStandardCode;
	private String levelUpStandardDetail;
	private String levelUpExpAccumulate;
	private String levelUpExpLimit;
	private String userIdCode;
	private String levelUpBuyerStandardRegDate;
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("UserLevelExp [levelUpBuyeyStandardDetailsCode=");
		builder.append(levelUpBuyeyStandardDetailsCode);
		builder.append(", levelUpBuyerStandardCode=");
		builder.append(levelUpBuyerStandardCode);
		builder.append(", levelUpStandardDetail=");
		builder.append(levelUpStandardDetail);
		builder.append(", levelUpExpAccumulate=");
		builder.append(levelUpExpAccumulate);
		builder.append(", levelUpExpLimit=");
		builder.append(levelUpExpLimit);
		builder.append(", userIdCode=");
		builder.append(userIdCode);
		builder.append(", levelUpBuyerStandardRegDate=");
		builder.append(levelUpBuyerStandardRegDate);
		builder.append("]");
		return builder.toString();
	}
	public String getLevelUpBuyeyStandardDetailsCode() {
		return levelUpBuyeyStandardDetailsCode;
	}
	public void setLevelUpBuyeyStandardDetailsCode(String levelUpBuyeyStandardDetailsCode) {
		this.levelUpBuyeyStandardDetailsCode = levelUpBuyeyStandardDetailsCode;
	}
	public String getLevelUpBuyerStandardCode() {
		return levelUpBuyerStandardCode;
	}
	public void setLevelUpBuyerStandardCode(String levelUpBuyerStandardCode) {
		this.levelUpBuyerStandardCode = levelUpBuyerStandardCode;
	}
	public String getLevelUpStandardDetail() {
		return levelUpStandardDetail;
	}
	public void setLevelUpStandardDetail(String levelUpStandardDetail) {
		this.levelUpStandardDetail = levelUpStandardDetail;
	}
	public String getLevelUpExpAccumulate() {
		return levelUpExpAccumulate;
	}
	public void setLevelUpExpAccumulate(String levelUpExpAccumulate) {
		this.levelUpExpAccumulate = levelUpExpAccumulate;
	}
	public String getLevelUpExpLimit() {
		return levelUpExpLimit;
	}
	public void setLevelUpExpLimit(String levelUpExpLimit) {
		this.levelUpExpLimit = levelUpExpLimit;
	}
	public String getUserIdCode() {
		return userIdCode;
	}
	public void setUserIdCode(String userIdCode) {
		this.userIdCode = userIdCode;
	}
	public String getLevelUpBuyerStandardRegDate() {
		return levelUpBuyerStandardRegDate;
	}
	public void setLevelUpBuyerStandardRegDate(String levelUpBuyerStandardRegDate) {
		this.levelUpBuyerStandardRegDate = levelUpBuyerStandardRegDate;
	}
	
	
}
