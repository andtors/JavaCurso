package entities;

public /*final*/ class SavingsAccount extends Account{
	/*A palavra final antes do class serve para definir ao programa
	 * que não havera subclasses que se extendam a está classe*/
	private Double interestRate;
	
	public SavingsAccount() {
		super();
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}

	public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}
	
	public void updateBalance() {
		balance += balance * interestRate;
	}
	
	@Override
	/*Inserimos o Override para informar ao compilador e ao programador 
	 * que este metodo está em uma superclasse*/
	public /*final*/ void withdraw(double amount) {
		/*final também serve em metodos para defirnir que ele não
		 * será sobreposto por outras sublasses que utilizem o mesmo metodo*/
		balance -= amount;
	}

	/*Por padrão é interessante colocar já o final nos metodos para que não haja inconsistencias
	 * na hora de sobrepor informações, além de prover mais segurança ao código*/
	
	
}
