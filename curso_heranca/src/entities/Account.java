package entities;

public class Account {
	private Integer number;
	private String holder;
	protected Double balance;
	/*Quando um objeto da classe é utilizado/referenciado em outra classe
	 * precisamos alterar para protected, pois private autoriza a usar o 
	 * objeto apenas dentro da propria classe em que foi instanciada*/
	
	public Account() {
		
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}


	public Account(Integer number, String holder, Double balance) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
	}
	
	public void withdraw(double amount) {
		balance -= amount + 5;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
}
