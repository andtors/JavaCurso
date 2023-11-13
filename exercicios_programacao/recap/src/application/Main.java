package application;
import java.util.Scanner;

import entities.Employee;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee empregado = new Employee();
		System.out.println("Insira seu nome:");
		empregado.Name = sc.nextLine();
		System.out.println("Informe seu salario");
		empregado.Salario = sc.nextDouble();
		System.out.println("Informe o aumento salarial");
		empregado.Aumento = sc.nextDouble();
		System.out.println("Seu nome é " + empregado.Name + " e seu salario novo é de " + empregado.SalarioAumento());
		
		sc.close();

	}

}
