package OrientacaoObjetos.exercicios_aula02;

public class Gato extends Animal{
    public Gato(String nome, String som){
        super(nome);
    }
    @Override
    public void emitirSom() {
        System.out.println("O gato está miando: Miau Miau!");
    }
}
