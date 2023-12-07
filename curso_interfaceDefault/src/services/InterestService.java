package services;

import java.security.InvalidParameterException;

public interface InterestService {
	
	
	double getInterestRate();
	//InterestRate precisa estar nas classes porque a interface não armazena dados nem objetos e construtores, apenas metodos
	
	default double payment (double amount, int months) {
			if (months < 1) {
				throw new InvalidParameterException("Months must be greater than zero");
			}
			return amount * Math.pow(1.0 +  getInterestRate() / 100.0, months);
			//Math.pow: lógica elevado ao que queremos, no caso ao numero de meses
		}
	
	//Neste caso criamos a lógica do metodo direto na interface, já que ambas classes utilizam a mesma logica porém com juros diferentes, e com isso colocamos default no inicio
	}

