package OrientacaoObjetos;

import java.util.Date;

public class Bolo {
        // ATRIBUTOS = O que a classe bolo pode ter? Variáveis, características...
        // modificador de acesso + tipo + nome da variável
        public String nome;
        public float peso;
        public String[] ingredientes;
        public String[] modoDePreparo;
        public float temperatura;
        public Date dataDeValidade;

        //public Bolo(){}
    public Bolo(String nome, float peso){
        this.nome = nome;
        this.peso = peso;
    }

        // MÉTODOS = O que a classe pode fazer? Comportamentos...
        public void imprimirIngredientes() {
            // Comportamento... o que ele vai fazer, executar...
        for (int i = 0; i < ingredientes.length; i++){
            System.out.println(ingredientes[i]);
            }
        }

        public void imprimirModoDePreparo(){
            for (int i = 0; i < modoDePreparo.length; i++){
                System.out.println(modoDePreparo[i]);
            }
        }

        void prepararBolo(){
            System.out.println("Você vai precisar de ");
            imprimirIngredientes();
            System.out.println("Siga os passos abaixo: ");
            imprimirModoDePreparo();
        }

        float recuperarValorDeVendaDoBolo(float precoDeCusto){
            float valorPorBolo = precoDeCusto * 1.1f;
            return valorPorBolo;
        }

        public void assarBolo(){
            temperatura = temperatura + 10;
            System.out.println("A temperatura do forno é: " + temperatura);
        }
        // Exemplos de sobrecarga de metodo (overloading)
        public void assarBolo(int temperaturaDesejada){
            temperatura = temperatura + temperaturaDesejada;
        }
        public void assarBolo(int temperaturaDesejada, int temperaturaForma){
            temperatura = temperatura + temperaturaDesejada + temperaturaForma;
        }
    }