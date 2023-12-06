
package services;

import java.time.LocalDate;

import entities.Contract;
import entities.Installment;

public class ContractService {

	private OnlinePaymentService onlinePaymentService;
	
	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}
	
	public void processContract(Contract contract, int months) {
		double basicQuota = contract.getTotalValue() / months;
        for (int i = 1; i <= months; i++) {
            LocalDate dueDate = contract.getDate().plusMonths(i);
            double interest = onlinePaymentService.interest(basicQuota, i);
          //Apenas com essa função já é possivel calcular o juros de cada mes
            double fee = onlinePaymentService.paymentFee(basicQuota + interest);
          //Calculo da taxa somado já ao juros
            double quota = basicQuota + interest + fee;
          //Soma de tudo, taxa e juros
            contract.getInstallments().add(new Installment(dueDate, quota));
        }
	}
}

