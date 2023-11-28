package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Reservation;

public class Program {
	//Resoluição muito ruim
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
		//O problema de fazer desta forma é que estamos fazendo tudo direto no programa, utilizando muitos if's e else's o que pode acarretar em problemas além de deixar o código confuso
		else {
			Reservation reservation = new Reservation(number, checkIn, checkOut);
			System.out.println("Reservation: " + reservation);
			System.out.println();
			System.out.println("Enter data to update the reservation: ");
			System.out.print("Check-in date (dd/MM/yyyy): ");
			checkIn = sdf.parse(sc.next());
			System.out.print("Check-out date (dd/MM/yyyy): ");
			checkOut = sdf.parse(sc.next());
			
			Date now = new Date();
			if(checkIn.before(now) || checkOut.before(now)) {
				/*Se o checkIn for antes de hoje (now) e (||) checkOut antes de hoje (now) irá aparecer a seguinte mensagem de erro:*/
				System.out.println("Error in reservation: Reservation dates for updates must be future dates");
			}
			else if (!checkOut.after(checkIn)) {
				/*Se a data de checkOut não for posterior a data de checkIn irá aparecer a seguinte mensagem*/
				System.out.println("Error reservation: Check-out date must be after check-in date");
			}
			else {
				reservation.updateDates(checkIn, checkOut);
				System.out.println("Reservation: " + reservation);
			}
		}
		
		
		
		
		sc.close();

	}

}
