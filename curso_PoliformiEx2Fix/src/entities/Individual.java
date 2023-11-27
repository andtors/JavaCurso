package entities;

public class Individual extends TaxPayer{
	private Double healthExpenditure;

	public Double getHealthExpenditure() {
		return healthExpenditure;
	}

	public Individual(String name, double anualIncome, Double healthExpenditure) {
		super(name, anualIncome);
		this.healthExpenditure = healthExpenditure;
	}

	public void setHealthExpenditure(Double healthExpenditure) {
		this.healthExpenditure = healthExpenditure;
	}
	
	
	@Override
	public double tax() {
		double tax = 0;
		if (anualIncome  <= 20000) {
			tax = 15;
			return ((anualIncome * tax) / 100) - (healthExpenditure / 2) ;
		
		}
		
		else {
			tax = 25;
			return ((anualIncome * tax) / 100) - (healthExpenditure / 2) ; 
		}
	}
}
