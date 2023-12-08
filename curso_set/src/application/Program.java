package application;

import java.util.LinkedHashSet;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		Set<String> set = new LinkedHashSet<>();
		// Hashset é a implementação mais rapida, porém não garante a ordem
		//TreeSet traz a lista em ordem alfabetica ou então crescente
		//Linked hashset traz na ordem em que os itens foram inseridos
		
		set.add("Tv");
		set.add("Tablet");
		set.add("Notebook");
		
		set.removeIf(x -> x.charAt(0) >='T');
		//Podemos colocar uma condição para remover 
		
		for(String p : set) {
			System.out.println(p);
		}

	}

}
