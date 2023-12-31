package entities;

public class Employees {
	private Integer id;
	private String name;
	private Double salary;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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
	public Employees(Integer id, String name, Double salary) {
		
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		int i = 0;
		return "Employees #"+ (i+1)+"\n Id:" + id + "\n Name:" + name + "\n Salary:" + salary+"\n";
	}
	
	public void percentageSalary(double percentage) {
		salary = salary + salary * percentage /100.0;
	}
	
	
	
	
	
}
