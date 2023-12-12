package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));

		/*list.removeIf(new ProductPredicate());
		 Com interface generica unsando predicate*/
		
		/*list.removeIf(Product :: staticProductPredicate);
		 Usando lambda com o metodo na classe Product - Reference method*/
		
		/*list.removeIf(Product :: nonStaticProductPredicate);
		 Usando o metodo não static*/
		
		double min = 100.00;
		
		/*Predicate<Product> pred = p -> p.getPrice() >= min;
		
		list.removeIf(pred);
		Usando a expressão lambda declarada*/
		
		list.removeIf(p -> p.getPrice() >= min);
		//Expressão lambda inline ou seja, tudo numa linha
		
		for (Product p : list) {
			System.out.println(p.toString());
		}

	}
}
