package entities;

public class Product {
	
	private String name;
	private double price;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	public static boolean staticProductPredicate(Product p) {
		//Metodo static usa o produto que passarmos para ele
		return p.getPrice() >= 100;
	}
	
	public boolean nonStaticProductPredicate() {
		//Metodo não static usa do objeto em que você está
		return price >= 100;
	}
	
	@Override
	public String toString() {
		return name + " " + price ;
	}
	
	
}
