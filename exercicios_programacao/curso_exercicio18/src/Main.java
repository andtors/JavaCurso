import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int alc = 0, gas = 0, dis = 0, x = 0;

		System.out.println("Insira o número de 1-4:");
		x = sc.nextInt();
		
		while (x != 4) {
				
				if (x == 1){
					alc += 1;
					System.out.printf("Alcool: %d\n", alc);
				}
				else if (x == 2) {
					gas += 1;
					System.out.printf("Gasolina: %d\n", gas);
				}
				else if (x == 3) {
					dis += 1;
					System.out.printf("Diesel: %d\n", dis);
				}
				else {
					System.out.println("MUITO OBRIGADO\n");
				}
				
				x = sc.nextInt();
				
				
		}
		sc.close();
		

	}

}
