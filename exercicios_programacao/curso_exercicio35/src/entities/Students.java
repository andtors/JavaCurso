package entities;

public class Students {
	private String name;
	private double score;
	
	private double score2;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	
	public Students(String name, double score) {
		this.name = name;
		this.score = score;
		
	}
	public Students(String name) {
		this.name = name;
		
		
	}
	public Students(double score) {
		this.score = score;
	
		
	}
	
	

	public double getScore2() {
		return score2;
	}
	public void setScore2(double score2) {
		this.score2 = score2;
	}
}
