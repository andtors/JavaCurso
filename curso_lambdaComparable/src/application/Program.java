package application;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();

		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));

		//list.sort (new MyComparator());
		//Com a interface que criamos podemos chamar o metodo de comparador
		
		/*Comparator<Product> comp = new Comparator<Product>() {

			@Override
			public int compare(Product p1, Product p2) {
				
				return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
			}
		
		};
		
		list.sort(comp);*/
		//então criamos diretamente no programa a lista com o compare que queremos e a lógica dele e após isso chamamos ele em list.sort()
		
		/*
		Comparator<Product> comp = (p1, p2) ->  {
			//Aqui estamos chamando uma função anonima, colocamos os parametros, logo em seguida o -> acompanhado do { que é onde iremos colocar toda a implementação da função
			return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
		};
		*/
		
		//Comparator<Product> comp = (p1, p2) ->  p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()); 
		//Podemos simplificar ainda mais o código definindo o comparator numa linha apenas
		
		
		//Podemos simplificar ainda mais ainda mais :O dessa forma: 
		list.sort((p1, p2) ->  p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));
		//Inferencia é quando o programa deduz que as variaveis estão atreladas a uma classe sem nós precisarmos chama-las
		
	
		
		for (Product p : list) {
			System.out.println(p);
		}
	}
}