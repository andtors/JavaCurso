package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import entities.Product;

public class Program {
	public static void main(String args[]) {

		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));

		/*
		 * Implementação de interface
		 *  list.forEach(System.out::println); Podemos usar
		 * uma expressão lambda para imprimir os valores da listsa chamando o metodo e
		 * pedindo para imprimir com System.out::println
		 */

		/* Reference method com metodo estatico:
		list.forEach(Product::staticPriceUpdate);
		 */
		
		/* Reference method sem metodo estatico:
		list.forEach(Product::nonStaticPriceUpdate);
		 */
		double factor = 1.1;
		
		/* Expressão lambda declarada
		Consumer<Product> cons = p -> {
			p.setPrice(p.getPrice() * factor);
		};
		
		ou
		
		Consumer<Product> cons = p -> p.setPrice(p.getPrice() * factor);
		
		list.forEach(cons);
		*/
		
		//Lambda in line
		list.forEach(p -> p.setPrice(p.getPrice() * factor));
		list.forEach(System.out::println);

	}
}
