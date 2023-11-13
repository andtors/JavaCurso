package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double xA, xB, xC, yA, yB, yC;
		Locale.setDefault(Locale.US);
		System.out.println("Insira as medidas do triangulo x:");
		xA = sc.nextDouble();
		xB = sc.nextDouble();
		xC = sc.nextDouble();
		System.out.println("Insira as medidas do triangulo y:");
		yA = sc.nextDouble();
		yB = sc.nextDouble();
		yC = sc.nextDouble();
		
		double p = (xA + xB + xC)/2.0;
		double areaX = Math.sqrt(p*(p - xA)*(p - xB)*(p - xC));
		
		p = (yA + yB + yC)/2.0;
		double areaY = Math.sqrt(p*(p - yA)*(p - yB)*(p - yC));
		
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
