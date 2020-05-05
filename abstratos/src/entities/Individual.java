package entities;

public class Individual extends TaxPayer {

	private Double healthPayments;
	
	public Individual() {
		super();
	}

	public Individual(String name, Double anualIncome, Double healthPayments) {
		super(name, anualIncome);
		this.healthPayments = healthPayments;
	}

	@Override
	public Double Tax(){
		if (getAnualIncome() < 20000.0) {
			return getAnualIncome() * 0.15 - healthPayments * 0.5;
		}
		else
			return getAnualIncome() * 0.25 - healthPayments * 0.5;
	}
}
