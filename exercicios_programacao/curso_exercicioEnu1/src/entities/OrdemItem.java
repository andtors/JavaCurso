package entities;


public class OrdemItem {
	private Integer quantity;
	private Double price;
	
	
	public OrdemItem() {
		
	}

	public Integer getQusantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public OrdemItem(Integer quantity, Double price) {
		this.quantity = quantity;
		this.price = price;
	}
	
	public OrdemItem(Integer quantity) {
		this.quantity = quantity;
	}
	
	public OrdemItem(Double price) {
		this.price = price;
	}
	
	public double subTotal(){
		
		return price * quantity;
		
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Quantity: " + quantity + ", Subtotal: $");
		
		return toString();
	}
	
	
	
}
