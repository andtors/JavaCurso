package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import entities.Contract;
import entities.Installment;
import entities.services.ContractServices;
import entities.services.PaypalServices;

public class Program {
	public static void main(String[] args) { 
	
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("Entre os dados do contrato: ");
		System.out.print("Numero:");
		int number = sc.nextInt();
		System.out.print("Data (dd/MM/yyyy): ");
		LocalDate date = LocalDate.parse(sc.next(), dtf);
		System.out.print("Valor do contrato: ");
		double totalValue = sc.nextDouble();
		
		Contract contract = new Contract(number, date, totalValue);
		
		System.out.print("Entre com o numero de parcelas: ");
		int months = sc.nextInt();
		
		ContractServices contractServices = new ContractServices(new PaypalServices());
		
		contractServices.processContract(contract, months);
		
		System.out.println("Parcelas:");
		for (Installment installment : contract.getInstallment()) {
			System.out.println(installment);
		}
		
		
		
		sc.close();
		
	}
}
