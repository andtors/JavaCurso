import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int valor;
		
		System.out.println("Insira o valor entre 0,00 - 100,00");
		valor = sc.nextInt();
		
		if(valor <= 25) {
			System.out.println("Intervalo 0 - 25");
		}
		else if(valor <= 50) {
			System.out.println("Intervalo 25 - 50");
		}
		else if(valor <= 75) {
			System.out.println("Intervalo 50 - 75");
		}
		else if(valor <= 100) {
			System.out.println("Intervalo 75 - 100");
		}
		else {
			System.out.println("Fora do intervalo");
		}
		sc.close();
		
	}

}
