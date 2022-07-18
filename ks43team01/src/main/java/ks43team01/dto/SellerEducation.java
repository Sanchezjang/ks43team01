package ks43team01.dto;

public class SellerEducation {

	private String expertFinalEducationCode;
	private String userIdCode;
	private String expertSchoolName;
	private String expertMajor;
	private String expertFinalState;
	private String expertAcademicDocument;
	private String expertRegDate;
	private String expertUpdateDate;
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SellerEducation [expertFinalEducationCode=");
		builder.append(expertFinalEducationCode);
		builder.append(", userIdCode=");
		builder.append(userIdCode);
		builder.append(", expertSchoolName=");
		builder.append(expertSchoolName);
		builder.append(", expertMajor=");
		builder.append(expertMajor);
		builder.append(", expertFinalState=");
		builder.append(expertFinalState);
		builder.append(", expertAcademicDocument=");
		builder.append(expertAcademicDocument);
		builder.append(", expertRegDate=");
		builder.append(expertRegDate);
		builder.append(", expertUpdateDate=");
		builder.append(expertUpdateDate);
		builder.append("]");
		return builder.toString();
	}
	public String getExpertFinalEducationCode() {
		return expertFinalEducationCode;
	}
	public void setExpertFinalEducationCode(String expertFinalEducationCode) {
		this.expertFinalEducationCode = expertFinalEducationCode;
	}
	public String getUserIdCode() {
		return userIdCode;
	}
	public void setUserIdCode(String userIdCode) {
		this.userIdCode = userIdCode;
	}
	public String getExpertSchoolName() {
		return expertSchoolName;
	}
	public void setExpertSchoolName(String expertSchoolName) {
		this.expertSchoolName = expertSchoolName;
	}
	public String getExpertMajor() {
		return expertMajor;
	}
	public void setExpertMajor(String expertMajor) {
		this.expertMajor = expertMajor;
	}
	public String getExpertFinalState() {
		return expertFinalState;
	}
	public void setExpertFinalState(String expertFinalState) {
		this.expertFinalState = expertFinalState;
	}
	public String getExpertAcademicDocument() {
		return expertAcademicDocument;
	}
	public void setExpertAcademicDocument(String expertAcademicDocument) {
		this.expertAcademicDocument = expertAcademicDocument;
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
