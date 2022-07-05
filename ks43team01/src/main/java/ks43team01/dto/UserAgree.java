package ks43team01.dto;

public class UserAgree {
	private String userTermsAgreementCheckCode;
	private String userIdCode;
	private String userTermsKind;
	private String userTermsAgreementDetailsCode;
	private String userAgreeCheck;
	private String userAgreeDate;
	private String userRequiredInput;
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("UserAgree [userTermsAgreementCheckCode=");
		builder.append(userTermsAgreementCheckCode);
		builder.append(", userIdCode=");
		builder.append(userIdCode);
		builder.append(", userTermsKind=");
		builder.append(userTermsKind);
		builder.append(", userTermsAgreementDetailsCode=");
		builder.append(userTermsAgreementDetailsCode);
		builder.append(", userAgreeCheck=");
		builder.append(userAgreeCheck);
		builder.append(", userAgreeDate=");
		builder.append(userAgreeDate);
		builder.append(", userRequiredInput=");
		builder.append(userRequiredInput);
		builder.append("]");
		return builder.toString();
	}
	public String getUserTermsAgreementCheckCode() {
		return userTermsAgreementCheckCode;
	}
	public void setUserTermsAgreementCheckCode(String userTermsAgreementCheckCode) {
		this.userTermsAgreementCheckCode = userTermsAgreementCheckCode;
	}
	public String getUserIdCode() {
		return userIdCode;
	}
	public void setUserIdCode(String userIdCode) {
		this.userIdCode = userIdCode;
	}
	public String getUserTermsKind() {
		return userTermsKind;
	}
	public void setUserTermsKind(String userTermsKind) {
		this.userTermsKind = userTermsKind;
	}
	public String getUserTermsAgreementDetailsCode() {
		return userTermsAgreementDetailsCode;
	}
	public void setUserTermsAgreementDetailsCode(String userTermsAgreementDetailsCode) {
		this.userTermsAgreementDetailsCode = userTermsAgreementDetailsCode;
	}
	public String getUserAgreeCheck() {
		return userAgreeCheck;
	}
	public void setUserAgreeCheck(String userAgreeCheck) {
		this.userAgreeCheck = userAgreeCheck;
	}
	public String getUserAgreeDate() {
		return userAgreeDate;
	}
	public void setUserAgreeDate(String userAgreeDate) {
		this.userAgreeDate = userAgreeDate;
	}
	public String getUserRequiredInput() {
		return userRequiredInput;
	}
	public void setUserRequiredInput(String userRequiredInput) {
		this.userRequiredInput = userRequiredInput;
	}
}
