package entities;

public abstract class Account {
	/*Se inserirmos abstract na classe, não será possivel instanciar ela em outras partes do programa, o uso do abstract é para uma classe generica
	 * que contenha objetos que outras subclasses utilizarão*/
	private Integer number;
	private String holder;
	protected Double balance;
	
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

