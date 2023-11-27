package entities;

public class BussinesAccount extends Account{
	
	private Double loanLimit; 
	
	public BussinesAccount() {
		super();
		
	}

	public BussinesAccount(Integer number, String holder, Double balance, Double loanLimits) {
		super(number, holder, balance);
		this.loanLimit = loanLimits;
	}

	public Double getLoanLimits() {
		return loanLimit;
	}

	public void setLoanLimits(Double loanLimit) {
		this.loanLimit = loanLimit;
	}
	
	public void loan(double amount) {
		if (amount <= loanLimit) {
			balance += amount - 10;
		}
	}
	@Override
	
	public void withdraw(double amount) {
		super.withdraw(amount);
	
		balance -= 2.0;
	}
	
	
	
}