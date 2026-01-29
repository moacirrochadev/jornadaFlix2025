import OrientacaoObjetos.*;
import OrientacaoObjetos.exercicios_aula01.Animal;
import OrientacaoObjetos.exercicios_aula01.Funcionario;
import OrientacaoObjetos.exercicios_aula01.Veiculo;

public class Main {
    public static void main(String[] args) {
        // Instância da Classe Funcionario
//        Funcionario gerente = new Funcionario();
//        gerente.nome = "Carlos";
//        gerente.funcao = "Gerente de Projetos";
//        gerente.salario = 5000.0f;
//        System.out.println("--- Funcionário ---");
//        System.out.println("Nome: " + gerente.nome);
//        gerente.calcularSalario();
//        Funcionario desenvolvedor = new Funcionario();
//        desenvolvedor.nome = "Moa";
//        desenvolvedor.funcao = "Desenvolvedor de Software";
//        desenvolvedor.salario = 4000.0f;
//        System.out.println("--- Funcionário ---");
//        System.out.println("Nome: " + desenvolvedor.nome);
//        desenvolvedor.calcularSalario();

        // Instância da Classe Animal
//        Animal cachorro = new Animal();
//        cachorro.nome = "Rex";
//        cachorro.idade = 5;
//        cachorro.som = "Au Au";
//        cachorro.emitirSom();
//        Animal gato = new Animal();
//        gato.nome = "Kitty";
//        gato.idade = 3;
//        gato.som = "Miau";
//        gato.emitirSom();
//        Animal passaro = new Animal();
//        passaro.nome = "Piu-piu";
//        passaro.idade = 4;
//        passaro.som = "Piu Piu";
//        passaro.emitirSom();
//        System.out.println("-----------------------");
//        System.out.println("Animal: " + cachorro.nome + ", Idade: " + cachorro.idade + " anos");
//        System.out.println("Animal: " + gato.nome + ", Idade: " + gato.idade + " anos");
//        System.out.println("Animal: " + passaro.nome + ", Idade: " + passaro.idade + " anos");

        // Instância da Classe Veículo
//        Veiculo eletrico = new Veiculo(); // Instância da classe Veículo
//        eletrico.nome = "BYD Elétrico";
//        eletrico.cor = "Preto";
//        eletrico.numeroDeRodas = 4;
//        eletrico.velocidade = 0;
//        Veiculo combustao = new Veiculo(); // Instância da classe Veículo
//        combustao.nome = "Toyota Corolla";
//        combustao.cor = "Prata";
//        combustao.numeroDeRodas = 4;
//        combustao.velocidade = 0;
//        eletrico.imprimiAtributosDaClasse();
//        eletrico.mover();
//        eletrico.frear();
//        combustao.imprimiAtributosDaClasse();
//        combustao.mover();
//        combustao.frear();
//        CarroEletrico carroEletrico = new CarroEletrico();
//        carroEletrico.ligar();
//        carroEletrico.imprimirVelocidade(60);
//        CarroCombustao carroCombustao = new CarroCombustao();
//        carroCombustao.ligar();
//        carroCombustao.imprimirVelocidade(80);

        /*---------INSTÂNCIA DA CLASSE BOLO----------*/
//        Bolo boloDeChocolate = new Bolo(); // Instância da classe Bolo
//        boloDeChocolate.nome = "Bolo de Chocolate";
//        boloDeChocolate.ingredientes = new String[]{
//                "2 xícaras de farinha de trigo",
//                "1 xícara de açúcar",
//                "1 xícara de chocolate em pó",
//                "1 colher de sopa de fermento em pó",
//                "3 ovos",
//                "1 xícara de leite"
//        };
//        boloDeChocolate.modoDePreparo = new String[]{
//                "Pré-aqueça o forno a 180°C.",
//                "Misture os ingredientes secos em uma tigela.",
//                "Adicione os ovos e o leite, mexendo até obter uma massa homogênea.",
//                "Despeje a massa em uma forma untada.",
//                "Asse por 35-40 minutos ou até que um palito saia limpo."
//        };
//        boloDeChocolate.temperatura = 30; // Temperatura inicial do for// no
//        System.out.println("--- Bolo de Chocolate ---");
//        boloDeChocolate.imprimirIngredientes();
//        boloDeChocolate.imprimirModoDePreparo();
//
//        Bolo boloDeMorango = new Bolo(); // Instância da classe Bolo
//        boloDeMorango.nome = "Bolo de Morango";
//        boloDeMorango.ingredientes = new String[]{
//                "2 xícaras de farinha de trigo",
//                "1 xícara de açúcar",
//                "200g de morangos picados",
//                "1 colher de sopa de fermento em pó",
//                "3 ovos",
//                "1 xícara de leite"
//        };
//        boloDeMorango.modoDePreparo = new String[]{
//                "Pré-aqueça o forno a 180°C.",
//                "Misture os ingredientes secos em uma tigela.",
//                "Adicione os ovos, o leite e os morangos picados, mexendo até obter uma massa homogênea.",
//                "Despeje a massa em uma forma untada.",
//                "Asse por 35-40 minutos ou até que um palito saia limpo."
//        };
//        boloDeMorango.temperatura = 25; // Temperatura inicial do forno
//        System.out.println("--- Bolo de Morango ---");
//        boloDeMorango.imprimirIngredientes();
//        boloDeMorango.imprimirModoDePreparo();
//
//        BoloNegaMaluca boloNegaMaluca = new BoloNegaMaluca(); // Instância da classe BoloNegaMaluca
//        boloNegaMaluca.nome = "Bolo Nega Maluca";
//        boloNegaMaluca.ingredientes = new String[]{
//                "2 xícaras de farinha de trigo",
//                "1 xícara de açúcar",
//                "1 xícara de chocolate em pó",
//                "1 colher de sopa de fermento em pó",
//                "3 ovos",
//                "1 xícara de leite",
//                "1 xícara de óleo"
//        };
//        boloNegaMaluca.modoDePreparo = new String[]{
//                "Pré-aqueça o forno a 180°C.",
//                "Misture os ingredientes secos em uma tigela.",
//                "Adicione os ovos, o leite e o óleo, mexendo até obter uma massa homogênea.",
//                "Despeje a massa em uma forma untada.",
//                "Asse por 35-40 minutos ou até que um palito saia limpo."
//        };
//        boloNegaMaluca.temperatura = 28; // Temperatura inicial do forno
//        System.out.println("--- Bolo Nega Maluca ---");
//        boloNegaMaluca.imprimirIngredientes();
//        boloNegaMaluca.imprimirModoDePreparo();

        // Exemplo de Polimorfismo com sobrescrita de metodo
//        BoloDeChocolate novoBoloDeChocolate = new BoloDeChocolate(); // Instância da classe BoloDeChocolate
//        Bolo bolo = new Bolo(); // Instância da classe Bolo
//        System.out.println("--- Assando Bolo de Chocolate ---");
//        System.out.println("Usando o metodo da classe BoloDeChocolate:");
//        System.out.println(novoBoloDeChocolate.temperatura);
//        System.out.println("O bolo foi colocado para assar.");
//        novoBoloDeChocolate.assarBolo(); // Chama o metodo sobrescrito na classe BoloDeChocolate

        // Exemplo de Polimorfismo com sobrecarga de metodo
//        Bolo bolo = new Bolo();
//        System.out.println(bolo.temperatura);
//        bolo.assarBolo(); // Chama o metodo original da classe Bolo
//        System.out.println(bolo.temperatura);
//        bolo.assarBolo(180); // Chama o metodo sobrecarregado com 1 parâmetro
//        System.out.println(bolo.temperatura);
//        bolo.assarBolo(180, 15); // Chama o metodo sobrecarregado com 2 parâmetros
//        System.out.println(bolo.temperatura);

        // Exemplo de uso de construtores
//        Bolo boloSimples = new Bolo("Bolo Simples", 1.5f);
//        System.out.println("Nome do bolo: " + boloSimples.nome);
//        System.out.println("Peso do bolo: " + boloSimples.peso + " kg");
    }
}