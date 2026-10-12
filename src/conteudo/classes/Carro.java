package conteudo.classes;

public class Carro {

    private String cor;
    private String porta;
    private String placa;
    private String vidro;
    private String banco;

    // teste
    private static Double combustivel = 25.5;

    void ligar() {
        System.out.println("carro ligado");
    }

    void desligar() {
        System.out.println("carro desligado");
    }

    void acelerar() {
        combustivel = combustivel - 10;
        System.out.println("o carro acelerou: combustivel: " + combustivel );
    }

    void vidro() {
        System.out.println("voce olha a paisagem");
    }

    void cor() {
        System.out.println("o carro é cinza");
    }

    void abir() {
        System.out.println("a porta está aberta");
    }

    void fechar() {
        System.out.println("a porta está fechada");
    }

    void sentar() {
        System.out.println("voce sentou no banco");
    }

    void levantar() {
        System.out.println("voce sentou no banco");
    }
}
