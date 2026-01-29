package OrientacaoObjetos;

public class BoloDeChocolate extends Bolo {
    public BoloDeChocolate(String nome, float peso) {
        super(nome, peso);
    }

    @Override // sobrescrita de metodo
    public void assarBolo(){
        temperatura = temperatura + 20;
        System.out.println("A temperatura do forno para o bolo de chocolate é: " + temperatura);
    }

}
