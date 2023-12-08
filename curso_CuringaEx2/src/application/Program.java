package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		
		/*List<Integer> intList = new ArrayList<Integer>() ;
		intList.add(10);
		intList.add(5);
		
		List<? extends Number> list = intList;
		
		Number x = list.get(0);
		//Chamado de covariancia é quando podemos acessar os numeros porém não podemos inserir
		list.add(20);
		
		List<Object> myObjs = new ArrayList<Object>();
		myObjs.add("Maria");
		myObjs.add("Alex");
		
		List<? super Number> myNums = myObjs;
		myNums.add(10);
		myNums.add(3.14);
		
		//Neste caso criamos uma lista Super Number, ou seja ela irá adicionar tudo que for acima do number, e acima dele há o object
		Number x = myNums.get(0);
		//Por isso podemos adicionar Strings, porém não conseguimos acessar os valores da lista
		*/
		List<Integer> myInts = Arrays.asList(1,2,3,4);
		List<Double> myDoubles = Arrays.asList(3.14, 6.28);
		List<Object> myObjs = new ArrayList<Object>();
		
		copy(myInts, myObjs);
		printList(myObjs);
		copy(myDoubles, myObjs);
		printList(myObjs);
	}
	
	public static void copy(List<? extends Number> source, List<? super Number> destiny) {
		for(Number number : source) {
			destiny.add(number);
		}
		//Neste caso ele criou ambas listas covariantes e listas supers, com isso ele pode adicionar tudo que está acima de number e que está abaixo dela
	}
	
	public static void printList(List<?> list) {
		for(Object obj : list) {
			System.out.print(obj + " ");
		}
		System.out.println();
	}

}
