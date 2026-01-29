package fundamentos;

import java.util.Scanner;

public class Metodos {
    public static void main(String[] args) {
        /*
        MÉTODOS são procedimentos ou funções dentro de uma classe que podem ser utilizadas para separar uma
         lógica do nosso código.

         <visibilidade> <?static> <tipoDeRetorno> <nomeDoMetodo> (<parâmetros>) {
            COMANDO_1;
            COMANDO_2;
            COMANDO_3;
            ...
            COMANDO_N;
            }
        */

        //EXEMPLO SEM PARÂMETROS
        // Chamar/executar o metodo
//         imprimirMeuNome();
//         imprimir("Eita Lelê!!!");
//        imprimirNomeIdadeFormatado("Moa", 25);

        //EXEMPLO COM PARÂMETROS
//        Scanner scanner = new Scanner(System.in);
//        imprimir("Digite seu nome: ");
//        String nome = scanner.nextLine();
//        imprimir("Digite sua idade: ");
//        int idade = Integer.parseInt(scanner.nextLine());
//        imprimirNomeIdadeFormatado(nome, idade);
//
//        // EXEMPLO COM PARÂMETRO REFATORADO
//        String nome = retornarEntradaDoUsuario("Digite seu nome");
//        int idade = Integer.parseInt(retornarEntradaDoUsuario("Digite sua idade"));
//        imprimirNomeIdadeFormatado(nome, idade);

        // EXEMPLO COM RETORNO
        int valor1 = Integer.parseInt(retornarEntradaDoUsuario("Digite um número"));
        int valor2 = Integer.parseInt(retornarEntradaDoUsuario("Digite outro número"));
        int soma = somar(valor1, valor2);
        imprimir(String.valueOf(soma));
    }
    public static void imprimirMeuNome() {
        imprimir("Moa");
    }
    public static void imprimir(String texto) {
        System.out.println(texto);
    }
    public static void imprimirNomeIdadeFormatado(String nome, int idade){
        imprimir("O nome é " + nome + ", com " + idade + " anos.");
    }
    public static String retornarEntradaDoUsuario(String mensagem){
        imprimir(mensagem);
        Scanner scanner = new Scanner(System.in);
        String entradaUsuario = scanner.nextLine();
        return entradaUsuario;
    }
    public static int somar(int valor1, int valor2){
        return valor1 + valor2;
    }
}
