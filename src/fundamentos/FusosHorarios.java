package fundamentos;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class FusosHorarios {
    public static void main(String[] args) {
        ZonedDateTime brazil = ZonedDateTime.now();
        System.out.println(brazil);
        ZonedDateTime CasteloBranco = ZonedDateTime.now(ZoneId.of("Europe/Lisbon"));
        System.out.println(CasteloBranco);
    }
}
