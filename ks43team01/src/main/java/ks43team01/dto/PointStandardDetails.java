package ks43team01.dto;

public class PointStandardDetails {
	private String pointStandardDetailsCode;
	private String point_standard_name;
	private String pointStandardDetailsName;
	private String userIdCode;
	private String pointStandardDetailsRegDate;
	
	@Override
	public String toString() {
		return "PointStandardDetails [pointStandardDetailsCode=" + pointStandardDetailsCode + ", point_standard_name="
				+ point_standard_name + ", pointStandardDetailsName=" + pointStandardDetailsName + ", userIdCode="
				+ userIdCode + ", pointStandardDetailsRegDate=" + pointStandardDetailsRegDate + "]";
	}
	public String getPointStandardDetailsCode() {
		return pointStandardDetailsCode;
	}
	public void setPointStandardDetailsCode(String pointStandardDetailsCode) {
		this.pointStandardDetailsCode = pointStandardDetailsCode;
	}
	public String getPoint_standard_name() {
		return point_standard_name;
	}
	public void setPoint_standard_name(String point_standard_name) {
		this.point_standard_name = point_standard_name;
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
