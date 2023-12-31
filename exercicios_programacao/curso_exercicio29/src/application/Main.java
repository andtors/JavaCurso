package application;

import java.util.Scanner;

import entities.Functions;

public class Main {
	public static void main(String[] args) {
		
		double balance = 0;
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter holder");
		String name = sc.nextLine();
		System.out.println("Enter account number: ");
		int account = sc.nextInt();
		
		System.out.println("Is there a initial deposit? (1 for yes/2 for no)");
		int decision = sc.nextInt();
		
		if (decision == 1){
			System.out.println("Enter initial deposit value: ");
			double money = sc.nextDouble();
			Functions functions = new Functions(account, name, balance);
			functions.deposit(money);
			System.out.println("Account data: " + functions.getAccount() + ", Holder: " + functions.getName() + ", Balance $" + functions.getBalance());
			System.out.println("Enter a deposit value: ");			
			money = sc.nextDouble();
			functions.deposit(money);
			System.out.println("Updated account data: " + functions.getAccount() + ", Holder: " + functions.getName() + ", Balance $" + functions.getBalance());
			System.out.println("Enter a withdraw value: ");
			money = sc.nextDouble();
			functions.withdraw(money);
			System.out.println("Updated account data: " + functions.getAccount() + ", Holder: " + functions.getName() + ", Balance $" + functions.getBalance());
			
		}
		
		else {
			Functions functions = new Functions(account, name, balance);
			System.out.println("Account data: " + functions.getAccount() + ", Holder: " + functions.getName() + ", Balance $" + functions.getBalance());
			System.out.println("Enter a deposit value: ");			
			double money = sc.nextDouble();
			functions.deposit(money);
			System.out.println("Updated account data: " + functions.getAccount() + ", Holder: " + functions.getName() + ", Balance $" + functions.getBalance());
			System.out.println("Enter a withdraw value: ");
			money = sc.nextDouble();
			functions.withdraw(money);
			System.out.println("Updated account data: " + functions.getAccount() + ", Holder: " + functions.getName() + ", Balance $" + functions.getBalance());
		}
		sc.close();
		
		
	}
	
	
}
