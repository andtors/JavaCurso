package application;

import java.io.File;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a file path: ");
		String strPath = sc.nextLine();
		
		File path = new File (strPath);
		
		System.out.println("getName: " + path.getName());
		//Pega apenas o nome e despreza o caminho
		System.out.println("getParent: " + path.getParent());
		//Pega apenas o caminho e despreza o nome
		System.out.println("getPath: " + path.getPath());
		//Pega apenas o caminho completo e despreza o nome
		
		sc.close();

	}

}
