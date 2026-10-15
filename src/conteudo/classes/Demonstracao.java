package conteudo.classes;

public class Demonstracao {

    public static void main(String[] args) {
       Carro carro1 = new Carro(4, "123456789", "verde", 4);
        System.out.println(carro1);
        carro1.ligar();

        // abastecendo carro
        carro1.abastecer(100d);
        System.out.println("Qtd combustivel = " + carro1.verQtdCombustivel());
        carro1.ligar();

        // acelerando
        while(9d < carro1.verQtdCombustivel()) {
            carro1.acelerar();
        }
        carro1.ligar();
    }
}
