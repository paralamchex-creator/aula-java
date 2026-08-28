package conteudo;

public class Variaveis {

    public static void main(String[] args) {

        // Tipos numéricos
        int idade = 14;
        double altura = 1.68;
        long populacao = 1500000000L;
        float pi = 3.14f;

        // Tipos texto e lógicos
        String nome = "Cauã";
        boolean ativo = true;
        char inicial = 'C';

        // Tipos especiais
        java.time.Instant agora = java.time.Instant.now();
        java.math.BigDecimal salario = new java.math.BigDecimal("2500.50");

        // Exibindo os valores das variáveis no CONSOLE
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Ativo: " + ativo);
        System.out.println("Inicial: " + inicial);
        System.out.println("Agora: " + agora);
        System.out.println("Salário: " + salario);
    }
}