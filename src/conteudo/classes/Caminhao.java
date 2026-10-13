package conteudo.classes;

public class Caminhao {

    String roda;
    String carga;
    String cacamba;
    String ima;
    String vidro;
    private static int carregar = 0;
    private static int andar = 0;

    void ligar() {
        System.out.println("motor ligado");}
    void cor() {
        System.out.println("o caminhao é roxo");
    }
    void capacidade() {System.out.println("o caminhao suporta 250kg");
    }
    void carregar() {carregar = carregar + 20;
        System.out.println("o caminhao esta com: " + carregar + "kg");}
    void andar() {andar = andar + 15;
        System.out.println("o caminhao andou: " + andar + "km");}
}
