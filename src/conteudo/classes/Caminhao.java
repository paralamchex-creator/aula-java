package conteudo.classes;

public class Caminhao extends Veiculo {

    private int qtdPorta;
    private String placa;

    public Caminhao(String cor, int qtdAssentos, int qtdPorta, String placa) {
        super(cor, qtdAssentos);
        this.qtdPorta = qtdPorta;
        this.placa = placa;
    }

    @Override
    public String toString() {
        return "Caminhao{" +
                "qtdPorta='" + qtdPorta + '\'' +
                ", placa='" + placa + '\'' +
                ", cor='" + cor + '\'' +
                ", qtdAssentos=" + qtdAssentos +
                ", qtdCombustivel=" + qtdCombustivel +
                '}';
    }
}
