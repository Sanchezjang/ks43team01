package ks43team01.dto;

public class Spending {
	private String spendingGroupCode;
	private String accountName;
	private String spendingDate;
	private String spendingAmount;
	private String spendingInfo;
	private String userIdCode;
	private String spendingRegDate;
	
	@Override
	public String toString() {
		return "Spending [spendingGroupCode=" + spendingGroupCode + ", accountName=" + accountName + ", spendingDate="
				+ spendingDate + ", spendingAmount=" + spendingAmount + ", spendingInfo=" + spendingInfo
				+ ", userIdCode=" + userIdCode + ", spendingRegDate=" + spendingRegDate + "]";
	}
	public String getSpendingGroupCode() {
		return spendingGroupCode;
	}
	public void setSpendingGroupCode(String spendingGroupCode) {
		this.spendingGroupCode = spendingGroupCode;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public String getSpendingDate() {
		return spendingDate;
	}
	public void setSpendingDate(String spendingDate) {
		this.spendingDate = spendingDate;
	}
	public String getSpendingAmount() {
		return spendingAmount;
	}
	public void setSpendingAmount(String spendingAmount) {
		this.spendingAmount = spendingAmount;
	}
	public String getSpendingInfo() {
		return spendingInfo;
	}
	public void setSpendingInfo(String spendingInfo) {
		this.spendingInfo = spendingInfo;
	}
	public String getUserIdCode() {
		return userIdCode;
	}
	public void setUserIdCode(String userIdCode) {
		this.userIdCode = userIdCode;
	}
	public String getSpendingRegDate() {
		return spendingRegDate;
	}
	public void setSpendingRegDate(String spendingRegDate) {
		this.spendingRegDate = spendingRegDate;
	}
}