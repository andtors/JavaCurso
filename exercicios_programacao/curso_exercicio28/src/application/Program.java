package application;

import java.util.Scanner;

import util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		
		
		System.out.println("What is the dollar price?");
		double dollarprice = sc.nextDouble();
		
		System.out.println("How many dollar will be bought?");
		double dollarbought = sc.nextDouble();
		
		double dolarsiof = CurrencyConverter.dolarfinal(dollarbought, dollarprice);
		
		System.out.println("Amount to be paid in reais " + dolarsiof);
		
		sc.close();
	}

}
