package conteudo.classes;

public class Aviao {

    String cabine;
    String asa;
    String roda;
    String empenagem;
    String cauda;
    private static int velocidade= 0;

    void entrar() {
        System.out.println("voce entrou na cabine");
    }
    void ligar() {
        System.out.println("motor ligado");
    }
    void desligar() {
        System.out.println("motor desligado");
    }
    void voar() { velocidade = velocidade + 100;
        System.out.println("iniciando decolagem. Velocidade: " + velocidade + "KmPH");
    }
    void pousar() {
        System.out.println("iniciando pouso");
    }
}
