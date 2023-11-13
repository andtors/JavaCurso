import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int y, z;
		
		System.out.println("Insira o primeiro valor");
		y = sc.nextInt();
		System.out.println("Insira o segundo valor");
		z = sc.nextInt();
		
		int resultado = y + z;
		
		System.out.println("O resultado é " + resultado);
		
		
		sc.close();
		

	}

}
