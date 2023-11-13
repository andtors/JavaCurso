import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);	
		float  a,b,c;
		
		System.out.println("Insira a primeira área");
		a = sc.nextFloat();
		System.out.println("Insira a segunda área");
		b = sc.nextFloat();
		System.out.println("Insira a terceira área");
		c = sc.nextFloat();
		
		float triangulo = (a * c) / 2 ;
		float circulo = (float) ((c * c) * 3.14159);
		float trapezio = ((a + b) * c ) / 2;
		float quadrado = b * b;
		float retangulo = a * b;
		
		System.out.printf("A área total do triângulo é %.2f%n", triangulo);
		System.out.printf("A área total do circulo é %.2f%n", circulo);
		System.out.printf("A área total do trapezio é %.2f%n", trapezio);
		System.out.printf("A área total do quadrado é %.2f%n", quadrado);
		System.out.printf("A área total do retangulo é %.2f%n", retangulo);
		
				
		
		sc.close();
	}

}
