package conteudo.classes;

public class Veiculo {
    protected String cor;
    protected int qtdAssentos;
    protected double qtdCombustivel;

    public Veiculo(String cor, int qtdAssentos) {
        this.cor = cor;
        this.qtdAssentos = qtdAssentos;
    }

    public void ligar() {
        if (qtdCombustivel > 0) {
            System.out.println("Veiculo ligado");
        } else {
            System.out.println("Veiculo nao liga, sem combustivel");
        }
    }

    public void desligar() {
        if (qtdCombustivel > 1) {
            this.qtdCombustivel -= 2;
        }
        System.out.println("Veiculo desligado");
    }

    public void acelerar() {
        if (qtdCombustivel > 9) {
            this.qtdCombustivel -= 10;
        } else {
            desligar();
        }
    }

    public void abastecer(double qtdCombustivel) {
    this.qtdCombustivel += qtdCombustivel;
    }

    public double verQtdCombustivel() {
        return this.qtdCombustivel;
    }





}
