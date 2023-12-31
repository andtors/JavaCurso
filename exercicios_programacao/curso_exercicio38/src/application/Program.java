package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employees;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many employess will be registered? ");
		int n = sc.nextInt();

		List<Employees> list = new ArrayList<>();
		
		for (int i=0; i<n; i++) {
			sc.nextLine();
			System.out.println("Employee #" + (i+1));
			System.out.printf("Id:");
			Integer id = sc.nextInt();
			sc.nextLine();
			System.out.printf("Name: ");
			String name = sc.nextLine();
			System.out.printf("Salary:");
			Double salary = sc.nextDouble();
			sc.nextLine();
			Employees emp = new Employees(id, name, salary);
			list.add(emp);
		}
		
		
		System.out.println("Enter the employee id that will have salary increase: ");
		int idemp = sc.nextInt();
		Employees emp = list.stream().filter(x ->x.getId() == idemp).findFirst().orElse(null);
		if (emp == null){
			System.out.println("This id does not exist!");
		}
		else {
			System.out.printf("Enter the porcentage: ");
			double percentage = sc.nextDouble();
			emp.percentageSalary(percentage);
			
		}
		System.out.println("List of employees: ");
		System.out.println(emp);

		
		sc.close();
		

	}

}
