package entities;

import entities.enums.Colors;

public class Rectangle extends Shape {
	
	private Double width;
	private Double height;
	
	
	public Rectangle() {
		super();
	}
	
	
	@Override
	public double area() {
		return width * height;
	}
	/*Por padrão quando uma super classe é abstrata temos que criar o Override acima*/


	public Double getWidth() {
		return width;
	}


	public Rectangle(Colors color, Double width, Double height) {
		super(color);
		this.width = width;
		this.height = height;
	}


	public void setWidth(Double width) {
		this.width = width;
	}


	public Double getHeight() {
		return height;
	}


	public void setHeight(Double height) {
		this.height = height;
	}
	
}
