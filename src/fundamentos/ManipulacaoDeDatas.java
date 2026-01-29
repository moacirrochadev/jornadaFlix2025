package fundamentos;

import java.util.Date;

public class ManipulacaoDeDatas {
    public static void main(String[] args) {
        /* MANIPULAÇÃO DE DATAS
        1. Conceito de Datas
        - Datas representam um ponto específico no tempo.
        - Usadas para registar eventos, calcular intervalos e muito mais.
        Exemplo prático: Marcar a data de um compromisso ou calcular quantos dias faltam para um evento.
        * */
//        Date date = new Date(); // Data e horas atuais
//        System.out.println("Data atual: " + date);
//        Date birthday = new Date(80, 6, 13);
//        System.out.println("Minha data de nascimento é: "+ birthday);

        // PARA UTILIZAR DATA DEVEMOS UTILIZAR OS MILISEGUNDOS
        // Partindo do ponto zero = 01/01/1970 00:00:00
//         long timestamp = 62484048000000L; // Milisegundos para 08/09/1991
        // https://convertlive.com/pt/u/convert/milisegundos/em/anos#684298800000
        // timestamp / 1000 / 60 / 60 / 24 / 365
//         birthday = new Date(timestamp);
//         System.out.println("Minha data de nascimento: "+ birthday);
    }
}
