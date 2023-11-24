package application;

import entities.Account;
import entities.BussinesAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		
		Account acc = new Account(1001, "Alex", 0.0);
		BussinesAccount bacc= new BussinesAccount(1002, "Maria", 0.0, 500.0);
		
		// Upcasting
		
		Account acc1 = bacc;
		/*Como bussines account É UM account é possivel atribuir uma Bussines
		 * account em account*/
		
		Account acc2 = new BussinesAccount(1003, "Bob", 0.0, 200.0);
		Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);
		
		//Downcasting
		
		BussinesAccount acc4 = (BussinesAccount)acc2;
		/*O inverso não é possivel, então teremos que fazer manualmente*/
		acc4.loan(100.0);
		
		// BussinesAccount acc5 = (BussinesAccount)acc3;
		/*Nem sempre o programa irá relatar antes da execução que não é possivel
		 * fazer o casting de uma subclasse para outra subclasse 
		 * (acc3 é está instanciada na classe SavingsAccount*/
		
		if (acc3 instanceof BussinesAccount) {
			/*Em vez disso iremos fazer um if para verificar se o acc3 é uma instancia
			 * de bussinesAccount (ele é savingaccounts, conforme a linha 21 do código*/
			BussinesAccount acc5 = (BussinesAccount)acc3;
			acc5.loan(200);
			System.out.println("Loan!");
		}
		if (acc3 instanceof SavingsAccount) {
			/*Como o primeiro if falhou, o programa foi para o segundo, como o acc3 está 
			 * numa instancia do savingsaccount, ele entendeu como true*/
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.updateBalance();
			System.out.println("Update!");
		}
		
		Account acc5 = new Account(1001, "Alex", 1000.0);
		acc5.withdraw(200);
		System.out.println(acc5.getBalance());
		/*Neste de cima, ele está retirando 200 da classe Account, ou seja,
		 * será descontado uma de taxa 5$ ao sacar*/
		Account acc6 = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
		acc6.withdraw(200);
		System.out.println(acc6.getBalance());
		/*Já aqui como ele está retirando da poupança não há taxa*/
		
		Account acc7 = new BussinesAccount(1002, "Maria", 1000.0, 500.0);
		acc7.withdraw(200);
		System.out.println(acc7.getBalance());
		/*Aqui ele retirou os 200 + 5 de taxa + 2 conforme o metodo na subclasse
		 * Bussines Account*/
		
		
		Account x = new Account(1020, "Alex", 1000.0);
		Account y = new SavingsAccount(1023, "Maria", 1000.0, 0.01);
		
		x.withdraw(50.0);
		y.withdraw(50.0);
		
		System.out.println(x.getBalance());
		System.out.println(y.getBalance());
		
		/*Polimorfismo simplificado, seria usar a mesma operação para diversos metodos
		 * por exemplo a variavel x e y utilizaram os seus respectivos metodos,
		 * no caso a variavel x usou o seu metodo de withdraw que estava na sua classe
		 * no caso de x ele usou o metodo da classe Account e no caso de y usou o SavingsAccount
		 * Polimorfismo então seria se utilizar de diferentes metodos em diferentes classes para uma variavel*/
	}
}
