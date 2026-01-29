package fundamentos;

public class VetoresOuArrays {
    public static void main(String[] args) {
        /*
        ARRAYS OU VETORES
        - Um vetor (ou array) é uma estrutura de dados que armazena um conjunto de elementos do mesmo tipo;
        - É semelhante a uma lista, mas todos os elementos têm o mesmo tipo de dados e são armazenados em
        posições sequenciais de memória;
        - Exemplo: tipo[] nomeDoVetor = new tipo[tamanhoDoVetor];
        - tipo, é o tipo de dados dos elementos do vetor;
        - nomeDoVetor, é o nome do vetor ou variável;
        - tamanhoDoVetor, é o número de elementos que o vetor pode armazenar;
        */
//        Exemplo prático:
        int[] minhasNotas = new int[4];
        minhasNotas[0] = 7;
        minhasNotas[1] = 8;
        minhasNotas[2] = 6;
        minhasNotas[3] = 9;

        System.out.println("Minha primeira nota é: " + minhasNotas[0]);
        System.out.println(minhasNotas.length);
    }
}
