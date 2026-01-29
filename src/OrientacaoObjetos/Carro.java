package OrientacaoObjetos;

public abstract class Carro {
    public abstract void ligar();

    public void imprimirVelocidade(int velocidade) {
        System.out.println(velocidade + " km/h");
    }
}
