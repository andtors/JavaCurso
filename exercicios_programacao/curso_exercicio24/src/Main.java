import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x;
		
		x = sc.nextInt();
		
		for (int i = 1 ; i <= x ; i++) {
			if (x % i == 0) {
				System.out.println(i);
			}
		}
		
		sc.close();
		
	}

}
