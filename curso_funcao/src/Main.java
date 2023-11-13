import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	
	
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c = sc.nextInt();
	sc.close();
	int higher = max(a,b,c);
	/*max seria a função e dentro do () as variaveis que
	 *irão para a função*/
	
	showResult(higher);
	/*ShowResult é a função que irá ser criada*/
	}
	
	public static int max(int x, int y, int z) {
		int aux;
		/*As variaveis dentro de uma função não são as criadas
		 * anteriormente, elas servem mais de "PlaceHolder"*/
		if (x > y && x > z) {
			aux = x;
		} else if (y > z) {
			aux = y;
		} else {
			aux = z;
		}
		
		return aux;
		/*Return serve para dizer qual valor queremos guardar na memoria*/
	}
	
	public static void showResult(int value) {
		System.out.println("Higher = " + value);
	}

}
