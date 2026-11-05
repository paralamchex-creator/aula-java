package conteudo.classes;

public class Barco extends Veiculo {

    private int qtdPorta;
    private String placa;

    public Barco(String cor, int qtdAssentos, int qtdPorta, String placa) {
        super(cor, qtdAssentos);
        this.qtdPorta = qtdPorta;
        this.placa = placa;
    }

    @Override
    public String toString() {
        return "Barco{" +
                "qtdPorta='" + qtdPorta + '\'' +
                ", placa='" + placa + '\'' +
                ", cor='" + cor + '\'' +
                ", qtdAssentos=" + qtdAssentos +
                ", qtdCombustivel=" + qtdCombustivel +
                '}';
    }
}
