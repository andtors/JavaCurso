package entities;

import java.util.Objects;

public class Products {
	
	private String name;
	private Double price;

	public Products(String name, Double price) {
		this.name = name;
		this.price = price;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Products other = (Products) obj;
		return Objects.equals(name, other.name) && Objects.equals(price, other.price);
	}
	
// getters, setters, equals, hashCode
}