package conteudo.classes;

public class Onibus extends Veiculo {

    private int qtdPorta;
    private String placa;

    public Onibus(String cor, int qtdAssentos, int qtdPorta, String placa) {
        super(cor, qtdAssentos);
        this.qtdPorta = qtdPorta;
        this.placa = placa;
    }

    @Override
    public String toString() {
        return "Onibus{" +
                "qtdPorta='" + qtdPorta + '\'' +
                ", placa='" + placa + '\'' +
                ", cor='" + cor + '\'' +
                ", qtdAssentos=" + qtdAssentos +
                ", qtdCombustivel=" + qtdCombustivel +
                '}';
    }
}
