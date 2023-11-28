package model.entities;

import model.exceptions.DomainException;

public class Account {
	private Integer number;
	private String holer;
	private Double balance;
	private Double withdrawLimit;
	public Integer getNumber() {
		return number;
	}
	public Account() {
		
	}
	
	
	public Account(Integer number, String holer, Double balance, Double withdrawLimit) {
		this.number = number;
		this.holer = holer;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	public String getHoler() {
		return holer;
	}
	public void setHoler(String holer) {
		this.holer = holer;
	}
	public Double getBalance() {
		return balance;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	public Double getWithdrawLimit() {
		return withdrawLimit;
	}
	public void setWithdrawLimit(Double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}
	
	public void deposit(double amount) {
		amount += balance;
	}

	public void withdraw(double amount) {
		if (amount > withdrawLimit) {
			throw new DomainException("Withdraw error: The amount exceeds withdraw limit");
		}
		
		else if(amount > balance) {
			throw new DomainException("Withdraw error: Not enough balance");
		}
		
		
		else {
			balance = balance -= amount;
			
		}
		
		
	}
	
	}
