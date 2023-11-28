package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid position!");
		} catch (InputMismatchException e) {
			System.out.println("Input error");
		}
		System.out.println("End of program");
		sc.close();
	}
	/*Neste exemplo criamos um vetor com varios nomes, e logo em seguida selecionamos
	 * qual posição queremos, se a posição não existir no vetor o programa em vez de dar
	 * erro ele irá trazer o texto "INPUT ERRO"
	 * 
	 * O mesmo vale para caso em vez de colocar numero coloque uma caractere, irá trazer
	 * o erro input error*/
}