package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Reservation;

public class Program {
	//Resoluição ruim
	public static void main(String[] args) throws ParseException {
		/*Podemos tratar a exceção criando um try catch, ou então criamos uma exceção para o metodo inteiro*/
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Room number: ");
		int number = sc.nextInt();
		System.out.print("Check-in date (dd/MM/yyyy): ");
		Date checkIn = sdf.parse(sc.next());
		System.out.print("Check-out date (dd/MM/yyyy): ");
		Date checkOut = sdf.parse(sc.next());
		
		if (!checkOut.after(checkIn)) {
			System.out.println("Error reservation: Check-out date must be after check-in date");
		}
		else {
			Reservation reservation = new Reservation(number, checkIn, checkOut);
			System.out.println("Reservation: " + reservation);
			System.out.println();
			System.out.println("Enter data to update the reservation: ");
			System.out.print("Check-in date (dd/MM/yyyy): ");
			checkIn = sdf.parse(sc.next());
			System.out.print("Check-out date (dd/MM/yyyy): ");
			checkOut = sdf.parse(sc.next());
			
			String error = reservation.updateDates(checkIn, checkOut);
			if (error != null) {
				//se no metodo que está sendo executado na linha 37 não vier nulo, ele irá aparecer o texto de erro
				System.out.println(error);
			}
			
			else {
				// caso de nulo irá aparecer corretamente
				System.out.println("Reservation: " + reservation);
			}	
		}
		// neste caso estamos fazendo a logica das exceções do programa dentro da classe e dentro de metodos
		
		
		
		sc.close();

	}

}
