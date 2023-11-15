package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import application.enums.WorkerLevel;
import entities.Departament;
import entities.HoursContract;
import entities.Worker;

public class Program {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter departament's name: ");
		String departamentName = sc.nextLine();
		System.out.println("Enter worker data: ");
		System.out.print("Name: ");
		String workerName = sc.nextLine();
		System.out.print("Level: ");
		String workerLevel = sc.nextLine();
		System.out.print("Salary: ");
		double baseSalary = sc.nextDouble();
		Worker worker = new Worker (workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Departament(departamentName));
		
		System.out.print("How many contracts? ");
		int n = sc.nextInt();
		
		for (int i = 0; i<n; i++) {
			System.out.println("Enter contract #" +(i+1)+" data:");
			System.out.print("Date (DD/MM/YYYY): ");
			Date contractDate = sdf.parse(sc.next());
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			System.out.print("Duration (hours): ");
			int hours = sc.nextInt();
			HoursContract contract = new HoursContract(contractDate, valuePerHour, hours);
			worker.addContract(contract);
			//Aqui foi criado a função para adicionar tudo isto na lista contract criada lá na classe do Worker
		}
		
		System.out.println();
		System.out.print("Enter month and year to calculate income (MM/YYYY): ");
		String monthAndYear = sc.next();
		int month = Integer.parseInt(monthAndYear.substring(0,2));
		/*Criamos uma variavel month para receber o mês, em seguida convertemos 
		 * de String para Int com Integer.parseInt, e definimos com substring o começo e aonde queremos 
		 * parar com 0 e 2*/
		int year = Integer.parseInt(monthAndYear.substring(3));
		System.out.println("Name: " + worker.getName());
		System.out.println("Departament: " + worker.getDepartament().getName());
		/*Acessamos o objeto departamento dentro do worker, logo em seguida 
		 * puxamos o nome do departamento dentro do departament*/
		System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));
		
		
		
		sc.close();
	}

}
