package ks43team01.dto;

public class SellerBusiness {
	private String expertBusinessCode;
	private String userIdCode;
	private String expertBusinessField;
	private String expertDetailedBusiness;
	private String expertRetentionTechnology;
	private String expertIntroduction;
	private String expertRegDate;
	private String expertUpdateDate;
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SellerBusiness [expertBusinessCode=");
		builder.append(expertBusinessCode);
		builder.append(", userIdCode=");
		builder.append(userIdCode);
		builder.append(", expertBusinessField=");
		builder.append(expertBusinessField);
		builder.append(", expertDetailedBusiness=");
		builder.append(expertDetailedBusiness);
		builder.append(", expertRetentionTechnology=");
		builder.append(expertRetentionTechnology);
		builder.append(", expertIntroduction=");
		builder.append(expertIntroduction);
		builder.append(", expertRegDate=");
		builder.append(expertRegDate);
		builder.append(", expertUpdateDate=");
		builder.append(expertUpdateDate);
		builder.append("]");
		return builder.toString();
	}

	public String getExpertBusinessCode() {
		return expertBusinessCode;
	}

	public void setExpertBusinessCode(String expertBusinessCode) {
		this.expertBusinessCode = expertBusinessCode;
	}

	public String getUserIdCode() {
		return userIdCode;
	}

	public void setUserIdCode(String userIdCode) {
		this.userIdCode = userIdCode;
	}

	public String getExpertBusinessField() {
		return expertBusinessField;
	}

	public void setExpertBusinessField(String expertBusinessField) {
		this.expertBusinessField = expertBusinessField;
	}

	public String getExpertDetailedBusiness() {
		return expertDetailedBusiness;
	}

	public void setExpertDetailedBusiness(String expertDetailedBusiness) {
		this.expertDetailedBusiness = expertDetailedBusiness;
	}

	public String getExpertRetentionTechnology() {
		return expertRetentionTechnology;
	}

	public void setExpertRetentionTechnology(String expertRetentionTechnology) {
		this.expertRetentionTechnology = expertRetentionTechnology;
	}

	public String getExpertIntroduction() {
		return expertIntroduction;
	}

	public void setExpertIntroduction(String expertIntroduction) {
		this.expertIntroduction = expertIntroduction;
	}

	public String getExpertRegDate() {
		return expertRegDate;
	}

	public void setExpertRegDate(String expertRegDate) {
		this.expertRegDate = expertRegDate;
	}

	public String getExpertUpdateDate() {
		return expertUpdateDate;
	}

	public void setExpertUpdateDate(String expertUpdateDate) {
		this.expertUpdateDate = expertUpdateDate;
	}
	
}
