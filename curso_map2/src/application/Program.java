package application;

import java.util.HashMap;
import java.util.Map;

import entities.Products;

public class Program {
	public static void main(String[] args) {
		
		Map<Products, Double> stock = new HashMap<>();
		
		Products p1 = new Products("Tv", 900.0);
		Products p2 = new Products("Notebook", 1200.0);
		Products p3 = new Products("Tablet", 400.0);
		
		stock.put(p1, 10000.0);
		stock.put(p2, 20000.0);
		stock.put(p3, 15000.0);
		
		Products ps = new Products("Tv", 900.0);
		
		System.out.println("Contains 'ps' key: " + stock.containsKey(ps));
		//Quando não colocamos o hashcode ele compara pelo ponteiros, e não pelo objeto e classe
	}
}
