package desafio.personagens;

public class Jogador {
    private String nome;
    private int madeira;
    private int pedra;
    private int ferro;
    private boolean possuiEspada;

    public Jogador(String nome) {

        this.nome = nome;
        this.madeira = 0;
        this.pedra = 0;
        this.ferro = 0;
        this.possuiEspada = false;
    }

    public void minerarMadeira() {
        madeira += 3;
        System.out.println("vc minerou 3 madeiras" );
    }
    public void minerarPedra() {
        if (madeira < 3) {
            System.out.println("erro. colete 3 madeiras");
        }   else {
            pedra += 2;
            System.out.println("vc minerou 2 pedras");
        }
    }
    public void minerarFerro() {
        if (pedra < 2) {
            System.out.println("erro. colete 2 pedras");
        }   else {
            ferro += 1;
            System.out.println("vc minerou 1 ferro");
        }
    }
    public void mostrarInventario() {
        System.out.println("inventario aberto: \n madeira = " + madeira + "\npedra: " + pedra + "\nferro: " + ferro);
    }
    public void fabricarEspada() {
        if (ferro < 2 || madeira < 1 || possuiEspada == true) {
            System.out.println("erro. falta 2 ferro ou 1 madeira. colete mais");
        } else {
            possuiEspada = true;
            madeira -= 1;
            ferro -= 2;
            System.out.println("espada criada com sucesso");
        }
    }
}
// fabricar = 2 ferros e 1 madeira