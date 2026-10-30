package conteudo.classes;

public class Moto extends Veiculo {

    private int qtdPorta;
    private String placa;

    public Moto(String cor, int qtdAssentos, int qtdPorta, String placa) {
        super(cor, qtdAssentos);
        this.qtdPorta = qtdPorta;
        this.placa = placa;
    }

    @Override
    public String toString() {
        return "Moto{" +
                "qtdPorta='" + qtdPorta + '\'' +
                ", placa='" + placa + '\'' +
                ", cor='" + cor + '\'' +
                ", qtdAssentos=" + qtdAssentos +
                ", qtdCombustivel=" + qtdCombustivel +
                '}';
    }
}
