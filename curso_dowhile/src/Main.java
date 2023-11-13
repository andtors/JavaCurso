import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		// TODO Auto-generated method stub
		double c = 0, f = 0;
		char resp;
		
		do {
			c = sc.nextDouble();
			f = (c * 9/5) + 32;
			System.out.println(f);
			System.out.println("Deseja continuar? (y/n)");
			resp = sc.next().charAt(0);
			
		}while (resp != 'n');
		
		sc.close();
		
		
	}

}
