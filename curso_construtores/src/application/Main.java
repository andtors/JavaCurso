package application;

import java.util.Scanner;

import entities.Product;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Informe o Produto:");
		String name = sc.nextLine();
		System.out.printf("Informe o preço:");
		double price = sc.nextDouble();
		System.out.printf("Informe a quantidade:");
		int quantity = sc.nextInt();
		Product product = new Product(name, price, quantity);

		System.out.printf("Data do produto:" + product);
		System.out.println();
		System.out.printf("Insira a quantidade de produtos a ser adicionado:");
		quantity = sc.nextInt();
		product.addProducts(quantity);
		System.out.println();
		System.out.println("Quantidade atualizada: " + product);
		System.out.println();
		System.out.println("Insira a quantidade de produtos a ser subtraida:");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		System.out.println();
		System.out.println("Quantidade atualizada: " + product);

		sc.close();

	}

}
