

package model.entities;

import model.enums.Color;

public abstract class AbstractShape implements Shape {
	//Como a classe abstract shape serve apenas para dizer a cor, temos de transforma-la numa classe abstract
	private Color color;

	public AbstractShape(Color color) {
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
}