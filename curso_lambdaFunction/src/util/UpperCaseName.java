package util;

import java.util.function.Function;

import entities.Product;

public class UpperCaseName implements Function<Product, String>{
	//A entrada será Product, e a saida String, pois queremos os nomes dos produtos em caixa alta
	
	@Override
	public String apply(Product p) {
		
		return p.getName().toUpperCase();
	}
											
	
}
