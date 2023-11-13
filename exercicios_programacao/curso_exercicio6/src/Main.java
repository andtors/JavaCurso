import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int cod1, peca1, cod2, peca2;
		double valor1, valor2;
		
		System.out.println("Insira o numero da primeira peça:");
		cod1 = sc.nextInt();
		System.out.println("Insira a quantidade da primeira peça:");
		peca1 = sc.nextInt();
		System.out.println("Insira o valor da primeira peça");
		valor1 = sc.nextDouble();
		
		System.out.println("Insira o numero da segunda peça:");
		cod2 = sc.nextInt();
		System.out.println("Insira a quantidade da segunda peça:");
		peca2 = sc.nextInt();
		System.out.println("Insira o valor da segunda peça");
		valor2 = sc.nextDouble();
		
		double resultado = valor1 + valor2;
		
		System.out.printf(" A primeira peça d núm %d e sua qntd: %d \n A segunda peça de núm %d e sua qntd: %d \n Custam juntas: R$ %.2f", cod1, peca1, cod2, peca2, resultado);
		
		
		sc.close();
	}

}
