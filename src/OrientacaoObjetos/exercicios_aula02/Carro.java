package OrientacaoObjetos.exercicios_aula02;

public class Carro extends Veiculo{
    @Override
    public void acelerar(){
        System.out.println("O carro " + marca + " " + modelo + " está acelerando.");
    }
    public Carro(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
    }
}
