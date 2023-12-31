package app;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Program {

	public static void main(String[] args) {
		
		LocalDate d04 = LocalDate.parse("2022-07-20");
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
		
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yy HH:mm");
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yy HH:mm").withZone(ZoneId.systemDefault());
		/*Neste ultimo caso ele irá pegar por padrão o fuso horario do computador*/
		DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
		/*É Possivel usar datas pernalizadas já cridas, está no caso está no formato ISO, porém 
		 * se houver fuso horario dará erro*/
		DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;
		System.out.println("d04 = " + d04.format(fmt1));
		/*Para que a data saia customizada conforme configurada anteriormente*/
		System.out.println("d04 = " + fmt1.format(d04));
		/*Também é possivel fazer desta forma*/
		System.out.println("d04 = " + d04.format(DateTimeFormatter.ofPattern("dd/MM/yy")));
	   /*Ou então podemos instanciar o obj tudo direto numa linha só*/
		
		System.out.println("d05 = " + d05.format(fmt1));
		System.out.println("d05 = " + d05.format(fmt2));
		System.out.println("d05 = " + d05.format(fmt4));
		
		System.out.println("d06 = " + fmt3.format(d06));
		/*Neste caso puxamos o objeto para definir como saira a data e hora*/
		System.out.println("d06 = " + fmt5.format(d06));
		System.out.println("d06 = " + d06.toString());
	}

}
