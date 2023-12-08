package application;

import java.util.Arrays;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		
		/*
		List<Object> myObjs = new ArrayList<Object>();
		List<Integer> myNumbers = new ArrayList<Integer>();
		myObjs = myNumbers;
	    Neste caso não é possivel pois list Integer não é uma subclasse de object
		
		Object obj;
		Integer x = 10;
		obj = x;
		Porém é possivel fazer obj ser um integer pois o tipo é uma subclasse, a lista que não
		
		List<?> myObjs = new ArrayList<Object>();
		List<Integer> myNumbers = new ArrayList<Integer>();
		myObjs = myNumbers;
		O supertipo de qualquer tipo de list é List<?>
		*/
		List<Integer> myInts = Arrays.asList(5, 2, 10);
		printList(myInts);
		
		List<String> myStrs = Arrays.asList("Maria", "Alex", "Bob");
		printList(myStrs);
		
		
	}
	public static void printList(List<?> list) {
		for (Object obj : list) {
			System.out.println(obj);
			//Não importa se a lista é int ou String ele irá imprimir tudo
		}
	}

}
