package application;

import java.util.Scanner;

import model.entities.Account;
import model.exceptions.DomainException;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Account account = new Account();
		
		try {
			System.out.println("Enter account data: ");
			System.out.print("Number: ");
			int numberAccount = sc.nextInt();
			sc.nextLine();
			System.out.print("Holder: ");
			String nameAccount = sc.nextLine();
			System.out.print("Initial balance: ");
			double balanceAccount = sc.nextDouble();
			System.out.print("Withdraw limit: ");
			double withdrawAccount = sc.nextDouble();
			account = new Account(numberAccount, nameAccount, balanceAccount, withdrawAccount);
			System.out.print("Enter amount for withdraw: ");
			double amount = sc.nextDouble();
			account.withdraw(amount);
		}
		catch(DomainException e){
			System.out.println(e.getMessage());
		}
		catch(RuntimeException e){
			System.out.println("Invalid format");
		}
		
		System.out.println("New balance: " + account.getBalance());
		sc.close();
		

	}

}
