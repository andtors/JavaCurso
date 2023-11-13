import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int a, b;
		
		System.out.println("Insira o primeiro número");
		a = sc.nextInt();
		
		System.out.println("Insira o segundo número");
		b = sc.nextInt();
		
		if(a % 2 == 0 && b % 2 == 0) {
			System.out.println("São multiplos");
		}
		else {
			System.out.println("Não são multiplos");
		}
		sc.close();
		

	}

}
