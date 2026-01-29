package OrientacaoObjetos.exercicios_aula02;

public class Vaca extends Animal{
    public Vaca(String nome, String som){
        super(nome);
    }
    @Override
    public void emitirSom() {
        System.out.println("A vaca está mugindo: Muu Muu!");
    }
}
