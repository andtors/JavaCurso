package entities;

public class OutsourcedEmployee extends Employee{
	private Double additionalCharge;

	public	OutsourcedEmployee() {
		
	}
	
	public Double getAdditionalCharge() {
		return additionalCharge;
	}

	public void setAdditionalCharge(Double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}

	public OutsourcedEmployee(String name, Integer hour, Double valuePerHour, Double additionalCharge) {
		super(name, hour, valuePerHour);
		this.additionalCharge = additionalCharge;
	}
	
	@Override
	public double payment() {
		return super.payment() + additionalCharge * 1;
		/*Ele está retornando o resultado do metodo payment na classe
		 * Employee somando ao additionalcharge vezes 1*/
	}
}
