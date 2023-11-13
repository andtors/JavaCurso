package application;

import java.util.Scanner;

import entities.Numbers;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int quant = 0;
		System.out.println("Quantos numeros vai digitar?");
		int n = sc.nextInt();
		
		Numbers[] vect = new Numbers[n];
		
		for (int i=0; i<vect.length; i++) {
			
			sc.nextLine();
			double number = sc.nextDouble();
			vect[i] = new Numbers(number);
			
		}
		System.out.println("Numeros pares:");
		for (int i=0; i<vect.length; i++) {
			if (vect[i].getNumber() % 2 == 0) {
			System.out.println(vect[i].getNumber());
			quant += 1;
			
			
		}
		}
		
		sc.close();
		
		System.out.println("Quantidade de pares: " + quant); 
	
	}
}
