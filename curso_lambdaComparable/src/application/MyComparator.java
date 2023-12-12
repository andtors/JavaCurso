package application;

import java.util.Comparator;

import entities.Product;

public class MyComparator implements Comparator<Product>{

	@Override
	public int compare(Product p1, Product p2) {
		return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
	}
	
	//Criamos uma interface apenas para o comparator pois assim fica mais facil de fazer a manutenção dela caso precisemos alterar
	
	
}
