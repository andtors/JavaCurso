package application;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many rooms will be rented? ");
		int n = sc.nextInt();
		
		String[] name = new String[n];
		String[] email = new String[n];
		int[] room = {0,1,2,3,4,5,6,7,8,9};
		
		for (int i=0; i<n; i++) {
			System.out.println("Rent #" + (i+1));
			System.out.printf("Enter name:");
			name[i] = sc.next();
			System.out.printf("Email: ");
			email[i] = sc.next();
			System.out.printf("Room: ");
			room[i] = sc.nextInt();
			
		}
		System.out.println("Busy rooms: ");
		for (int i=0; i<n; i++) {
			System.out.println(room[i] + ": " + name[i] +", " + email[i]);
		}
		
		
		
		/*String[] nomes =  new String [n]
		 * int [] idades = new int[n]
		 * double[] alturas = new double[n]*/
		
		
		sc.close();
	
	
	}

}
