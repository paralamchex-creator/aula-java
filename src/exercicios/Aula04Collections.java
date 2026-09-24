package exercicios;

import java.util.*;

/*
    Complementar os métodos abaixo, usando os fundamentos de Collections aprendidos na aula, seguindo as instruções nos comentários.
    - Para cada método, escolha a interface (List, Set ou Map) e a implementação (ex: ArrayList, LinkedList, HashSet,
      LinkedHashSet, TreeSet, HashMap, LinkedHashMap, TreeMap) mais adequada ao que é pedido.
    - Pense sempre: preciso manter a ordem de inserção? Preciso de ordenação automática? Posso ter duplicados?
      Preciso de acesso rápido por chave? Isso deve guiar sua escolha de implementação.
    - Imprima os resultados no console conforme os exemplos fornecidos.
    - Considerações:
        - Comece sempre do TODO e implemente a lógica passo a passo.
        - Mantenha o código limpo e legível.
        - Teste cada método individualmente para garantir que funciona corretamente.
 */
public class Aula04Collections {

    public static void main(String[] args) {
        // ==================== LIST ====================
        // 1) Cadastrar uma fila de atendimento onde a ordem de chegada importa e pode haver nomes repetidos.
        cadastrarFilaDeAtendimento();

        // 2) Remover duplicados de uma lista de e-mails mantendo a ordem original de cadastro.
        removerEmailsDuplicadosMantendoOrdem(Arrays.asList("ana@mail.com", "bruno@mail.com", "ana@mail.com", "carlos@mail.com"));

        // ==================== SET ====================
        // 3) Guardar os números de sorteio de uma rifa, sem duplicados e sem se importar com a ordem.
        cadastrarNumerosDaRifa();

        // 4) Guardar um ranking de notas únicas de uma prova, sempre exibido do menor para o maior valor.
        cadastrarNotasUnicasOrdenadas();

        // ==================== MAP ====================
        // 5) Cadastrar um estoque (produto -> quantidade) permitindo buscar rapidamente a quantidade pelo nome do produto.
        cadastrarEstoqueDeProdutos();

        // 6) Cadastrar um catálogo de contatos (nome -> telefone) exibido sempre em ordem alfabética pelo nome.
        cadastrarContatosOrdenadosPorNome();
    }

    private static void cadastrarFilaDeAtendimento() {
        // TODO: Escolha a implementação de List adequada para uma fila onde a ordem de chegada é essencial
        //  e nomes repetidos podem existir (ex: "João" pode chegar duas vezes).
        //  Cadastre pelo menos 4 nomes e imprima a fila na ordem de chegada.
        // Exemplo Saída: "Fila de atendimento: [João, Maria, João, Ana]"
    }

    private static void removerEmailsDuplicadosMantendoOrdem(List<String> emails) {
        // TODO: A lista recebida pode ter e-mails duplicados. Utilize uma combinação de List e outra Collection
        //  para remover os duplicados, mas mantendo a ordem original em que cada e-mail apareceu pela primeira vez.
        //  Pense: qual Collection remove duplicados automaticamente e ao mesmo tempo preserva a ordem de inserção?
        // Exemplo Saída: "E-mails únicos (ordem de cadastro): [ana@mail.com, bruno@mail.com, carlos@mail.com]"
    }

    private static void cadastrarNumerosDaRifa() {
        // TODO: Escolha a implementação de Set adequada para armazenar números de rifa (inteiros) sem duplicados,
        //  onde a ordem de exibição não importa. Tente adicionar um número repetido e mostre que ele não é duplicado.
        //  Cadastre pelo menos 5 números e imprima o conjunto final.
        // Exemplo Saída: "Números da rifa: [7, 15, 23, 42, 8]"
    }

    private static void cadastrarNotasUnicasOrdenadas() {
        // TODO: Escolha a implementação de Set adequada para armazenar notas (double) sem duplicados,
        //  garantindo que ao imprimir, os valores já apareçam ordenados do menor para o maior automaticamente.
        //  Cadastre pelo menos 5 notas, incluindo uma repetida, e imprima o resultado.
        // Exemplo Saída: "Notas únicas ordenadas: [5.0, 6.5, 7.0, 9.0, 10.0]"
    }

    private static void cadastrarEstoqueDeProdutos() {
        // TODO: Escolha a implementação de Map adequada para representar um estoque (produto -> quantidade)
        //  onde a prioridade é a velocidade de busca pela chave, sem se preocupar com ordem de inserção ou ordenação.
        //  Cadastre pelo menos 4 produtos com suas quantidades e imprima cada par produto/quantidade.
        // Exemplo Saída: "Produto: notebook - Quantidade: 12"
    }

    private static void cadastrarContatosOrdenadosPorNome() {
        // TODO: Escolha a implementação de Map adequada para um catálogo de contatos (nome -> telefone)
        //  que precisa ser exibido sempre em ordem alfabética pelo nome (chave), mesmo sem controlar a ordem de inserção.
        //  Cadastre pelo menos 4 contatos e imprima o catálogo já ordenado por nome.
        // Exemplo Saída: "Contato: Ana - Telefone: 99999-0001"
    }
}
