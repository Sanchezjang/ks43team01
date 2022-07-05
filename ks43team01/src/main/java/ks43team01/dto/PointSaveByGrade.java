package ks43team01.dto;

public class PointSaveByGrade {
	private String pointBuySaveStandardGradeCode;
	private String gradeUserCode;
	private String pointStandardDetailsCode;
	private float  pointSaveByGradePercent;
	private String pointStandardDetailsName;
	private String pointSaveByGradeUnit;
	
	
	@Override
	public String toString() {
		return "PointSaveByGrade [pointBuySaveStandardGradeCode=" + pointBuySaveStandardGradeCode + ", gradeUserCode="
				+ gradeUserCode + ", pointStandardDetailsCode=" + pointStandardDetailsCode
				+ ", pointSaveByGradePercent=" + pointSaveByGradePercent + ", pointStandardDetailsName="
				+ pointStandardDetailsName + ", pointSaveByGradeUnit=" + pointSaveByGradeUnit + "]";
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
	public String getPointStandardDetailsCode() {
		return pointStandardDetailsCode;
	}
	public void setPointStandardDetailsCode(String pointStandardDetailsCode) {
		this.pointStandardDetailsCode = pointStandardDetailsCode;
	}
	public float getPointSaveByGradePercent() {
		return pointSaveByGradePercent;
	}
	public void setPointSaveByGradePercent(float pointSaveByGradePercent) {
		this.pointSaveByGradePercent = pointSaveByGradePercent;
	}
	public String getPointStandardDetailsName() {
		return pointStandardDetailsName;
	}
	public void setPointStandardDetailsName(String pointStandardDetailsName) {
		this.pointStandardDetailsName = pointStandardDetailsName;
	}
	public String getPointSaveByGradeUnit() {
		return pointSaveByGradeUnit;
	}
	public void setPointSaveByGradeUnit(String pointSaveByGradeUnit) {
		this.pointSaveByGradeUnit = pointSaveByGradeUnit;
	}
	
	
	
}
