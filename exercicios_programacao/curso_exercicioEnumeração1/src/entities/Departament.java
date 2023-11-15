package entities;

public class Departament {
	private String name;

	@Override
	public String toString() {
		return "Departament [name=" + name + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Departament(String name) {
		this.name = name;
	}
	
}
