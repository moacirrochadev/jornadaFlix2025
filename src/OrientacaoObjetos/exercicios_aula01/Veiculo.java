package OrientacaoObjetos.exercicios_aula01;

public class Veiculo {
    public String nome;
    public String cor;
    public int numeroDeRodas;
    public int velocidade;

    public void mover(){
        velocidade = velocidade + 50;
        System.out.println("O veículo " + nome + " está se movendo a " + velocidade + " km/h.");
    }
    public void frear(){
        velocidade = velocidade - 25;
        System.out.println("O veículo " + nome + " está freando.");
    }
    public void imprimiAtributosDaClasse(){
        System.out.println("Nome: " + nome);
        System.out.println("Cor: " + cor);
        System.out.println("Número de Rodas: " + numeroDeRodas);
        System.out.println("Velocidade: " + velocidade + " km/h");
    }
}
