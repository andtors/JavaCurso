package application;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class Program {
	
	
	public static void main(String[] args) {
		/*Quando a class calculator é estatico não há necessidade de 
		 * Instanciar ela, ou seja quando for delegar uma class toda 
		 * para as funções (calculos), não há necessidade de instanciar*/
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter radius: ");
		double radius = sc.nextDouble();
		
		double c = Calculator.circumference(radius);
		double v = Calculator.volume(radius);
		
		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", Calculator.PI);
		
		sc.close();
		
	
	}
	}
