package entities;

import entities.enums.Colors;

public abstract class Shape {
	
	private Colors color;
	public Shape() {
		
	}
	public Colors getColor() {
		return color;
	}

	public Shape(Colors color) {
		this.color = color;
	}
	public void setColor(Colors color) {
		this.color = color;
	}
	
	public abstract double area();
	/*A logica do metodo do calculo das areas irá ser feita nas subclasses das formas, porém sempre teremos que criar a função padrão abstrata na 
	 * classe generica*/
}
