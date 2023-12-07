package entities;

public class Employee implements Comparable<Employee>{
	//Para podermos mudar a ordem de uma lista que possui dois tipos de objetos com tipos diferentes, precisamos implementar uma interface comparable
	private String name;
	private Double salary;
	
	public Employee(String name, Double salary) {
		
		this.name = name;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	@Override
	public int compareTo(Employee other) {
		return name.compareTo(other.getName());
		//Com o metodo compareTo, definimos como queremos comparar a nossa lista, no casso estamos comparando o objeto name na lista Employee
		
		/*Caso queiramos comparar por salario seria:
		 * return salary.compareTo(other.getSalary())
		 * 
		 * Em ordem decrescente:
		 * return -salary.compareTo(other.getSalary())*/
		
		
		
	}
}
