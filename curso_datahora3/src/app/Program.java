package app;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Program {

	public static void main(String[] args) {
		LocalDate d04 = LocalDate.parse("2022-07-20");
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
		
		LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
		/*Aqui o programa pega a data atual, coloca numa variavel (r1) e já
		 * faz a conversão para a data default do computador*/
		LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
		/*Neste caso ele já faz a conversão para o fuso horario de portugal*/
		LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
		/*Convertido para o horario do meu computador*/
		LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));
		/*Convertido para o de portugal*/
		
		System.out.println("r1 = " + r1);
		System.out.println("r2 = " + r2);
		System.out.println("r3 = " + r3);
		System.out.println("r4 = " + r4);
		
		System.out.println("d04 dia = " + d04.getDayOfMonth());
		System.out.println("d04 mês = " + d04.getMonthValue());
		System.out.println("d04 ano = " + d04.getYear());
		/*Obtemos dia, mês e ano da data*/
		System.out.println("d05 hora = " + d05.getHour());
		System.out.println("d05 minuto = " + d05.getMinute());
		/*Obtemos hora e minuto da data*/
	}
	

}
