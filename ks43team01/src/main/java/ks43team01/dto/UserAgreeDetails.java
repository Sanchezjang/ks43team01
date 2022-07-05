package ks43team01.dto;

public class UserAgreeDetails {
	private String userTermsAgreementDetailsCode;
	private String userTermsAgreementCheckCode;
	private String userAgreeTermsKind;
	private String userRegId;
	private String userRegDate;
	private String userAplctYear;
	private String userAplctStartDay;
	private String userAplctEndDay;
	private String userUse;
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("UserAgreeDetails [userTermsAgreementDetailsCode=");
		builder.append(userTermsAgreementDetailsCode);
		builder.append(", userTermsAgreementCheckCode=");
		builder.append(userTermsAgreementCheckCode);
		builder.append(", userAgreeTermsKind=");
		builder.append(userAgreeTermsKind);
		builder.append(", userRegId=");
		builder.append(userRegId);
		builder.append(", userRegDate=");
		builder.append(userRegDate);
		builder.append(", userAplctYear=");
		builder.append(userAplctYear);
		builder.append(", userAplctStartDay=");
		builder.append(userAplctStartDay);
		builder.append(", userAplctEndDay=");
		builder.append(userAplctEndDay);
		builder.append(", userUse=");
		builder.append(userUse);
		builder.append("]");
		return builder.toString();
	}
	public String getUserTermsAgreementDetailsCode() {
		return userTermsAgreementDetailsCode;
	}
	public void setUserTermsAgreementDetailsCode(String userTermsAgreementDetailsCode) {
		this.userTermsAgreementDetailsCode = userTermsAgreementDetailsCode;
	}
	public String getUserTermsAgreementCheckCode() {
		return userTermsAgreementCheckCode;
	}
	public void setUserTermsAgreementCheckCode(String userTermsAgreementCheckCode) {
		this.userTermsAgreementCheckCode = userTermsAgreementCheckCode;
	}
	public String getUserAgreeTermsKind() {
		return userAgreeTermsKind;
	}
	public void setUserAgreeTermsKind(String userAgreeTermsKind) {
		this.userAgreeTermsKind = userAgreeTermsKind;
	}
	public String getUserRegId() {
		return userRegId;
	}
	public void setUserRegId(String userRegId) {
		this.userRegId = userRegId;
	}
	public String getUserRegDate() {
		return userRegDate;
	}
	public void setUserRegDate(String userRegDate) {
		this.userRegDate = userRegDate;
	}
	public String getUserAplctYear() {
		return userAplctYear;
	}
	public void setUserAplctYear(String userAplctYear) {
		this.userAplctYear = userAplctYear;
	}
	public String getUserAplctStartDay() {
		return userAplctStartDay;
	}
	public void setUserAplctStartDay(String userAplctStartDay) {
		this.userAplctStartDay = userAplctStartDay;
	}
	public String getUserAplctEndDay() {
		return userAplctEndDay;
	}
	public void setUserAplctEndDay(String userAplctEndDay) {
		this.userAplctEndDay = userAplctEndDay;
	}
	public String getUserUse() {
		return userUse;
	}
	public void setUserUse(String userUse) {
		this.userUse = userUse;
	}
}
