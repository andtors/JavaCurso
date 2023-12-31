package application;

import java.util.Scanner;

import Entities.Rent;

public class Program {
	public static void main(String[] args) {
		Scanner  sc = new Scanner(System.in);
		Rent [] vect = new Rent [10];
		/*Quando queremos definir a quantidade de 'casas' disponiveis
		 * inserimos o valor, lembrando que começa do 0, ou seja 
		 * 10 casas = 0 ao 9*/
		System.out.println("How many rooms will be rented?");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			/*Começa do 1 pois não existe casa/hospedagem numero 0*/
			System.out.println();
			System.out.println("Rebt #" + i + ":");
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.next();
			System.out.print("Room: ");
			int roomNumber = sc.nextInt();
			
			vect[roomNumber] = new Rent(name, email);
			/*podemos inserir o int direto na varivavel desta forma
			 * quando delegamos a quantidade de casas dentro da array*/
		}
		System.out.println();
		System.out.println("Busy rooms: ");
		for (int i = 0; i<10; i++) {
			if (vect[i] !=  null) {
				/*Para que não imprima as casas nulas e em ordem crescente 
				 *fazemos um if*/
				System.out.println(i + ": " + vect[i]);
			
			}
		}
		sc.close();
		
	}
}
