package application;

public class Main {

	public static void main(String[] args) {
	
		int x  = 20;
		
		Integer obj = x;
		/*No Java podemos transformar dados estaticos em referenciais,
		 * fazendo a utilização de boxing como está acima, no caso podemos 
		 * ir além e usar wrapper que facilitam ainda mais essa conversão*/
		System.out.println(obj);
		
		int y = obj * 2;
		/*o contrario também é possivel, podemos fazer o unboxing de classes para
		 * dado estaticos*/
		System.out.println(y);
		
		
		/*Dados primitivos em Java não aceitam valores nulos, porém classes conseguem*/
	}

}
