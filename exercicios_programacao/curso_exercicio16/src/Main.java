import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int senha = 0;
		
		System.out.println("Insira a senha:");
		senha = sc.nextInt();
		
		
		while (senha != 2002) {
			System.out.println("Senha incorreta");
			senha = sc.nextInt();
		}

		
		System.out.println("Senha correta");
		
		sc.close();
	}

}
