package application;

import java.util.Arrays;
import java.util.Scanner;

import entities.Students;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite quantos alunos terão:");
		int n = sc.nextInt();
		double scor = 0;
		String aprovado = null;
		String talvez = null;
		double avg = 0;
		double sum = 0;
		
		Students[] vect = new Students[n];
		for (int i=0; i<vect.length; i++) {
			
			sc.nextLine();
			System.out.printf("Nome: ");
			String name = sc.nextLine();
			vect[i] = new Students(name);
			talvez = vect[i].getName();
			System.out.println(sum);
			for (int i1=0; i1<2; i1++) {
			
				System.out.printf("Notas:");
				double score = sc.nextDouble();
				vect[i1] = new Students(score);
				sum += vect[i].getScore();
				scor = sum / 2;
				System.out.println(sum);
				avg = scor;
			}
				
			
			System.out.println("Média: " + scor);
				if (avg >= 6) {
					aprovado = talvez;
					
				}
		
			
			
		}
	
		System.out.println("Aprovados: " + aprovado);
		
		
		
		sc.close();

	}

}
