package entities;

import java.time.LocalDateTime;
import java.util.Date;

public class Installment {
	
	private LocalDateTime dueDate;
	private Double amount;
	
	public LocalDateTime getDueDate() {
		return dueDate;
	}
	public void setDueDate(LocalDateTime dueDate) {
		this.dueDate = dueDate;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public Installment(Double amount, LocalDateTime dueDate) {
		this.dueDate = dueDate;
		this.amount = amount;
	}	

	
	
	public Installment(Double amount) {
		this.amount = amount;
	}
	
}
