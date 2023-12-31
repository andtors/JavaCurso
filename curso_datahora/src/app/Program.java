package app;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program {

	public static void main(String[] args) {
		
		//https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html
		// Link de referencia para formatar as datas
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		/* Data formatada*/
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		LocalDate d01 = LocalDate.now();
		/*Apenas Ano - mês - dia*/
		LocalDateTime d02 = LocalDateTime.now();
		/*Ano - mês - dia - hora - minuto - segundo*/
		Instant d03 = Instant.now();
		/*Ano - mês - dia - hora - minuto - segundo corrigido ao fuso horario
		 * de Londres (+3 em sp)*/
		
		LocalDate d04 = LocalDate.parse("2023-07-10");
		/*Formato padrão do horario em iso, qualquer outro formato que não seja
		 *esse teremos que criar um personalizado*/
		LocalDateTime d05 = LocalDateTime.parse("2023-07-10T01:30:26");
		Instant d06 = Instant.parse("2023-07-10T01:30:26Z");
		Instant d07 = Instant.parse("2023-07-10T01:30:26-03:00");
		/*Podemos descontar ou somar os fusos horarios*/
		
		LocalDate d08 = LocalDate.parse("20/07/2022", fmt1);
		/*Ou LocalDate d08 = LocalDate.parse("20/07/2022", DateTimeFormatter.ofPattern("dd/MM/yyyy"));*/
		LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:30", fmt2);
		
		LocalDate d10 = LocalDate.of(2022, 7, 20);
		LocalDateTime d11 = LocalDateTime.of(2022, 7, 20, 1, 30);
		
		System.out.println("do1 = " + d01);
		System.out.println("do2 = " + d02);
		System.out.println("do3 = " + d03);
		System.out.println("do4 = " + d04);
		System.out.println("do5 = " + d05);
		System.out.println("do6 = " + d06);
		System.out.println("do7 = " + d07);
		System.out.println("do8 = " + d08);
		System.out.println("do9 = " + d09);
		System.out.println("d10 = " + d10);
		System.out.println("d11 = " + d11);
		
		
		

	}

}
