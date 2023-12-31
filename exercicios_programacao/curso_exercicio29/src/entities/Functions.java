package entities;

public class Functions {
	private int account;
	private String name;
	private double balance;
	
	public Functions(int account, String name, double balance) {
		this.account = account;
		this.name = name;
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}
	
	public int getAccount() {
		return account;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public void deposit (double money) {
		 this.balance += money;
	}	
	public void withdraw (double money) {
		this.balance -= money + 5;
	}
	
}
	