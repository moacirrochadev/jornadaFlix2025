package OrientacaoObjetos.exercicios_aula02;

public class Cachorro extends Animal{
    public Cachorro(String nome, String som){
        super(nome);
    }
    @Override
    public void emitirSom(){
        System.out.println("O cachorro está latindo: Au Au!");
    }
}
