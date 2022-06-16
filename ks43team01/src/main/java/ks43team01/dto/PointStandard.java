package ks43team01.dto;


public class PointStandard {
	private String pointStandardCode;
	private String pointStandardName;
	private String userIdCode;
	private String pointStandardRegDate;
	
	@Override
	public String toString() {
		return "PointStandard [pointStandardCode=" + pointStandardCode + ", pointStandardName=" + pointStandardName
				+ ", userIdCode=" + userIdCode + ", pointStandardRegDate=" + pointStandardRegDate + "]";
	}
	public String getPointStandardCode() {
		return pointStandardCode;
	}
	public void setPointStandardCode(String pointStandardCode) {
		this.pointStandardCode = pointStandardCode;
	}
	public String getPointStandardName() {
		return pointStandardName;
	}
	public void setPointStandardName(String pointStandardName) {
		this.pointStandardName = pointStandardName;
	}
	public String getUserIdCode() {
		return userIdCode;
	}
	public void setUserIdCode(String userIdCode) {
		this.userIdCode = userIdCode;
	}
	public String getPointStandardRegDate() {
		return pointStandardRegDate;
	}
	public void setPointStandardRegDate(String pointStandardRegDate) {
		this.pointStandardRegDate = pointStandardRegDate;
	}
	
	
}
