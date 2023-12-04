package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {
		
		String[] lines = new String[] {"Good morning", "Good afternoon", "Good night"};
	
		String path = "c:\\temp\\out.txt";
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
			//o , true serve para que seja adicionado ao arquivo, e não recriado
			for(String line : lines) {
				bw.write(line);
				bw.newLine();
				//Para dar a quebra de linha
			}
		}
		//Instanciamos o file writer com o path dentro do buffered writer com a variavel bw, com isso, o que está na matriz lines, irá ser escrito (bw.write)
		// e o arquivo sera criado
		catch(IOException e) {
			e.printStackTrace();
		}
	}

}
