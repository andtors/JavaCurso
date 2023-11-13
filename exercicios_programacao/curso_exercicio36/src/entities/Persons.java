package entities;

public class Persons {
	private double altura;
	private int genero;
	
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public int getGenero() {
		return genero;
	}
	public void setGenero(int genero) {
		this.genero = genero;
	}
	
	public Persons(double altura, int genero) {
	
		this.altura = altura;
		this.genero = genero;
	}
}
