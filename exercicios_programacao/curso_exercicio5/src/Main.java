import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double horastrab, horasal;
		int num;
		System.out.println("Insira o número do funcionario:");
		num = sc.nextInt();
		System.out.println("Insira as horas trabalhadas do funcionario");
		horastrab = sc.nextDouble();
		System.out.println("Insira o valor que recebe por hora trabalhado");
		horasal = sc.nextDouble();
		
		double salario = horastrab * horasal;
		
		System.out.printf("O funcionario %d possui um salario de %.2f", num, salario);
		
		sc.close();
		
	}

}
