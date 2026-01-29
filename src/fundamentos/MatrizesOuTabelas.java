package fundamentos;

public class MatrizesOuTabelas {
    public static void main(String[] args) {
        /*
        MATRIZES OU TABELAS
        - São estruturas de dados retangulares que armazenam valores em linhas e colunas;
        tipo[][] nomeDaMatriz = new tipo[numeroDeLinhas][numeroDeColunas];
        - tipo: é o tipo de dado dos elementos da matriz;
        - nomeDaMatriz: é o nome ou variável da matriz;
        - numeroDeLinhas: é a quantidade de linhas que a matriz terá;
        - numeroDeColunas: é a quantidade de colunas que a matriz terá;
        * */
        int[][] matriz = new int[3][2]; // Declaração de uma matriz 3x2
        matriz[1][1] = 5;
        System.out.println(matriz[1][1]);

        // Outra forma de declarar e inicializar uma matriz
        int[][] matrizNova = {
            {1, 2},
            {3, 4},
            {5, 6}
        }; // Declaração e inicialização de uma matriz 3x2
        System.out.println(matrizNova[2][0]);
    }
}
