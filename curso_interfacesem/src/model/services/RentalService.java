
package model.services;

import java.time.Duration;

import model.entities.CarRental;
import model.entities.Invoice;

public class RentalService {

	private Double pricePerDay;
	private Double pricePerHour;
	
	private TaxServices taxServices;
	//Em vez de depender da BrazilTaxService, ele irá depender da interface TaxService que é mais generica, enquanto que a BrazilTaxService irá depender da TaxService

	public RentalService(Double pricePerDay, Double pricePerHour, TaxServices taxServices) {
		this.pricePerDay = pricePerDay;
		this.pricePerHour = pricePerHour;
		this.taxServices = taxServices;
		//No construtor ele recebe a classe Taxservice generica, porém quando formar instanciar no programa, pode se implementar qualquer outra que tenha dependencia a taxService
	}
	
	public void processInvoice(CarRental carRental) {
		
		double minutes = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();		
		//Como temos que arrendondar a hora para cima caso haja minutos a mais, pegamos a diferença de uma data em minutos e depois manualmente pegamos a hora como abaixo
		double hours = minutes / 60.0;
		
		double basicPayment;
		if (hours <= 12.0) {
			basicPayment = pricePerHour * Math.ceil(hours);
			//Math.ceil arredonda a data, hora, minuto, segunda sempre para cima
		}
		else {
			basicPayment = pricePerDay * Math.ceil(hours / 24);
		}

		double tax = taxServices.tax(basicPayment);

		carRental.setInvoice(new Invoice(basicPayment, tax));
		//Com isso temos um metodo que invoca outra classe com informações contidas nessa classe
	}
}