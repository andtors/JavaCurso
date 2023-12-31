package application;
import java.util.Scanner;
import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Product[] vect = new Product[n];
		
		for (int i=0; i<vect.length; i++) {
			/*vect.length serve para usar a quantidade de números dentro do vetor
			 * no caso o vetor está utilizando n vezes que colocamos ali no int*/
			sc.nextLine();
			
			String name = sc.nextLine();
			double price = sc.nextDouble();
			/* Dentro do vect iremos colocar um construtor que irá puxar para 
			 * o heap dele os valores que inserimos anteriormente*/
			vect[i] = new Product(name, price);
		}
		
		
		double sum = 0.0;
		for (int i=0; i<vect.length; i++) {
			/*Aqui iremos pegar apenas os valores do preço
			 * por isso usamos o getPrice*/
			sum += vect[i].getPrice();
		}
		
		double avg = sum / vect.length;
		
		System.out.println("Average price: " + avg);
		sc.close();
	}

}
