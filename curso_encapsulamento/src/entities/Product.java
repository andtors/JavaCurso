package entities;

public class Product {
	private String name;
	private double price;
	private int quantity;
	
	
	/*Para que o  eclipse gere automaticamente os construtores:
	 *botão direito > Source > Generate constructor using fields*/
	
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		
	}
	
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
		/* Por padrão no java os valores sempre vem 0 e string (null)*/ 
	}
	

	/*Para que o eclipse gere os get's e set's
	 * botão direito > Source > Generate Getters and Setters */
	public String getName() {
		return name;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getPrice(){
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getQuantity(){
		return quantity;
	}
	
	public double totalValueInStock() {
		return price * quantity;
	}
	
	public void addProducts(int quantity) {
		this.quantity += quantity;
		/*O this serve para ele puxar o quantity da classe e não o do metodo
		 * quando há duas variaveis ou mais com mesmo nome*/

	}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() {
		/*toString serve para retornar algo quando puxamos a classe no outro pacote*/
		return name
			+ ", $"
			+ String.format("%.2f", price) /*String format é formartar o quer que seja na hora de aparecer na tela*/
			+ ", "
			+ quantity
			+ " Unidades, total: $ "
			+ String.format("%.2f", totalValueInStock());
	}
}
