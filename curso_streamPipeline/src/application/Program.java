package application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Program {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(3,4,5,10,7);

		Stream<Integer> st1 = list.stream().map(x -> x * 10);
		
		System.out.println(Arrays.toString(st1.toArray()));
		
		int sum = list.stream().reduce(0, (x, y) -> x + y);
		//Zero seria o valor inicial para receber como x e ir adicionando aos valores contidos na lista
		System.out.println("Sum = " + sum);
		
		List<Integer> newList = list.stream()
				.filter(x -> x % 2 == 0)
				.map(x -> x * 10)
				.collect(Collectors.toList());
		//Pipeline seria executar numa lista varias condições lambdas
		System.out.println(Arrays.toString(newList.toArray()));
		//Neste caso a lista filtrou tudo que é par e multiplicou por 10 e no final salvou numa nova lista com collectors
	}

}
