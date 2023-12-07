package application; 

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		List<Employee> list = new ArrayList<>();
		String path = "C:\\temp\\in2.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			String employeeCsv = br.readLine();
			while (employeeCsv != null) {
				String[] fields = employeeCsv.split(",");
				//Separo cada parte da linha que tem virgula
				list.add(new Employee(fields[0], Double.parseDouble(fields[1])));
				//Após a separação salvo o que está em 0 no vetor como String name e no [1] como ainda está em string converto em Double e salvo na Double salary
				employeeCsv = br.readLine();
			}
			Collections.sort(list);
			//Collections.sort muda a ordem da lista para ficar em ordem alfabetica
			for(Employee emp : list) {
				System.out.println(emp.getName() + ", " + emp.getSalary());
			}
		}
		catch(IOException e){
			System.out.println("Error: " + e.getMessage());
		}
	}
}
