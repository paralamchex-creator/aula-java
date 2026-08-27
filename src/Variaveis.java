import java.time.Instant;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Variaveis {

    public static void main(String[] args) {
        int idade=14;
        double altura=1.68;
        String nome= "cauã";
        boolean ativo=true;
        char inicial='c';
        Instant agora=Instant.now();

        System.out.println("nome: "+ nome);
        System.out.println("idade: "+ idade);
        System.out.println("altura: "+ altura);
        System.out.println("agora: "+ agora);
    }
}