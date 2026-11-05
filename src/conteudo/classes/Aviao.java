package conteudo.classes;

public class Aviao extends Veiculo{

    private int qtdPorta;
    private String placa;

    public Aviao(String cor, int qtdAssentos, int qtdPorta, String placa) {
        super(cor, qtdAssentos);
        this.qtdPorta = qtdPorta;
        this.placa = placa;
    }

    @Override
    public String toString() {
        return "Aviao{" +
                "qtdPorta='" + qtdPorta + '\'' +
                ", placa='" + placa + '\'' +
                ", cor='" + cor + '\'' +
                ", qtdAssentos=" + qtdAssentos +
                ", qtdCombustivel=" + qtdCombustivel +
                '}';
    }
}
