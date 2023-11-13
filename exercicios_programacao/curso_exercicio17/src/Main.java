import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double y = 0, x = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o quadrante y");
		y = sc.nextDouble();
		
		System.out.println("Informe o quadrante x");
		x = sc.nextDouble();
		
		while( x != 0 || y != 0) {
			
			if (x > 0 && y > 0) {
				System.out.println("Quadrante 1");
				y = sc.nextDouble();
				x = sc.nextDouble();
			}
			else if (x < 0 && y < 0) {
				System.out.println("Quadrante 3");
				y = sc.nextDouble();
				x = sc.nextDouble();
			}
			else if (x < 0 && y > 0) {	
				System.out.println("Quadrante 2");
				y = sc.nextDouble();
				x = sc.nextDouble();
			}
			else {
				System.out.println("Quadrante 4");
				y = sc.nextDouble();
				x = sc.nextDouble();
			}

		}	
		


		
		sc.close();
	}

}
