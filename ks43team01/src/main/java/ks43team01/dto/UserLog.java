package ks43team01.dto;

public class UserLog {
	private String loginNum;
	private String loginDate;
	private String loginIp;
	private String userIdCode;
	private String userOS;
	private String userBrowser;
	private String buyerExp;
	private String sellerExp;
	

	public String getUserOS() {
		return userOS;
	}
	public void setUserOS(String userOS) {
		this.userOS = userOS;
	}
	public String getUserBrowser() {
		return userBrowser;
	}
	public void setUserBrowser(String user_Browser) {
		this.userBrowser = user_Browser;
	}
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("UserLog [loginNum=");
		builder.append(loginNum);
		builder.append(", loginDate=");
		builder.append(loginDate);
		builder.append(", loginIp=");
		builder.append(loginIp);
		builder.append(", userIdCode=");
		builder.append(userIdCode);
		builder.append(", userOS=");
		builder.append(userOS);
		builder.append(", userBrowser=");
		builder.append(userBrowser);
		builder.append(", buyerExp=");
		builder.append(buyerExp);
		builder.append(", sellerExp=");
		builder.append(sellerExp);
		builder.append("]");
		return builder.toString();
	}
	public String getLoginNum() {
		return loginNum;
	}
	public void setLoginNum(String loginNum) {
		this.loginNum = loginNum;
	}
	public String getLoginDate() {
		return loginDate;
	}
	public void setLoginDate(String loginDate) {
		this.loginDate = loginDate;
	}
	public String getLoginIp() {
		return loginIp;
	}
	public void setLoginIp(String loginIp) {
		this.loginIp = loginIp;
	}
	public String getUserIdCode() {
		return userIdCode;
	}
	public void setUserIdCode(String userIdCode) {
		this.userIdCode = userIdCode;
	}
	public String getBuyerExp() {
		return buyerExp;
	}
	public void setBuyerExp(String buyerExp) {
		this.buyerExp = buyerExp;
	}
	public String getSellerExp() {
		return sellerExp;
	}
	public void setSellerExp(String sellerExp) {
		this.sellerExp = sellerExp;
	}
	
	
}
