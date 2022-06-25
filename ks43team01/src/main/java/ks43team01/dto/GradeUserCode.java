package ks43team01.dto;

public class GradeUserCode {
	private String gradeUserCode;
	private String grade_name;
	private String grade_accumulate_exp;
	@Override
	public String toString() {
		return "GradeUserCode [gradeUserCode=" + gradeUserCode + ", grade_name=" + grade_name
				+ ", grade_accumulate_exp=" + grade_accumulate_exp + "]";
	}
	public String getGradeUserCode() {
		return gradeUserCode;
	}
	public void setGradeUserCode(String gradeUserCode) {
		this.gradeUserCode = gradeUserCode;
	}
	public String getGrade_name() {
		return grade_name;
	}
	public void setGrade_name(String grade_name) {
		this.grade_name = grade_name;
	}
	public String getGrade_accumulate_exp() {
		return grade_accumulate_exp;
	}
	public void setGrade_accumulate_exp(String grade_accumulate_exp) {
		this.grade_accumulate_exp = grade_accumulate_exp;
	}
}
