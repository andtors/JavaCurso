package entities;

import entities.enums.WorkerLevel;

public class Worker {

	
	private String name;
	private WorkerLevel level;
	private Double baseSalary;
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public WorkerLevel getLevel() {
		return level;
	}
	public void setLevel(WorkerLevel level) {
		this.level = level;
	}
	public Double getBaseSalary() {
		return baseSalary;
	}
	public Worker(String name, WorkerLevel level, Double baseSalary) {

		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
	}
	@Override
	public String toString() {
		return "" + baseSalary;
	}
	
	public double totalSalary(double sum) {
		return baseSalary = sum + baseSalary;
		
	}
}
