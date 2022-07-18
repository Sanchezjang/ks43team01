package ks43team01.dto;


public class Point {
	private String pointDetailsCode;
	private String userIdCode;
	private String pointStandardDetailsCode;
	private int pointAmount;
	private String userEmail;	
	private String pointHistoryRegDate;
	
	private PointStandardDetails pointStandardDetails;
	private PointSaveByGrade PointSaveByGrade;
	private User user;
	private GradeUserCode gradeUserCode;
	
	
	@Override
	public String toString() {
		return "Point [userIdCode=" + userIdCode + ", pointStandardDetailsCode=" + pointStandardDetailsCode
				+ ", pointAmount=" + pointAmount + ", userEmail=" + userEmail + ", pointHistoryRegDate="
				+ pointHistoryRegDate + ", pointDetailsCode=" + pointDetailsCode + ", pointStandardDetails="
				+ pointStandardDetails + ", PointSaveByGrade=" + PointSaveByGrade + ", user=" + user
				+ ", gradeUserCode=" + gradeUserCode + "]";
	}
	public String getUserIdCode() {
		return userIdCode;
	}
	public void setUserIdCode(String userIdCode) {
		this.userIdCode = userIdCode;
	}
	public String getPointStandardDetailsCode() {
		return pointStandardDetailsCode;
	}
	public void setPointStandardDetailsCode(String pointStandardDetailsCode) {
		this.pointStandardDetailsCode = pointStandardDetailsCode;
	}
	public int getPointAmount() {
		return pointAmount;
	}
	public void setPointAmount(int pointAmount) {
		this.pointAmount = pointAmount;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getPointHistoryRegDate() {
		return pointHistoryRegDate;
	}
	public void setPointHistoryRegDate(String pointHistoryRegDate) {
		this.pointHistoryRegDate = pointHistoryRegDate;
	}
	public String getPointDetailsCode() {
		return pointDetailsCode;
	}
	public void setPointDetailsCode(String pointDetailsCode) {
		this.pointDetailsCode = pointDetailsCode;
	}
	public PointStandardDetails getPointStandardDetails() {
		return pointStandardDetails;
	}
	public void setPointStandardDetails(PointStandardDetails pointStandardDetails) {
		this.pointStandardDetails = pointStandardDetails;
	}
	public PointSaveByGrade getPointSaveByGrade() {
		return PointSaveByGrade;
	}
	public void setPointSaveByGrade(PointSaveByGrade pointSaveByGrade) {
		PointSaveByGrade = pointSaveByGrade;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public GradeUserCode getGradeUserCode() {
		return gradeUserCode;
	}
	public void setGradeUserCode(GradeUserCode gradeUserCode) {
		this.gradeUserCode = gradeUserCode;
	}
	
	
	
}
