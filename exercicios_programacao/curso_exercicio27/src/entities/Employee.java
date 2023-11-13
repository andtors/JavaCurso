package entities;

public class Employee {
	public String Name;
	public double GrossSalary;
	public double Tax = 1000.00;
	
	public double NetSalary() {
		return GrossSalary - Tax;
	}		
	public void IncreaseSalary(double percentage) {
		GrossSalary = ((GrossSalary * percentage) / 100) + GrossSalary ;
	}
	
	public String toString() {
		return "Empregado: " + Name + " $ ";

	}
}
