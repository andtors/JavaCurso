import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double preco = 34.5;
		double desconto = (preco < 20.00)? preco * 0.1 : preco * 0.05;
		/*                (   condicao  )? valor_se_verdadeiro : valor_se_falso;  */
	/*
	  O mesmo código que seria escrito desta forma abaixo
	  pode ser simplificado como acima
	  
		if (preco < 20.00) {
			desconto = preco * 0.1;
		}
		else {
			desconto = preco * 0.05;
		}
		
		
	*/

		System.out.println(desconto);
		sc.close();
	}

}
