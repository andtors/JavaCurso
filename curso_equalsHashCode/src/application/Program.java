package application;

import entities.Client;

public class Program {

	public static void main(String[] args) {
	
		String a = "Maria";
		String b = "Alex";
		
		System.out.println(a.equals(b));
		//Equals compara se o valor 1 e valor 2 são iguais, porém é demorado
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		//Hashcode faz o mesmo porém traz o resultado mais rapidos porém com menor chance de acerto
		
		System.out.println("-------------");
		Client c1 = new Client("Maria", "maria@gmail.com");
		Client c2 = new Client("Maria", "maria@gmail.com");
		
		String s1 = new String ("Test");
		String s2 = new String ("Test");
		//Como está sendo criado um objeto apesar dos dados serem iguais o compilador retorna como falso
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());		
		System.out.println(c1.equals(c2));		
		System.out.println(c1 == c2);		
		System.out.println(s1 == s2);		
		//Um metodo para descobrirmos mais eficientemente é fazer o hashcode dos objetos para depois comparar com equals, assim é mais rapido e infalivel
	}

}
