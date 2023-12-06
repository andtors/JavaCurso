package entities.services;

import entities.Contract;

public abstract class ContractServices  implements OnlinePaymentService{
	public void processContract(Contract contract, Integer month) {
		double valorMes;
		valorMes = contract.getTotalValue() / month;
	}
}
