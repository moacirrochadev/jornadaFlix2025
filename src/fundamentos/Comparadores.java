package fundamentos;

public class Comparadores {
    public static void main(String[] args) {
        /*
    COMPARADORES
    == : Variável é igual a outra variável
    != : Variável é diferente de outra variável
    < : Variável é menor que outra variável
    > : Variável é maior que outra variável
    >= : Variável é maior ou igual a outra variável
    <= : Varável é menor ou igual a outra variável
    * */

        // == : Variável é igual a outra variável
//        System.out.println(1 == 1);
//        System.out.println(2 == 1);
//        boolean pagaPensao = false;
//        System.out.println(pagaPensao == true);

        // != : Variável é diferente de outra variável
//        System.out.println(1 != 1);
//        System.out.println(2 != 1);
//        boolean pagaPensao = false;
//        System.out.println(pagaPensao != false);

        // > : Variável é maior que outra
//        System.out.println(2 > 1);
//        System.out.println(2 > 3);

        // < : Variável é menor que outra
//        System.out.println(2 < 1);
//        System.out.println(2 < 3);

        // >= : Variável é maior ou igual a outra
//        System.out.println(2 >= 1);
//        System.out.println(2 >= 3);
//        System.out.println(2 >= 2);

        // <= : Variável é menor ou igual a outra
//        System.out.println(2 <= 1);
//        System.out.println(2 <= 3);
//        System.out.println(2 <= 2);

        /*
        AGREGADORES
        ! = NÃO ... !ehSolteiro (não ehSolteiro) PS.: Se a variável estiver com true ela se torna false e
        vice-versa
        && = e ... ehSolteiro e temVidaSocial
        || = ou ... ehSolteiro ou ehCasado
        */

        // NÃO = Inversão de valor => !ehSolteiro (não é solteiro)
//        boolean ehSolteiro = true;
//        System.out.println(!ehSolteiro);

        // && = ehSolteiro e temVidaSocial
        // Para que dê verdadeiro, as duas condições têm que ser verdadeiras
//        boolean ehSolteiro = true;
//        boolean temVidaSocial = true;
//        System.out.println(ehSolteiro && temVidaSocial);

        // || = ehSolteiro ou ehCasado
        // Uma das duas condições tem que ser verdadeira para o || ser verdadeiro
//        boolean ehSolteiro = true;
//        boolean ehCasado = false;
//        System.out.println(ehSolteiro || ehCasado);

        // Comandos if (se)
        boolean ehSolteiro = true;
        /*
        se (comando) então
        faça
            comandos;
        fimse
        * */
//        if (ehSolteiro == true){
//            System.out.println("É solteiro!");
//        }

        // Comando else (senão)
//        int restoDaDivisaoPor2 = 9 % 2;
//        if (restoDaDivisaoPor2 == 0){
//            System.out.println(" é par.");
//        } else {
//            System.out.println(" é ímpar.");
//        }

        // Comando if else
//        int restoDaDivisaoPor2 = 9 % 2;
//        if (restoDaDivisaoPor2 == 0){
//            System.out.println("É par");
//        } else if (restoDaDivisaoPor2 < 0){
//            System.out.println("É negativo");
//        } else {
//            System.out.println("É positivo");
//        }

        // Comando Switch (Escolha)
        int numeroSorteado = 10;
        switch (numeroSorteado){
            case  1:
                System.out.println("Ganhou um Tesla");
                break;
            case 2:
                System.out.println("Ganhou uma casa de frente para o mar");
                break;
            case 10:
                System.out.println("Ganhou um halls de cereja");
                break;
            default:
                System.out.println("Tente outra vez!");
                break;
        }
    }
}
