package OrientacaoObjetos.exercicios_aula01;

public class Funcionario {
    public String nome;
    public String funcao;
    public float salario;
    public void calcularSalario(){
        System.out.println("O salário do funcionário " + nome + " é: R$ " + salario);
        float salarioComBonus = salario * 1.1f;
        System.out.println("O salário do funcionário " + nome + " com bônus é: R$ " + salarioComBonus);
    }
}
