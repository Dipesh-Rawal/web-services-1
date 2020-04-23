package Problem3;

public class FinancialInfo {
	private int id, income, outcome, saving;

	public FinancialInfo(int id, int income, int outcome, int saving) {
		super();
		this.id = id;
		this.income = income;
		this.outcome = outcome;
		this.saving = saving;
	}

	@Override
	public String toString() {
		return "FinancialInfo [id=" + id + ", income=" + income + ", outcome=" + outcome + ", saving=" + saving + "]";
	}

}
