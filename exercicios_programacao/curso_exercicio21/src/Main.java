import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		double x,y,z, soma1 = 0, soma2 = 0, soma3 = 0, somax = 0, somay = 0, somaz = 0;
		int n = 0, j = 0;
	
		
		n = sc.nextInt();
		
		while (n > j) {
			for (int m = 0; m < 3 ; m++){
				x = sc.nextDouble();
				soma1 += x;
				j += 1;
			}
			for (int l = 0; l < 3 ; l++){
				y = sc.nextDouble();
				soma2 += y;
				j += 1;
			}
			for (int o = 0; o < 3 ; o++){
				z = sc.nextDouble();
				soma3 += z;
				j += n;
			}
		}
		
		somax = soma1 / 2;
		somay = soma2 / 3;
		somaz = soma3 / 5;
		System.out.println(somax);
		System.out.println(somay);
		System.out.println(somaz);
		
		
		sc.close();
		
		/*
		 * Como o enunciado é uma merda, o correto era scannear 3 numeros apenas sendo o 1° com 2 de peso (multiplicado) e 2° com 3 de peso e o 3° com 5 de peso 
		 * o código que criei está correto para a forma que entendi desta merda de enunciado porém o código abaixo é o correto do enunciado merda
		 * 
		 * int n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			double c = sc.nextDouble();

			double media = (a * 2.0 + b * 3.0 + c * 5.0) / 10.0;

			System.out.printf("%.1f%n", media);
		}
		
		*/

	}

}
