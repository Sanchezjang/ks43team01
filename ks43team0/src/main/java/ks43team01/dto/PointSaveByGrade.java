package ks43team01.dto;

public class PointSaveByGrade {
	private String pointBuySaveStandardGradeCode;
	private String gradeUserCode;
	private String pointStandardCode;
	private int pointSaveByGradePercent;
	private String pointSaveByGradeUnit;
	
	
	@Override
	public String toString() {
		return "PointSaveByGrade [pointBuySaveStandardGradeCode=" + pointBuySaveStandardGradeCode + ", gradeUserCode="
				+ gradeUserCode + ", pointStandardCode=" + pointStandardCode + ", pointSaveByGradePercent="
				+ pointSaveByGradePercent + ", pointSaveByGradeUnit=" + pointSaveByGradeUnit + "]";
	}
	public String getPointBuySaveStandardGradeCode() {
		return pointBuySaveStandardGradeCode;
	}
	public void setPointBuySaveStandardGradeCode(String pointBuySaveStandardGradeCode) {
		this.pointBuySaveStandardGradeCode = pointBuySaveStandardGradeCode;
	}
	public String getGradeUserCode() {
		return gradeUserCode;
	}
	public void setGradeUserCode(String gradeUserCode) {
		this.gradeUserCode = gradeUserCode;
	}
	public String getPointStandardCode() {
		return pointStandardCode;
	}
	public void setPointStandardCode(String pointStandardCode) {
		this.pointStandardCode = pointStandardCode;
	}
	public int getPointSaveByGradePercent() {
		return pointSaveByGradePercent;
	}
	public void setPointSaveByGradePercent(int pointSaveByGradePercent) {
		this.pointSaveByGradePercent = pointSaveByGradePercent;
	}
	public String getPointSaveByGradeUnit() {
		return pointSaveByGradeUnit;
	}
	public void setPointSaveByGradeUnit(String pointSaveByGradeUnit) {
		this.pointSaveByGradeUnit = pointSaveByGradeUnit;
	}
}
