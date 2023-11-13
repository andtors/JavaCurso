import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in); 
		double a,b,c,d;
		
		System.out.println("Insira o primeiro valor:");
		a = sc.nextDouble();
		System.out.println("Insira o segundo valor a ser somado ao primeiro");
		b = sc.nextDouble();
		System.out.println("Insira o terceiro valor:");
		c = sc.nextDouble();
		System.out.println("Insira o quarto valor a ser somado ao terceiro");
		d = sc.nextDouble();
		
		double resultado = a * b - c * d;
		
		System.out.printf("A diferença entre A somado com B menos C somado a D é: %.2f", resultado);
		
		
		sc.close();
	}

}
