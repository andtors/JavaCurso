import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x, y;
		x = sc.nextInt();

		y = x;
		
		
		for (int i = 1; i < y ; i++) {
			x *= i;
			
		}
		
		System.out.println(x); 
		
		sc.close();
		

	}

}
