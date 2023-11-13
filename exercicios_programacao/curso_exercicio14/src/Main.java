import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double x,y;
		
		System.out.println("Informe o quadrante y");
		y = sc.nextDouble();
		
		System.out.println("Informe o quadrante x");
		x = sc.nextDouble();
		
		if (x > 0 && y > 0) {
			System.out.println("Quadrante 1");
		}
		else if (x < 0 && y < 0) {
			System.out.println("Quadrante 3");
		}
		else if (x < 0 && y > 0) {	
			System.out.println("Quadrante 2");
		}
		else if (x > 0 && y < 0) {
			System.out.println("Quadrante 4");
		}
		else {
			System.out.println("Ponto de origem");
		}
		sc.close();
	}

}
