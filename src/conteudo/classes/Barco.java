package conteudo.classes;

public class Barco {

    String madeira;
    String vela;
    String ancora;
    String mastro;
    String retranca;
    int acelerar = 0;
    int combustivel = 200;
    int velocidade = 0;
    int limiteVelocidade = 80;

    void acelerar() {
        if (combustivel > 0) {
            velocidade += 10;
            combustivel -= 5;
            System.out.println("O onibus esta a " + velocidade + "KmPH");
            System.out.println(" combustivel restante: " + combustivel);
        } else if (velocidade + 10 >= limiteVelocidade) {
            System.out.println("limite atingido");

        } else {
            System.out.println(" sem combustivel");
            ;
        }
        }
        void capitao() {
            System.out.println("o cappitao se chama caua");
        }
}
