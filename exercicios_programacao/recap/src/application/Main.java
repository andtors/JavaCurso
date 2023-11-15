package application;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a data no formato (YYYY-MM-DD): ");
        String inputData = scanner.next();

        // Formatar a data inserida
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate dataDoUsuario = LocalDate.parse(inputData, formatter);

        System.out.println("Data inserida: " + dataDoUsuario);

        // Agora você pode usar 'dataDoUsuario' conforme necessário.
    }
}