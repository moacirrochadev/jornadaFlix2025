package OrientacaoObjetos.exercicios_aula02;

public class Moto extends Veiculo{
    @Override
    public void acelerar(){
        System.out.println("A moto " + marca + " " + modelo + " está acelerando.");
    }
    public Moto(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
    }
}
