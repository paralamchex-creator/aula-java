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
public class Aula03Logica {

    public static void main(String[] args) {
        // 1) Classificar faixa etária para atividade (usar if/else)
        classificarFaixaEtaria(14);

        // 2) Classificar nota do aluno (usar if/else)
        classificarNota(7.5);

        // 3) Inverter texto (String + loop)
        inverterTexto("Java");

        // 4) Contar letras maiúsculas (String + if/else)
        contarMaiusculas("LoGiCa Em Java");

        // 5) Somar elementos de um array de inteiros (array int + loop)
        somarElementosArray(new int[]{2, 4, 6, 8});

        // 6) Encontrar menor valor no array (array int + if/else)
        encontrarMenorValor(new int[]{9, 3, 7, 1, 5});

        // 7) Contar nomes com mais de 5 letras (array String + if/else)
        contarNomesLongos(new String[]{"Ana", "Bruno", "Carolina", "Ivo"});

        // 8) Calcular média de preços (array double + loop)
        calcularMediaPrecos(new double[]{10.0, 25.5, 30.0});

        // 9) Verificar estação do ano pelo mês (usar switch/case)
        verificarEstacaoDoAno(7);

        // 10) Comparar dois números e mostrar diferença (if/else)
        compararNumerosEDiferenca(18, 11);
    }

    private static void classificarFaixaEtaria(int idade) {
        // TODO: Implementar a lógica para classificar a idade em: criança, adolescente ou adulto e imprimir o resultado no console.
        // Exemplo Saída: "Com 14 anos, a pessoa é adolescente."
        if (idade <= 12) {
            System.out.println("criança");

        } else if (idade <= 18) {
            System.out.println("adolescente");

        } else {
            System.out.println("adulto");
        }
    }

    private static void classificarNota(double nota) {
        // TODO: Implementar a lógica para classificar a nota do aluno (aprovado, recuperação ou reprovado) e imprimir o resultado.
        // Exemplo Saída: "Nota 7.5: aprovado."
        if (nota <= 3.0) {
            System.out.println("reprovado");
        } else if (nota <= 7.0) {
            System.out.println("recuperaçao");

        } else {
            System.out.println("aprovado");
        }
    }

    private static void inverterTexto(String texto) {
        // TODO: Implementar a lógica para inverter o texto e imprimir o resultado no console.
        // Exemplo Saída: "Texto invertido: avaJ."
        String invertido = new StringBuilder(texto).reverse().toString();
        System.out.println(invertido);
    }

    private static void contarMaiusculas(String texto) {
        // TODO: Implementar a lógica para contar quantas letras maiúsculas existem no texto e imprimir o resultado.
        // Exemplo Saída: "O texto possui 4 letras maiúsculas."
        int contarMaiusculas = 0;

        for (int i = 0; i < texto.length(); i++) {
            char caracter = texto.charAt(i);
            if (Character.isUpperCase(caracter)) {
                contarMaiusculas++;
            }
        }
        System.out.println("o texto tem " + contarMaiusculas + " maiusculas ");}
    private static void somarElementosArray(int[] numeros) {
        // TODO: Implementar a lógica para somar os elementos do array e imprimir o resultado no console.
        // Exemplo Saída: "A soma dos elementos é 20."
    }

    private static void encontrarMenorValor(int[] numeros) {
        // TODO: Implementar a lógica para encontrar o menor valor do array e imprimir o resultado no console.
        // Exemplo Saída: "O menor valor é 1."
    }

    private static void contarNomesLongos(String[] nomes) {
        // TODO: Implementar a lógica para contar quantos nomes têm mais de 5 letras e imprimir o resultado no console.
        // Exemplo Saída: "Quantidade de nomes longos: 2."
    }

    private static void calcularMediaPrecos(double[] precos) {
        // TODO: Implementar a lógica para calcular a média dos preços e imprimir o resultado no console.
        // Exemplo Saída: "A média dos preços é 21.83."
    }

    private static void verificarEstacaoDoAno(int mes) {
        // TODO: Implementar a lógica com switch/case para identificar a estação do ano com base no mês e imprimir no console.
        // Exemplo Saída: "Mês 7: inverno."
    }

    private static void compararNumerosEDiferenca(int numero1, int numero2) {
        // TODO: Implementar a lógica para verificar qual número é maior e imprimir também a diferença entre eles.
        // Exemplo Saída: "O maior número é 18 e a diferença é 7."
    }
}