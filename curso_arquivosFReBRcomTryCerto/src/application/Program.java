package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {
		 
		//Forma certa
		String path = "c:\\temp\\in.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			//Dessa forma podemos criar tudo num só código
			String line = br.readLine();
	
			
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			
			}
			
		}
		catch (IOException e){
			System.out.println("Error " + e.getMessage());
			
		}
		

	}

}
