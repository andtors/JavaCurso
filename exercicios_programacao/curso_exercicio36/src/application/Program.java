package application;

import java.util.Scanner;

import entities.Persons;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double med = 0;
		double amax = 0;
		double amin = 0;
		double val = 0;
		double sum = 0;
		int qntd = 0;
		System.out.println("QUANTAS PESSOAS SERÃO DIGITADAS? ");
		int n = sc.nextInt();
		
		
		Persons[] vect = new Persons[n];
		
		for (int i = 0; i<vect.length; i++) {
			sc.nextLine();
			System.out.printf("Altura da " + (i+1) + "a pessoa:");
			double altura = sc.nextDouble();
			System.out.printf("Genero da " + (i+1)  + "a pessoa: 1f/2h");
			int genero = sc.nextInt();
			vect[i] = new Persons(altura, genero);
			
			
			val = vect[i].getAltura();
			genero = vect[i].getGenero();
			
			
			if (amax < val) {
				
				amax = vect[i].getAltura();
				
			}
			
			if  (vect[i].getAltura() > amax) {
				
				amin = vect[i].getAltura();
				
			}
			
			if (genero == 1) {
				sum += vect[i].getAltura();
				med = sum / vect.length;
			}
			
			if (genero == 2) {
				qntd += 1;
				
			}
			
		}
		System.out.println("Altura maxima é de:" + amax);
		System.out.println("Altura minima é de : " + amin);
		System.out.println("Média de altura feminina é: " + med);
		System.out.println("Quantidade de homens é de: " + qntd);
		sc.close();

	}

}
