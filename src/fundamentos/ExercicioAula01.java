package fundamentos;

public class ExercicioAula01 {
    public static void main(String[] args) {
        System.out.println("Olá, mundo!");

        //Soma de dois números inteiros
        int numero01 = 13;
        int numero02 = 71;
        int soma = numero01 + numero02;
        System.out.println("A soma de " + numero01 + " e " + numero02 + " é igual a " + soma);

        //Conversão de temperatura
        float temperaturaCelsius = 36.5f;
        float temperaturaFahrenheit = (temperaturaCelsius * 9/5) + 32;
        float temperaturaKelvin = temperaturaCelsius + 273.15f;
        System.out.println("A temperatura de " + temperaturaCelsius + "°C equivale a " + temperaturaFahrenheit + "°F e " + temperaturaKelvin + "K.");

        //Calculo de área de um retângulo
        float largura = 5.5f;
        float alturaRetangulo = 8.0f;
        float area = largura * alturaRetangulo;
        System.out.println("A área do retângulo de largura " + largura + " e altura " + alturaRetangulo + " é igual a " + area);
    }
}
