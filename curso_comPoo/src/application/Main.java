package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;
public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		 
		Triangle x, y;
		/*Triangle é a classe, a, b, c são os objetos da classe*/
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("Insira as medidas do triangulo x:");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Insira as medidas do triangulo y:");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		
		double areaX = x.area();
		double areaY = y.area();
		
		System.out.printf("Area do triangulo X é de: %.4f%n", areaX);
		System.out.printf("Area do triangulo Y é de: %.4f%n", areaY);
		
		if (areaX > areaY) {
			System.out.println("Triangulo X é maior");
		} 
		else {
			System.out.println("Triangulo Y é maior");
		}
		sc.close();
	}

}