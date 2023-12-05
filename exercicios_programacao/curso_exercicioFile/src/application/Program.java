package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Order;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<Order> list = new ArrayList<>();
		
		
		System.out.println("Enter file path: ");
		String sourceFileStr = sc.nextLine();
		
		File sourceFile  = new File(sourceFileStr);
		String sourceFolderStr = sourceFile.getParent();
		
		boolean success = new File (sourceFolderStr + "\\out").mkdir();
		
		String targetFileStr = sourceFolderStr = "C:\\temp\\out\\source.csv";
		
		try(BufferedReader br = new BufferedReader(new FileReader(sourceFileStr))){
			String itemCsv = br.readLine();
			while(itemCsv != null) {
				//O while serve para dizer ao programa parar de ler quando só haver null
				String [] fields = itemCsv.split(",");
				String name = fields[0];
				double price = Double.parseDouble(fields[1]);
				int quantity = Integer.parseInt(fields[2]);
				
				list.add(new Order (name, price, quantity));
				
				
				itemCsv = br.readLine();
			}
			
			try (BufferedWriter bw = new BufferedWriter (new FileWriter(targetFileStr))) {
				
				for(Order item : list) {
					bw.write(item.getName() + "," + String.format("%.2f,", item.qntPri()));
					bw.newLine();
				}
				System.out.println(targetFileStr + " Created!");
			}
			catch (IOException e){
				System.out.println("Error writing file: " +e.getMessage());
			}
			
			
		}
		catch (IOException e){
			System.out.println("Error writing file: " + e.getMessage());
		}
		
		sc.close();
	}
}
