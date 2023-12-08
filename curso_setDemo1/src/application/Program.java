package application;

import java.util.HashSet;
import java.util.Set;

import entities.Product;

public class Program {
	public static void main(String[] args) {
		
		Set<Product> set = new HashSet<>();
		
		set.add(new Product("TV", 900.0));
		set.add(new Product("Notebook", 1200.0));
		set.add(new Product("Tablet", 400.0));
		
		Product prod = new Product("Notebook", 1200.0);
		//Caso listemos um objeto na lista, porém instaciemos ele em outra classe, ele irá retornar falso, pois são hashcodes diferentes, para simplificar, ambos estão alocados em espaços de memorias diferentes
		//Para resolver isso temos que criar o hashcode na classe Product
		System.out.println(set.contains(prod));
	}
}
