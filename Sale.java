

public class Sale {
	private SalesAssociate TheSalesAssociate;
	private double Amount;
	private double Commission;

	public Sale(SalesAssociate TheSalesAssociate) {
		this.TheSalesAssociate = TheSalesAssociate;
	}

	public double getAmount() {
		return Amount;
	}

	public void setAmount(double amount) {
		Amount = amount;
		this.CommissionCal();
	}

	public void CommissionCal() {
		if (TheSalesAssociate.getTitle() == "Retail Associate") {
			setCommission(getAmount() * 0.15);
		} else if (TheSalesAssociate.getTitle() == "Senior Sales Associate") {
			if (getAmount() < 150)
				setCommission(getAmount() * 0.20);
			else
				setCommission(getAmount() * 0.22);
		} else if (TheSalesAssociate.getTitle() == "Sales Manager") {
			if (getAmount() < 100)
				setCommission(getAmount() * 0.22);
			else
				setCommission(getAmount() * 0.25);
		}
	}

	public double getCommission() {
		return Commission;
	}

	public void setCommission(double commission) {
		Commission = commission;
	}

	public void print() {

		System.out.println("ID : " + TheSalesAssociate.getStoreId());
		System.out.println("name : "
				+ TheSalesAssociate.getSalesAssociateName());
		System.out.println("Title : " + TheSalesAssociate.getTitle());
		System.out.println("Amount : " + getAmount());
		System.out.println("Commission : " + getCommission());
		System.out.println("\n-----------------------------------------\n");

	}
}
