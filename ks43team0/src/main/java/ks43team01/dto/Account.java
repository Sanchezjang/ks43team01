package ks43team01.dto;

public class Account {
	private String accountSubjectCode;
	private String accountName;
	private String profitLossClassification;
	private String accountUse;
	private String accountAmend;
	private String accountRegDate;
	private String userIdCode;
	private String accountYear;
	
	@Override
	public String toString() {
		return "Account [accountSubjectCode=" + accountSubjectCode + ", accountName=" + accountName
				+ ", profitLossClassification=" + profitLossClassification + ", accountUse=" + accountUse
				+ ", accountAmend=" + accountAmend + ", accountRegDate=" + accountRegDate + ", userIdCode=" + userIdCode
				+ ", accountYear=" + accountYear + "]";
	}
	public String getAccountSubjectCode() {
		return accountSubjectCode;
	}
	public void setAccountSubjectCode(String accountSubjectCode) {
		this.accountSubjectCode = accountSubjectCode;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public String getProfitLossClassification() {
		return profitLossClassification;
	}
	public void setProfitLossClassification(String profitLossClassification) {
		this.profitLossClassification = profitLossClassification;
	}
	public String getAccountUse() {
		return accountUse;
	}
	public void setAccountUse(String accountUse) {
		this.accountUse = accountUse;
	}
	public String getAccountAmend() {
		return accountAmend;
	}
	public void setAccountAmend(String accountAmend) {
		this.accountAmend = accountAmend;
	}
	public String getAccountRegDate() {
		return accountRegDate;
	}
	public void setAccountRegDate(String accountRegDate) {
		this.accountRegDate = accountRegDate;
	}
	public String getUserIdCode() {
		return userIdCode;
	}
	public void setUserIdCode(String userIdCode) {
		this.userIdCode = userIdCode;
	}
	public String getAccountYear() {
		return accountYear;
	}
	public void setAccountYear(String accountYear) {
		this.accountYear = accountYear;
	}
}