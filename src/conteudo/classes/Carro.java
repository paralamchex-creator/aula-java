package conteudo.classes;

public class Carro {

   private String cor;
   private String porta;
   private String placa;
   private String vidro;
   private String banco;
   private Double combustivel;


    void ligar() {
        System.out.println("carro ligado");
    }
    void desligar() {
        System.out.println("carro desligado");
    }
    void acelerar() {
        combustivel = combustivel-10;
    }
}
