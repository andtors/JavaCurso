import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int minutos = sc.nextInt();
		
		double conta = 50.00;
		
		if(minutos > 100){
			conta += (minutos - 100) * 2.0;
		}
		/* variavel +=  | a = a + b
		 * variavel -=  | a = a - b
		 * variavel *=  | a = a * b
		 * variavel %=  | a = a % b
		 * 
		 * São formas abreviadas de se fazer o calculo numa expressão*/
		System.out.printf("Valor da conta é de %.2f", conta);
		sc.close();
	}
		
		
}
