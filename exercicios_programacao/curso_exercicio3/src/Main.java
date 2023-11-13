

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner sc = new Scanner(System.in);
	
		double y;
		
		System.out.println("Insira o raio do circulo");
		y = sc.nextDouble();
		double raioquad = y * 2;
		double resultado = raioquad * 3.14159;
		
		System.out.printf("O valor dá área do circulo é %.4f", resultado);
		
		sc.close();
	}

}
