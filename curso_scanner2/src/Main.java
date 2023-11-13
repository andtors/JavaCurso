import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int x;
		String s1, s2, s3;
		char s4;
		
		x = sc.nextInt();
		sc.nextLine();
		/* Após inserir um valor, sempre usar um nextLine*/
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		s4 = sc.nextLine().charAt(5);
		/*.charAt(Qual posição do caractere na palava puxar)*/
		
		System.out.println("Dados digitados:");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		
		sc.close();
		
		
	}

}
