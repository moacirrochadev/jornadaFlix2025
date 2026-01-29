package fundamentos;

public class Variaveis {
    public static void main(String[] args) {
        String nomeDaPessoa = "Neto";
        int idade = 45;
        float altura = 1.73f;
        final float pi = 3.14f; // constante

        //true = é solteiro... false = não é solteiro
        boolean ehSolteiro = true;

        //Mudando o valor da variável nomeDaPessoa
        nomeDaPessoa = "Neto Silva";
        //pi = 5.14f; // Isso vai gerar um erro, pois pi é uma constante

        System.out.println("Nome: " + nomeDaPessoa);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Valor de pi: " + pi);
        System.out.println("É solteiro? " + ehSolteiro);
    }
}
