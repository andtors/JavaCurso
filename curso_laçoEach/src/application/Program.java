package application;

public class Program {

	public static void main(String[] args) {
		String[] vect = new String[] {"Maria", "Bob", "Alex"};
		
		for (int i=0; i<vect.length; i++) {
			System.out.println(vect[i]);	
		}
		System.out.println("------------------------------");
		
		for (String obj : vect) {
			/*para cada objeto em (obj podemos dar o nome que quisermos)
			 * contido no vetor vect (nosso vetor) faça: no caso criamos
			 * uma linha onde trará o que está contido no vetor*/
			
			System.out.println(obj);
		}
	}
	
	

}
