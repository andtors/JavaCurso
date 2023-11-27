package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of tax payers:");
		int n = sc.nextInt();
		List<TaxPayer> list = new ArrayList<>();
		
		
		
		for(int i = 1; i<=n; i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.printf("Individual or comapany (i/c)? "); 
			char  ch = sc.next().charAt(0);
		
			System.out.print("Name:");
			sc.nextLine();
			String taxName = sc.nextLine();
			System.out.print("Anual Income: ");
			double taxAnualInc = sc.nextDouble();
			
			if (ch == 'i') {
				System.out.print("Health expenditures:");
				double taxHealth = sc.nextDouble();
				list.add(new Individual(taxName, taxAnualInc, taxHealth));
			}
			
			else{
				System.out.print("Number of employees: ");
				int taxEmployeesQnt = sc.nextInt();
				list.add(new Company(taxName, taxAnualInc, taxEmployeesQnt));
			}
			
		}
		
		System.out.println("TAXES PAID:");
		
		for(TaxPayer t : list) {
			System.out.println(t.getName() + ": $ " + String.format("%.2f", t.tax()));
		}
		
		double sum = 0;
		for(TaxPayer t : list) {
			sum += t.tax();
		}
		System.out.println("Total taxes: $ " + sum);
		
		
	
		
		sc.close();
		

	}

}
