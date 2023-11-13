import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int cod,  qntd, preco;
		
		System.out.println("Qual item deseja?");
		cod = sc.nextInt();
		
		if(cod == 1) {
			System.out.println("Qual qntd");
			qntd = sc.nextInt();
			preco = (int) (qntd * 4.00);
			System.out.printf("O total é: %d\n", preco);
		}
		else if(cod == 2){
			System.out.println("Qual qntd");
			qntd = sc.nextInt();
			preco = (int) (qntd * 4.50);
			System.out.printf("O total é: %d\n", preco);
		}
		else if(cod == 3){
			System.out.println("Qual qntd");
			qntd = sc.nextInt();
			preco = (int) (qntd * 5.00);
			System.out.printf("O total é: %d\n", preco);
		}
		else if(cod == 4){
			System.out.println("Qual qntd");
			qntd = sc.nextInt();
			preco = (int) (qntd * 2.00);
			System.out.printf("O total é: %d\n", preco);
		}
		else if(cod == 5){
			System.out.println("Qual qntd");
			qntd = sc.nextInt();
			preco = (int) (qntd * 1.50);
			System.out.printf("O total é: %d\n", preco);
		}
		
		sc.close();
	}

}
