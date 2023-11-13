package application;

import java.util.Scanner;

import entities.Employee;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee empregado = new Employee();
		System.out.println("Insira seu nome");
		empregado.Name = sc.nextLine();
		System.out.println("Insira seu salario bruto:");
		empregado.GrossSalary = sc.nextDouble();
		
		System.out.println(empregado);
		double percentage;
		System.out.println("Insira a porcentagem que seu salario aumentará");
		percentage = sc.nextDouble();
		empregado.IncreaseSalary(percentage);
		System.out.println(empregado);
		
	sc.close();

	}

}
