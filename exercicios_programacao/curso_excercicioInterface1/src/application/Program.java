package application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Contract;
import entities.Installment;
import entities.services.ContractServices;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		List<Contract> instal = new ArrayList<>();
		
		
		System.out.println("Entre os dados do contrato: ");
		System.out.print("Numero: ");
		int numberContract = sc.nextInt();
		sc.nextLine();
		System.out.print("Data (dd/MM/yyyy): ");
		LocalDateTime dateContract = LocalDateTime.parse(sc.nextLine(), dtf);
		System.out.print("Valor do contrato: ");
		double valorContract = sc.nextDouble();
		System.out.print("Entre com os numeros das parcelas: ");
		int quantityContract  = sc.nextInt();
		
		for(int i=1; i<= quantityContract; i++) {
			LocalDateTime month = dateContract.plusMonths(1);
			int months = i++;
			double amount = valorContract/quantityContract;
			Contract contract = new Contract (numberContract, dateContract, valorContract, new Installment(amount, month));
			
			instal.add(contract);
			
		}
		for (Contract ins : instal) {
			


			System.out.println(ins.getInstallment().getDueDate() + " - " + ins.getInstallment().getAmount());
		}

		
		System.out.println("Parcelas:");
		
		
		
		sc.close();

	}

}
