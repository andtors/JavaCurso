package entities;

import java.time.LocalDateTime;
import java.util.Date;

public class Contract {
	private Integer number;
	private LocalDateTime date;
	private Double totalValue;
	
	private Installment installment;

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}

	public Double getTotalValue() {
		return totalValue;
	}

	public Contract(Integer number, LocalDateTime date, Double totalValue, Installment installment) {
		this.number = number;
		this.date = date;
		this.totalValue = totalValue;
		this.installment = installment;
	}

	public void setTotalValue(Double totalValue) {
		this.totalValue = totalValue;
	}

	public Installment getInstallment() {
		return installment;
	}

	public void setInstallment(Installment installment) {
		this.installment = installment;
	}
	
	public Contract() {
		
	}
	
}
