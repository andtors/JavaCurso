package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		
		List<String> list =  new ArrayList<>();
		
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add(2, "Marco");
		/*Adicionamos o Marco na segunda posição da lista*/
			
		System.out.println(list.size());
		/*Imprimi o tamanho da lista*/
		
		list.remove(1);
		/*Remove o item na posição indicada*/
		
	
		
		for (String x : list) {
			System.out.println(x);
		}

		System.out.println("---------------------------------------");
		list.removeIf(x -> x.charAt(0) == 'M');
		/*Criamos uma expressão (lambda) para fazer com que todos os objetos
		 * na lista que contenham M na primeira caractere (0) seja excluido*/
		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("---------------------------------------");
		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("Index of Bob " + list.indexOf("Bob"));
		/*Index serve para nos falar qual a posição do objeto na lista*/
		System.out.println("Index of Marco " + list.indexOf("Marco"));
		/*Quando não encontramos o objeto na lista nos retorna -1*/
		System.out.println("---------------------------------------");
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
 		/*Primeiro convertemos a lista para stream, faço a operação lambda que eu quero
 		 * e depois retornamos ele para lista*/
		for (String x : result) {
			System.out.println(x);
		}
		System.out.println("---------------------------------------");
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		/*usamos o findFirst para puxar a primeira letra do objeto
		 * caso não exista, o orElse irá trazer o valor null*/
		System.out.println(name);
		System.out.println("---------------------------------------");
		String teste = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
		System.out.println(teste);
	}


	

	
	
	
	
	
	
	
	

	
}
