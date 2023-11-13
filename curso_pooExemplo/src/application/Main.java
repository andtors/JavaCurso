package application;

import java.util.Scanner;

import entities.Products;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Products product = new Products();
		System.out.printf("Informe o Produto:");
		product.name = sc.nextLine();
		System.out.printf("Informe o preço:");
		product.price = sc.nextDouble();
		System.out.printf("Informe a quantidade:");
		product.quantity = sc.nextInt();
		
		System.out.printf("Data do produto:" + product);
		System.out.println();
		System.out.printf("Insira a quantidade de produtos a ser adicionado:");
		int quantity = sc.nextInt();
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
