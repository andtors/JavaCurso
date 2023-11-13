import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int mask = 0b00100000;
		/*O java entende quando a variavel é bit
		 * por exemplo o número acima é 32 em bit
		 * os 2 zeros antes do 1 podem ser apagados*/
		int n = sc.nextInt();
		
		if((n & mask) != 0) {
			System.out.println("O 6° bit é verdadeiro!");
			
		}else {
			System.out.println("O 6° bit é falso!");
		}
		sc.close();
		

	}

}
