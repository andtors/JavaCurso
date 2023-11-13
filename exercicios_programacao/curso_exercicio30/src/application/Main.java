package application;

import java.util.Scanner;

import entities.numbers;

public class Main {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Quantos numeros você vai digitar?");
		int n = sc.nextInt();
		numbers[] vect = new numbers[n];
		
		for (int i=0; i<vect.length; i++) {
			sc.nextLine();
			System.out.println("Digite um numero:");
			double numbers = sc.nextDouble();
			vect[i] = new numbers(numbers);
		}
		System.out.println();
		System.out.println("Números negativos:");
		
		for (int i=0; i<vect.length; i++) {
			if (vect[i].getNumbers() < 0){
			
				System.out.println(vect[i].getNumbers());
			}
		}
			
		sc.close();
		
	}

}
