package entities;

public class BussinesAccount extends Account{
	/*Extends define que essa classe terá o mesmo comportamento e dados da classe
	 * Account*/
	private Double loanLimit; 
	
	public BussinesAccount() {
		super();
		/*Por padrão inserimos o super para defirnir que se houver
		 * algum tipo de logica no Account, ele irá alterar aqui também*/
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
		/*Neste caso ele usou a lógica do metodo da classe super (Account)
		 * e após isso retirou o montante de 2 como está abaixo*/
		balance -= 2.0;
	}
	
	
	
}
