package conteudo.classes;

public class Moto {

    String vidro;
    String roda;
    String gidao;
    private static int aceleracao = 0;

    void frear() {
        aceleracao = aceleracao - 10;
    }

    void ligarmotor() {
        System.out.println("motor ligado");
    }

    void desligarmotor() {
        System.out.println("motor desligado");
    }

    void acelerar() {
        aceleracao = aceleracao + 10;
        System.out.println("a moto acelerou. velocidade: " + aceleracao);
    }
}
