package entities;

public class Company extends TaxPayer{
	private Integer employeeQuantity;

	public Integer getEmployeeQuantity() {
		return employeeQuantity;
	}

	public Company(String name, double anualIncome, Integer employeeQuantity) {
		super(name, anualIncome);
		this.employeeQuantity = employeeQuantity;
	}

	public void setEmployeeQuantity(Integer employeeQuantity) {
		this.employeeQuantity = employeeQuantity;
	}
	
	@Override
	public double tax() {
		if (employeeQuantity >= 10) {
			return (anualIncome * 16) / 100;
			
		}
		else {
			return (anualIncome * 14) / 100;
		}
	}
}
