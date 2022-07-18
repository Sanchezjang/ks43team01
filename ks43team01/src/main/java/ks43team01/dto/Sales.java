package ks43team01.dto;

public class Sales {
	private String salesGroupCode;
	private String accountSubjectCode;
	private String salesYear;
	private String salesMonth;
	private String accountName;
	private String salesDate;
	private String salesAmount;
	private String salesInfo;
	private String userIdCode;
	private String salesRegDate;
	
	@Override
	public String toString() {
		return "Sales [salesGroupCode=" + salesGroupCode + ", accountSubjectCode=" + accountSubjectCode + ", salesYear="
				+ salesYear + ", salesMonth=" + salesMonth + ", accountName=" + accountName + ", salesDate=" + salesDate
				+ ", salesAmount=" + salesAmount + ", salesInfo=" + salesInfo + ", userIdCode=" + userIdCode
				+ ", salesRegDate=" + salesRegDate + "]";
	}
	public String getSalesGroupCode() {
		return salesGroupCode;
	}
	public void setSalesGroupCode(String salesGroupCode) {
		this.salesGroupCode = salesGroupCode;
	}
	public String getAccountSubjectCode() {
		return accountSubjectCode;
	}
	public void setAccountSubjectCode(String accountSubjectCode) {
		this.accountSubjectCode = accountSubjectCode;
	}
	public String getSalesYear() {
		return salesYear;
	}
	public void setSalesYear(String salesYear) {
		this.salesYear = salesYear;
	}
	public String getSalesMonth() {
		return salesMonth;
	}
	public void setSalesMonth(String salesMonth) {
		this.salesMonth = salesMonth;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public String getSalesDate() {
		return salesDate;
	}
	public void setSalesDate(String salesDate) {
		this.salesDate = salesDate;
	}
	public String getSalesAmount() {
		return salesAmount;
	}
	public void setSalesAmount(String salesAmount) {
		this.salesAmount = salesAmount;
	}
	public String getSalesInfo() {
		return salesInfo;
	}
	public void setSalesInfo(String salesInfo) {
		this.salesInfo = salesInfo;
	}
	public String getUserIdCode() {
		return userIdCode;
	}
	public void setUserIdCode(String userIdCode) {
		this.userIdCode = userIdCode;
	}
	public String getSalesRegDate() {
		return salesRegDate;
	}
	public void setSalesRegDate(String salesRegDate) {
		this.salesRegDate = salesRegDate;
	}
}