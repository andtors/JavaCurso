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
		System.out.println("Enter the number of tax payers:");
		int n = sc.nextInt();
		List<TaxPayer> taxpayerlist1 = new ArrayList<>();
		for (int i = 1; i <= n; i++){
			System.out.println("Tax payer #" + i  + " data:");
			sc.nextLine();
			System.out.print("Individual or company? (i/c)?");
			char ch = sc.next().charAt(0);
			sc.nextLine();
			
			System.out.print("Name:");
			String taxName = sc.nextLine();
			System.out.print("Anual income:");
			Double taxAnualInc = sc.nextDouble();
			
			if(ch == 'i') {
			System.out.print("Health expenditures: ");
			Double taxHealth = sc.nextDouble();
			taxpayerlist1.add(new Individual(taxName, taxAnualInc, taxHealth));
			}
			else {
				System.out.print("Number of employees:");
				int taxEmployees = sc.nextInt();
				taxpayerlist1.add(new Company(taxName, taxAnualInc, taxEmployees));
			}
			
			for (TaxPayer tpl : taxpayerlist1) {
				tpl.tax();
			}
		}
		
		
		
		
		System.out.println("Taxes paid:");
		for (TaxPayer tpl : taxpayerlist1) {
			System.out.println(tpl.getName() + ": $" + tpl.tax());
		}
		
		double taxtotal =  0;
		for (TaxPayer tpl : taxpayerlist1) {
			taxtotal += tpl.tax();
		}
		
		System.out.println("Total taxes: " + taxtotal);
		
		sc.close();

	}

}
