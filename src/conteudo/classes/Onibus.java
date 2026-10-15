package conteudo.classes;

public class Onibus {

    String porta;
    String cor;
    String vidro;
    String motorista;
    String roda;
    int capacidademaxima = 0;
    int combustivel = 200;
    int velocidade = 0;

    void acelerar() {
        if (combustivel > 0) {
            velocidade += 10;
            combustivel -= 5;
            System.out.println("O onibus esta a " + velocidade + "KmPH");
            System.out.println(" combustivel restante: " + combustivel);
        } else {
            System.out.println(" sem combustivel");
            ;
        }

    }
    void cor() {
        System.out.println(" o onibus é verde");
    }
}
