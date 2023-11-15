package application;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Departament;
import entities.HoursContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Program {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner (System.in);
		System.out.printf("Enter department's name: ");
		String name = sc.nextLine();
		Departament departament = new Departament(name);
		
		System.out.printf("Enter worker data:");
		String dateInutil = sc.nextLine();
		System.out.printf("Name: ");
		String workerName = sc.nextLine();
		System.out.printf("Level: ");
		String  workerLevel = sc.nextLine();
		System.out.printf("Base salary: ");
		Double baseSalary = sc.nextDouble();
		Worker worker = new Worker(workerName, WorkerLevel.JUNIOR, baseSalary);
		
		System.out.println(departament);
		System.out.println(worker);
		
		System.out.printf("How many contracts this worker? ");
		int n = sc.nextInt();
		
		List<HoursContract> list = new ArrayList<>();
		
		for (int i = 0; i<n; i++) {
		
			System.out.println("Enter contracts to #" + (i+1) + " data:");
			System.out.printf("Date: ");
			String inputData = sc.next();
		    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		    LocalDate dataDoUsuario = LocalDate.parse(inputData, formatter);
			System.out.printf("Value per hour: ");
			Double valuePerHour = sc.nextDouble();
			System.out.printf("Duration (hours): ");
			int hours = sc.nextInt();
			HoursContract hourscontract = new HoursContract (dataDoUsuario, valuePerHour,hours);
			list.add(hourscontract);
			hourscontract.totalValue();
			
			}
		
		System.out.printf("Enter month and year to calculate income (dd/MM/yyyy):  ");
		String datecalc = sc.next();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate dataDoUsuariocalc = LocalDate.parse(datecalc, formatter);
		HoursContract hourscontract = list.stream().filter(x ->x.getDate() == dataDoUsuariocalc).findFirst().orElse(null);
		
		if(hourscontract == null) {
			
			double sum = hourscontract.totalValue();
			sum += worker.totalSalary(sum);
		}
		
		else {
			double sum = hourscontract.totalValue();
			sum += worker.totalSalary(sum);
		}
	
		System.out.println(worker);
		sc.close();

	}

}
