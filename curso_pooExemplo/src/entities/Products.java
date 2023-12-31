package entities;

public class Products {
	public String name;
	public double price;
	public int quantity;
	
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
