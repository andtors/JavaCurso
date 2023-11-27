package application;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Program {
	public static void main(String[] args) {
		//O programa chama o metodo 1 que começa na linha de código 10, porém dentro do metodo 1, ele chama o metodo 2 que começa na linha 15, só com a
		//conclusão do metodo 2 que o metodo 1 será concluido e aparecerá o End of program
		method1();
		System.out.println("End of program");
	}
	public static void method1() {
		System.out.println("***METHOD1 START***");
		method2();
		System.out.println("***METHOD1 END***");
	}
	public static void method2() {
		System.out.println("***METHOD2 START***");
		Scanner sc = new Scanner(System.in);
		try {
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid position!");
			e.printStackTrace();
			//PrintStackTrace trás todo o caminho até a exceção, indo de metodo á metodo para verificar quais dependem de quais
			sc.next();
		}
		catch (InputMismatchException e) {
			System.out.println("Input error");
		}
		sc.close();
		System.out.println("***METHOD2 END***");
	}
}
		
	
	/*O bloco try catch testa o código e se dentro dele houver uma excessão (erro) com a funcionalidade catch em vez de encerrar o programa, podemos configurar
	 * como o programa irá se comportar, no caso abaixo, com as exceções fizemos o programa mostrar uma linha dizendo qual o erro*/
	
	/*
	try {
		String[] vect = sc.nextLine().split(" ");
		int position = sc.nextInt();
		System.out.println(vect[position]);
	}
	
	
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("Invalid position!");
		//Neste caso inserimos uma posição que não havia no vetor
	}
	
	catch(InputMismatchException e) {
		System.out.println("Input error!");
		//Neste inserimos um valor que não corresponde com o que o programa pede
	}
	System.out.println("End of program");
	*/
	
