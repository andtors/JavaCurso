import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int soma = 0;
		/*
		 * for ( inicio ; condição ; incremento){
		 * 		comando 1
		 * 		comando 2
		 * }
		 */
		for (int i=0; i<N; i++) {
			/* i++ = i = i + 1;
			 * i-- = i = i - 1;*/
			 int x = sc.nextInt();
			 soma = soma + x;
		}
		
		System.out.println(soma);
		sc.close();

	}

}
