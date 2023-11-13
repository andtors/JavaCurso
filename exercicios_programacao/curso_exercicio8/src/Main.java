import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a;
		
		System.out.println("Insira o numero inteiro:");
		a = sc.nextInt();
		
		if (a > 0) {
			System.out.println("Positivo");
		}
		else if (a < 0) {
			System.out.println("Negativo");
		}
		else {
			System.out.println("Não Negativo");
		}
		sc.close();
		
	}	
}
