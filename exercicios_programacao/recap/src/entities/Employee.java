package entities;

public class Employee {

	public String Name;
	public Double Salario;
	public Double Aumento;
	
	public double SalarioAumento(){
		return Salario + Aumento;
	}
	
	}


