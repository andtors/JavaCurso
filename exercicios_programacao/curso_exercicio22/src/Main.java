import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	
	int n;
	double  y = 0,x = 0, carac1 = 0, carac2 = 0, calc;
	
	n = sc.nextInt();
	
	for (int i = 0; i < 1 ; i++) {
		x = sc.nextDouble();
		carac1 += x;
		
	}
	
	for (int p = 0; p < 1 ; p++) {
		y = sc.nextDouble();
		carac2 += y;
		if(y == 0) {
			System.out.println("Divisão Impossivel");
		}
	}
	
	
	calc = carac1 / carac2;
	System.out.println(calc);
	sc.close();
	
	}

}
