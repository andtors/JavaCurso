package application;

import java.util.Scanner;

import entities.Numbers;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantos numeros vai digitar?");
		int n = sc.nextInt();
		
		Numbers[] vect = new Numbers[n];
		
		for (int i=0; i<vect.length; i++) {
			sc.nextLine();
			double numbers = sc.nextDouble();
			vect[i] = new Numbers(numbers);
		}
		System.out.println("Valores: ");
		for(int i=0; i<vect.length; i++) {
			System.out.println(vect[i].getNumbers());
		}
		System.out.println("Soma:");
		double sum = 0;
		for(int i=0; i<vect.length; i++) {
			
			sum += vect[i].getNumbers();
		
		}
		
		System.out.println(sum);
		System.out.println("Média: ");
		double avg = sum / vect.length;
		System.out.println(avg);
		
		sc.close();

	}

}
