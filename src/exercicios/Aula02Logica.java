package exercicios;

/*
    Complementar os métodos abaixo, usando os fundamentos de lógica de programação aprendidos na aula, seguindo as instruções nos comentários.
    - Para cada método, implemente a lógica necessária para atender ao requisito descrito.
    - Use if/else, loops e switch conforme indicado.
    - Imprima os resultados no console conforme os exemplos fornecidos.
    - Considerações:
        - Comece sempre do TODO e implemente a lógica passo a passo.
        - Mantenha o código limpo e legível.
        - Teste cada método individualmente para garantir que funciona corretamente.
 */
public class Aula02Logica {

    public static void main(String[] args) {
        // 1) Par ou ímpar (usar if/else)
        verificarParOuImpar(7);

        // 2) Maior de três (usar if/else)
        verificarMaiorDeTres(4, 11, 2);

        // 3) Contar vogais em uma String (usando loop e if)
        contarVogais("Programacao Java");

        // 4) Calcular a média de um array de números (usando loop)
        calcularMediaArray(new int[]{5, 10, 15, 20});

        // 5) Verificar dia da semana (usar switch)
        verificarDiaDaSemana(3);
    }

    private static void verificarParOuImpar(int numero) {
        // TODO: Implementar a lógica para verificar se o número é par ou ímpar e imprimir o resultado no console.
        // Exemplo Saída: "O número 7 é ímpar."
        if (numero % 2 == 0) {
            System.out.println("Este numero é par: "+ numero);
        } else {
            System.out.println("impar");
        }
    }

    private static void verificarMaiorDeTres(int numero1, int numero2, int numero3) {
        // TODO: Implementar a lógica para verificar qual dos três números é o maior e imprimir o resultado no console.
        // Exemplo Saída: "O maior número é 11."
        int maiorNumero = numero1;
        if (numero2 > maiorNumero) {
            maiorNumero = numero2;
        }
        if (numero3 > maiorNumero) {
            maiorNumero = numero3;
        }
        System.out.println("maior numero: "+ maiorNumero);
    }

    private static void contarVogais(String texto) {
        // TODO: Implementar a lógica para contar o número de vogais em uma string e imprimir o resultado no console.
        // Exemplo Saída: "O texto 'Programacao Java' possui 7 vogais."
        int quantidadeVogais = 0;
        String textominusculo = texto.toLowerCase();

        for (int i = 0; i<textominusculo.length(); i++) {
            char caracter = textominusculo.charAt(i);
           if (caracter=='a' || caracter=='e' || caracter=='i' || caracter=='o' || caracter=='u') {
               quantidadeVogais++;
           }
        }

        System.out.println("quantidade de vogais: "+ quantidadeVogais);
    }

    private static void calcularMediaArray(int[] numeros) {
        // TODO: Implementar a lógica para calcular a média dos números em um array e imprimir o resultado no console.
        // Exemplo Saída: "A média dos números é 12.5."
        int soma = 0;
        for (int i =0; i<numeros.length; i++) {
            soma += numeros[i];
        }

        double resultado= (double) soma / numeros.length;
        System.out.println("media: "+resultado);
    }

    private static void verificarDiaDaSemana(int dia) {
        // TODO: Implementar a lógica para verificar o dia da semana usando switch e imprimir o resultado no console.
        // Exemplo Saída: "O dia 3 corresponde a quarta-feira."
        String diasemana= switch (dia) {
            case 1 -> "domingo";
            case 2 -> "segunda";
            case 3 -> "terça";
            default -> "dia nao encontrado";
        };
        System.out.println("dia da semana: "+ diasemana);
    }
}
