package ks43team01.dto;

public class PointSaveByReview {
	private String point_review_save_standard_grade_code;
	private String user_id_code;
	private String point_standard_code;
	private int point_save_reg_review;
	
	@Override
	public String toString() {
		return "PointSaveByReview [point_review_save_standard_grade_code=" + point_review_save_standard_grade_code
				+ ", user_id_code=" + user_id_code + ", point_standard_code=" + point_standard_code
				+ ", point_save_reg_review=" + point_save_reg_review + "]";
	}
	public String getPoint_review_save_standard_grade_code() {
		return point_review_save_standard_grade_code;
	}
	public void setPoint_review_save_standard_grade_code(String point_review_save_standard_grade_code) {
		this.point_review_save_standard_grade_code = point_review_save_standard_grade_code;
	}
	public String getUser_id_code() {
		return user_id_code;
	}
	public void setUser_id_code(String user_id_code) {
		this.user_id_code = user_id_code;
	}
	public String getPoint_standard_code() {
		return point_standard_code;
	}
	public void setPoint_standard_code(String point_standard_code) {
		this.point_standard_code = point_standard_code;
	}
	public int getPoint_save_reg_review() {
		return point_save_reg_review;
	}
	public void setPoint_save_reg_review(int point_save_reg_review) {
		this.point_save_reg_review = point_save_reg_review;
	}
	
	
	
	
	
}
