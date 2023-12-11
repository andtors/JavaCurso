
package entities.services;

import java.time.LocalDate;

import entities.Contract;
import entities.Installment;

public class ContractServices {
	
	private OnlinePaymentService onlinePaymentService;
	
	public ContractServices(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}
	
	public ContractServices(Contract contract, int months) {
		// TODO Auto-generated constructor stub
	}

	public void processContract(Contract contract, Integer months) {
		
		double valueMonth = contract.getTotalValue() / months;
		for (int i=0; i<months; i++) {
			
			LocalDate dueDate = contract.getDate().plusMonths(i);
			double paymentFee = onlinePaymentService.paymentFee(valueMonth);
			double paymentInterest = onlinePaymentService.interest(valueMonth, i);
			double totalMonth = paymentFee + paymentInterest + valueMonth;
			contract.getInstallment().add(new Installment(dueDate, totalMonth));
		}                                        
	}
}

