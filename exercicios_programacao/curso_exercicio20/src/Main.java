import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int x = 0,qntdin = 0,qntdout = 0 , n;
		;
		n = sc.nextInt();
				
		for (int i = 0; i < n ; i++ ) {
			x = sc.nextInt();
			if (x >= 10 && x<= 20){
				qntdin += 1;
				
			}
			else {
				qntdout += 1;
			}
		}
		
		System.out.println(qntdin + "In");
		System.out.println(qntdout + "Out");
		sc.close();
		

	}

}
