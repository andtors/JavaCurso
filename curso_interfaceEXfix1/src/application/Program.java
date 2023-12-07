package application;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Contract;
import entities.Installment;
import services.ContractService;
import services.PaypalServices;

public class Program {

	public static void main(String[] args) throws ParseException {

		/*A logica da interface seria o seguinte:
		 * 
		 * Numa classe tipo interface nesse caso a OnlinPaymentService, criaremos os metodos que iremos atribuir a todas as outras classes implementadas a ela,
		 * na PaypalService, que é uma classe implementada a ela, criaremos a lógica que deve ser seguida.
		 * e por fim, na ContractService, iremos criar a condição em que ela deve ser executda, neste caso ela precisa ser executada e ser inserida numa lista
		 * */
				
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("Entre os dados do contrato:");
		System.out.print("Numero: ");
		int number = sc.nextInt();
		System.out.print("Data (dd/MM/yyyy): ");
		LocalDate date = LocalDate.parse(sc.next(), fmt);
		System.out.print("Valor do contrato: ");
		double totalValue = sc.nextDouble();
		
		Contract obj = new Contract(number, date, totalValue);
		
		System.out.print("Entre com o numero de parcelas: ");
		int n = sc.nextInt();
		
		ContractService contractService = new ContractService(new PaypalServices());
		
		contractService.processContract(obj, n);
		
		System.out.println("Parcelas:");
		for (Installment installment : obj.getInstallments()) {
			System.out.println(installment);
		}
		
		sc.close();
	}
}