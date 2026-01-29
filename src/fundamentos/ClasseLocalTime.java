package fundamentos;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class ClasseLocalTime {
    public static void main(String[] args) {
        // Representa apenas o horário
        LocalTime now = LocalTime.now(); // Retorna a hora atual
        System.out.println(now);
        LocalTime horaEspecifica = LocalTime.of(15, 30); // Retorna um horário específico
        System.out.println(horaEspecifica);
        // Combina data e hora
        LocalDateTime agora = LocalDateTime.now(); // Retorna data e hora atuais
        System.out.println(agora);
        LocalDateTime dataHoraEspecifica = LocalDateTime.of(2026, 01, 13, 12, 26);
        System.out.println(dataHoraEspecifica);
    }
}
