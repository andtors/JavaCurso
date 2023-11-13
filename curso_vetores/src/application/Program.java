package application;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int n =sc.nextInt();
		double [] vect = new double[n];
		/* O n que está entre colchetes é para informar que o vetor irá receber a quantidade
		 * que será inserida na varial int n acima
		 * 
		 * o vect é o nome dado ao vetor, ele pode receber outros nomes se quisermos*/
		
		for (int i=0; i<n; i++) {
			vect[i] = sc.nextDouble();
			/*Toda vez que o [for] for executado ele irá inserir no [i]
			 * a posição do número inserido, lembrando que se começa sempre no 0*/
		}
		
		double sum = 0.0;
		/*Aqui todo valor que está sendo inserido no vetor irá ser somardo
		 * e depois divido na quantidade de vezes que foi inserida para
		 * calcular a média*/
		for (int i=0; i<n; i++) {
			sum += vect[i];
		}
		double avg = sum / n;
		System.out.println("Average height:" + avg);
		
		sc.close();

	}

}
