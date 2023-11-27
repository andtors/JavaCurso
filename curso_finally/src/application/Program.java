package application;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		/*Neste caso criamos uma variavel que é um arquivo, logo em seguida apontamos com o Scanner para este arquivo, porém ele não existe, e dará erro, com isso o
		 * finally irá finalizar e mostrar a mensangem*/
		File file = new File("C:\\temp\\in.txt");
		Scanner sc = null;
	
		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		}
		catch(FileNotFoundException e) {
			System.out.println("Error opening file: " + e.getMessage());
		}
		finally {
			if (sc !=  null) {
				sc.close();
				
			}
			System.out.println("Finally block executed");
		}
	}

}
