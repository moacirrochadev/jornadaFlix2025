package fundamentos;

import java.util.Calendar;

public class ClasseCalendar {
    public static void main(String[] args) {
        /*
        Esta classe também não é mais usada, assim como a classe Date
        * */
        Calendar calendario = Calendar.getInstance();
        System.out.println("dia: " + calendario.getTime());
    }
}
