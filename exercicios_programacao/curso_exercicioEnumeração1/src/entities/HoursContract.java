package entities;

import java.time.LocalDate;

public class HoursContract {
	private LocalDate date;
	private Double valuePerHour;
	private Integer hours;
	

	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public Double getValuePerHour() {
		return valuePerHour;
	}
	public void setValuePerHour(Double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}
	public Integer getHours() {
		return hours;
	}
	public void setHours(Integer hours) {
		this.hours = hours;
	}
	public HoursContract(LocalDate date, Double valuePerHour, Integer hours) {
	
		this.date = date;
		this.valuePerHour = valuePerHour;
		this.hours = hours;
	}
	public HoursContract(LocalDate date, int hours) {
		this.date = date;
		this.hours = hours;
	}
	
	
	public double totalValue() {
		return hours * valuePerHour;
		
	}
	@Override
	public String toString() {
		
		return  String.format("%.2f", totalValue());
	}
	
	
	
	
}
