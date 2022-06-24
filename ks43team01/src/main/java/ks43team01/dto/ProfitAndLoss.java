package ks43team01.dto;
public class ProfitAndLoss {

	private Spending spending;
	private Account account;
	private Sales sales;
	
	@Override
	public String toString() {
		return "ProfitAndLoss [spending=" + spending + ", sales=" + sales + ", account=" + account + "]";
	}
	public Spending getSpending() {
		return spending;
	}
	public void setSpending(Spending spending) {
		this.spending = spending;
	}
	public Sales getSales() {
		return sales;
	}
	public void setSales(Sales sales) {
		this.sales = sales;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
}
