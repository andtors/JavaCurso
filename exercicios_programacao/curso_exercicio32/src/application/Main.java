package application;

import java.util.Scanner;

import entities.Persons;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantas pessoas serão digitadas?");
		
		int n = sc.nextInt();
		Persons[] vect = new Persons[n];
		
		for (int i=0; i<vect.length; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			int age = sc.nextInt();
			double height = sc.nextDouble();
			vect[i] = new Persons (name, age, height);
			
		}
			
		for (int i=0; i<vect.length; i++) {
			System.out.println("Dados da " + i + 1 +"a pessoa");
			System.out.println("Nome: " + vect[i].getName());
			System.out.println("Idade: " + vect[i].getAge());
			System.out.println("Altura: " + vect[i].getHeight());
			
		}
		
		
		sc.close();

	}

}
