package ks43team01.dto;

public class SellerCareer {

	private String expertCareerDetailsCode;
	private String userIdCode;
	private String expertCompanyName;
	private String expertWorkDepartment;
	private String expertPosition;
	private String expertWorkPlace;
	private String expertWorkDate;
	private String expertEtc;
	private String expertStayUse;
	private String expertCareerProofMattersAttachments;
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("sellerCareer [expertCareerDetailsCode=");
		builder.append(expertCareerDetailsCode);
		builder.append(", userIdCode=");
		builder.append(userIdCode);
		builder.append(", expertCompanyName=");
		builder.append(expertCompanyName);
		builder.append(", expertWorkDepartment=");
		builder.append(expertWorkDepartment);
		builder.append(", expertPosition=");
		builder.append(expertPosition);
		builder.append(", expertWorkPlace=");
		builder.append(expertWorkPlace);
		builder.append(", expertWorkDate=");
		builder.append(expertWorkDate);
		builder.append(", expertEtc=");
		builder.append(expertEtc);
		builder.append(", expertStayUse=");
		builder.append(expertStayUse);
		builder.append(", expertCareerProofMattersAttachments=");
		builder.append(expertCareerProofMattersAttachments);
		builder.append("]");
		return builder.toString();
	}
	
	public String getExpertCareerDetailsCode() {
		return expertCareerDetailsCode;
	}
	public void setExpertCareerDetailsCode(String expertCareerDetailsCode) {
		this.expertCareerDetailsCode = expertCareerDetailsCode;
	}
	public String getUserIdCode() {
		return userIdCode;
	}
	public void setUserIdCode(String userIdCode) {
		this.userIdCode = userIdCode;
	}
	public String getExpertCompanyName() {
		return expertCompanyName;
	}
	public void setExpertCompanyName(String expertCompanyName) {
		this.expertCompanyName = expertCompanyName;
	}
	public String getExpertWorkDepartment() {
		return expertWorkDepartment;
	}
	public void setExpertWorkDepartment(String expertWorkDepartment) {
		this.expertWorkDepartment = expertWorkDepartment;
	}
	public String getExpertPosition() {
		return expertPosition;
	}
	public void setExpertPosition(String expertPosition) {
		this.expertPosition = expertPosition;
	}
	public String getExpertWorkPlace() {
		return expertWorkPlace;
	}
	public void setExpertWorkPlace(String expertWorkPlace) {
		this.expertWorkPlace = expertWorkPlace;
	}
	public String getExpertWorkDate() {
		return expertWorkDate;
	}
	public void setExpertWorkDate(String expertWorkDate) {
		this.expertWorkDate = expertWorkDate;
	}
	public String getExpertEtc() {
		return expertEtc;
	}
	public void setExpertEtc(String expertEtc) {
		this.expertEtc = expertEtc;
	}
	public String getExpertStayUse() {
		return expertStayUse;
	}
	public void setExpertStayUse(String expertStayUse) {
		this.expertStayUse = expertStayUse;
	}
	public String getExpertCareerProofMattersAttachments() {
		return expertCareerProofMattersAttachments;
	}
	public void setExpertCareerProofMattersAttachments(String expertCareerProofMattersAttachments) {
		this.expertCareerProofMattersAttachments = expertCareerProofMattersAttachments;
	}
	
}
