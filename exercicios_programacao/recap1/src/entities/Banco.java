package entities;

public class Banco {
	public String Nome;
	public Double Patrimonio = 17000.00;
	public Double Credito;
	
	public double SacarPatrimonio(double sacar){
		return Patrimonio = Patrimonio - sacar;
	}
	
	
	
	public double DebitarPatrimonio(double debito){
		return Patrimonio = Patrimonio + debito;
	}


}
