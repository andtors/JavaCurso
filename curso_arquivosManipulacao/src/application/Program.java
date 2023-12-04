package application;

import java.io.File;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a folder path:");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		File[] folders = path.listFiles(File::isDirectory);
		System.out.println("FOLDERS:");
		for (File folder : folders) {
			System.out.println(folder);
		}
		
		//Criei um vetor para armazenar o diretorio das pastas que estão dentro do caminho que informei
		
		File [] files = path.listFiles(File::isFile);
		System.out.println("FILES:");
		for(File file : files) {
			System.out.println(file);
		}
		//Criei um vetor para armazenar o diretorio dos arquivos que estão dentro do caminho que informei
		
		boolean success = new File(strPath + "\\subdir").mkdir();
		//Criei uma pasta no diretorio que informei, boolean foi apenas criado para saber se foi criado com sucesso, não é necessario
		System.out.println("Directory created successfuly: " + success);
		
		
		sc.close();
		
		

	}

}
