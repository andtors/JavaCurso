package application;
import java.util.Scanner;

import entities.Banco;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Banco itau = new Banco();
		System.out.println("Insira seu nome:");
		itau.Nome = sc.nextLine();
		System.out.println("Bem vindo ao Banco Itaú " + itau.Nome + "O que deseja fazer? Sacar(1), debitar(2) ou consultar a conta(3)?");
		int decisao;
		decisao = sc.nextInt();
		
		
		 if (decisao == 1){
			Double sacar;
			System.out.println("Qual valor deseja sacar?");
			sacar = sc.nextDouble();
			System.out.println("Seu patrimonio agora é de " + itau.SacarPatrimonio(sacar));
		}
		 
		
		 else if (decisao == 2){
			Double debito;
			System.out.println("Qual valor deseja debitar?");
			debito = sc.nextDouble();
			System.out.println("Seu patrimonio agora é de " + itau.DebitarPatrimonio(debito));
		}
		
		
		
		else{
			System.out.println("Seu patrimonio é de " + itau.Patrimonio);
		}
		
		
		sc.close();
	}

}
