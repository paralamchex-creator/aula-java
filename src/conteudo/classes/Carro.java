package conteudo.classes;

public class Carro extends Veiculo {

    private int qtdPorta;
    private String placa;

    public Carro(int qtdPorta, String placa, String cor, int qtdAssentos) {
        super(cor, qtdAssentos);
        this.qtdPorta = qtdPorta;
        this.placa = placa;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "qtdPorta='" + qtdPorta + '\''+
                ", placa='" + placa + '\'' +
                ", cor='" + cor + '\'' +
                ", qtdAssentos=" + qtdAssentos +
                ", qtdCombustivel=" + qtdCombustivel +
                '}';
    }
}
