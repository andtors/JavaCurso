package application;

import java.util.Scanner;

import entities.Persons;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int val = 0;
		String valnam = null;
		int max = 0;
		String maxnam = null;
				
		System.out.println("Quantas pessoas vai digitar?");
		int n = sc.nextInt();
		
		
		Persons[] vectname = new Persons[n];
		Persons[] vectage = new Persons[n];
		
		sc.nextLine();
		
		
		
		
		for (int i=0; i<vectname.length; i++) {
		
			System.out.printf("Nome: ");
			String name = sc.nextLine();
			vectname[i] = new Persons(name);
			valnam = vectname[i].getName();
			System.out.printf("Idade: ");
			int age = sc.nextInt();
			vectage[i] = new Persons(age);
			val = vectage[i].getAge();

	 				if (max < val) {
	 					max = vectage[i].getAge();
	 					maxnam = valnam;
					}
	 		sc.nextLine();
			
			
			
		}
		
		for(int i=0; i<vectage.length; i++) {
			
			System.out.printf("Dados da %da pessoa:\n", i + 1);
			System.out.println("Nome " + vectname[i].getName());	
			System.out.println("Idade " + vectage[i].getAge());
		}
		
		
		System.out.println("Pessoa mais velha: " + maxnam);
		
		sc.close();
		

	}

}
