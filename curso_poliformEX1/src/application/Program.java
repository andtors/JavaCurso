package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<>();
		
		System.out.println("Enter the number of employees: ");
		int n = sc.nextInt();
		
		for(int i = 1; i<=n; i++) {
			System.out.println("Employee #" + i + " data:");
			System.out.print("Outsourced (y/n)? :");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");		
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			System.out.print("Value per Hour: ");
			double valuePerHour = sc.nextDouble();
			if (ch == 'y') {
				System.out.print("Addiotional charge: ");
				double additionalCharge = sc.nextDouble();
				//Employee emp = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);
				list.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
				//é possivel adicionar o construtor direto quando for adicionar o objeto a lista
			}
			else {
				//Employee emp = new Employee(name, hours, valuePerHour);
				list.add(new Employee(name, hours, valuePerHour));
			}
			
		}
		
		System.out.println();
		System.out.println("Payments: ");
		for (Employee emp : list) {
			System.out.println(emp.getName() + " - $" + String.format("%.2f", emp.payment()));
		}
		sc.close();
		

	}

}
