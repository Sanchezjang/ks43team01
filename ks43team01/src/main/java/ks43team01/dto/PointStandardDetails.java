package ks43team01.dto;

public class PointStandardDetails {
	private String pointStandardDetailsCode;
	private String pointStandardCode;
	private String pointStandardDetailsName;
	private String userIdCode;
	private String pointStandardDetailsRegDate;
	
	@Override
	public String toString() {
		return "PointStandardDetails [pointStandardCode=" + pointStandardCode + ", pointStandardDetailsName="
				+ pointStandardDetailsName + ", userIdCode=" + userIdCode + ", pointStandardDetailsRegDate="
				+ pointStandardDetailsRegDate + ", pointStandardDetailsCode=" + pointStandardDetailsCode + "]";
	}
	public String getPointStandardDetailsCode() {
		return pointStandardDetailsCode;
	}
	public void setPointStandardDetailsCode(String pointStandardDetailsCode) {
		this.pointStandardDetailsCode = pointStandardDetailsCode;
	}
	public String getPointStandardCode() {
		return pointStandardCode;
	}
	public void setPointStandardCode(String pointStandardCode) {
		this.pointStandardCode = pointStandardCode;
	}
	public String getPointStandardDetailsName() {
		return pointStandardDetailsName;
	}
	public void setPointStandardDetailsName(String pointStandardDetailsName) {
		this.pointStandardDetailsName = pointStandardDetailsName;
	}
	public String getUserIdCode() {
		return userIdCode;
	}
	public void setUserIdCode(String userIdCode) {
		this.userIdCode = userIdCode;
	}
	public String getPointStandardDetailsRegDate() {
		return pointStandardDetailsRegDate;
	}
	public void setPointStandardDetailsRegDate(String pointStandardDetailsRegDate) {
		this.pointStandardDetailsRegDate = pointStandardDetailsRegDate;
	}
	
}
