package entities;

public class Order {
	private String name;
	private Double price;
	private Integer quantity;
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
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
	public Order(String name, Double price, Integer quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	public Order(String name) {
		this.name = name;

	}
	
	public double qntPri() {
		return price * quantity;
	}
	@Override
	public String toString() {
		return "Order [name=" + name + ", price=" + price + ", quantity=" + quantity + "] = " + qntPri() ;
	}
	
	
}
