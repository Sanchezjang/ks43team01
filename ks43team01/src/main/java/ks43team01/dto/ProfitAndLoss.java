package ks43team01.dto;

public class ProfitAndLoss {
	private Spending spending;
	private Sales sales;
	
	@Override
	public String toString() {
		return "ProfitAndLoss [spending=" + spending + ", sales=" + sales + "]";
	}

	public Sales getSales() {
		return sales;
	}

	public void setSales(Sales sales) {
		this.sales = sales;
	}

	public Spending getSpending() {
		return spending;
	}

	public void setSpanding(Spending spending) {
		this.spending = spending;
	}
	
}
