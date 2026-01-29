package fundamentos;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormatacaoDatas {
    public static void main(String[] args) {
//        LocalDate date = LocalDate.of(1980, 7, 13);
//        System.out.println("Formato ISO Padrão: "+date); // Formato padrão ISO-8601 (YYYY-MM-DD)
//        // Formato personalizado (DD/MM/YYYY)
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//        String formattedDate = date.format(formatter);
//        System.out.println("Formato Personalizado (DD/MM/YYYY): " +formattedDate);
        // Usando LocalDateTime
//        LocalDateTime date = LocalDateTime.of(1980, 7, 13, 15, 30, 45);
//        System.out.println("Formato ISO Padrão: "+date); // Formato padrão ISO-8601 (YYYY-MM-DD)
//        // Formato personalizado (DD/MM/YYYY)
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy H:mm:ss");
//        String formattedDate = date.format(formatter);
//        System.out.println("Formato Personalizado (DD/MM/YYYY): " +formattedDate);

        // Convertendo String para Data
        String dateString = "13/07/1980 15:30:45";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy H:mm:ss");
        LocalDateTime date = LocalDateTime.parse(dateString, formatter);
        System.out.println("Data convertida: " +date);
    }
}
