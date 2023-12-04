package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {
		 
		//Forma feia de ler um arquivo, apenas didatico
		String path = "c:\\temp\\in.txt";
		
		
		FileReader fr = null;	
		BufferedReader br  = null;
		
		try {
			fr = new FileReader(path);
			//Estabeleci uma sequencia de leitura a partir do path, onde está o local do arquivo
			br = new BufferedReader(fr);
			//Com o buffered reader a leitura se torna mais rapida, sempre a partir do FileReader
			
			// Ou então br  = new BufferedReader(fr);
			
			String line = br.readLine();
			//A variavel br que é um bufferedreader foi salvo na string line
			
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
				//Caso a line esteja vazia ele não irá ler
			}
			
		}
		catch (IOException e){
			System.out.println("Error " + e.getMessage());
			
		}
		finally {
			try {
			if (br != null) {
				br.close();
			}
			if (fr!= null) {
				fr.close();
			}
			//Com isso fechamos tanto o br quanto o fr
			}
			catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		

	}

}
