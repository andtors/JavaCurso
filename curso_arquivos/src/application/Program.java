package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		File file = new File ("c:\\temp\\in.txt");
		// necessario colocar duas barras
		
		Scanner sc = null; 
		try{
			sc = new Scanner (file);
			//Podemos fazer um scanner para ler o código que está dentro de um objeto
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		}
		catch(IOException e){
			System.out.println("Error: " + e.getMessage());
		}
		finally {
			if(sc != null) {
				sc.close();
			}
		}
		//Para que o programa não fique executando eternamente, criamos um finally com o sc.close dentro, e para que não venha
		//um scanner sem nada, colocamos para imprimir somente se houver algo diferente de null
		
	}

}
