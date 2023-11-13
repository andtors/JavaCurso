package application;

import java.util.Scanner;

import entities.triangle;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		triangle triangle = new triangle();
		/*Necessario está linha para dizer que iremos atribuir informações abaixo a class*/
		System.out.println("Insira a largura do triangulo:");
		triangle.width = sc.nextDouble();
		System.out.println("Insira a altura do triangulo:");
		triangle.height = sc.nextDouble();
		
		double area = triangle.area();
		double perimeter = triangle.perimeter();
		double diagonal = triangle.diagonal();
		/*Neste caso eu tive que criar uma variavel para alocar espaço na memoria dos resultados da class*/
		System.out.printf("A area é de: %.2f\n O perimetro é de: %.4f\n A diagonal é de: %.4f", area, perimeter, diagonal);
		sc.close();

	}

}
