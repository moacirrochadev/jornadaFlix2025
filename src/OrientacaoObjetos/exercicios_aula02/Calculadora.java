package OrientacaoObjetos.exercicios_aula02;

public class Calculadora {
    public void somar(){
        int numero1 = 13;
        int numero2 = 7;
        int resultado = numero1 + numero2;
        System.out.println("O resultado da soma é: " + resultado);
    }
    public void somar(float numero1, float numero2){
        float resultado = numero1 + numero2;
        System.out.println("O resultado da soma é: " + resultado);
    }
    public void somar(int[] numeros){
        int resultado = 0;
        for (int i = 0; i < numeros.length; i++){
            resultado += numeros[i];
        }
        System.out.println("O resultado da soma é: " + resultado);
    }
    public void somar(float[] numeros){
        float resultado = 0;
        for (int i = 0; i < numeros.length; i++){
            resultado += numeros[i];
        }
        System.out.println("O resultado da soma é: " + resultado);
    }
}
