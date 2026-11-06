# Licao de casa 1 — Um inventario com `Map`

**Objetivo:** substituir as quantidades separadas de madeira, pedra e ferro por um `Map<String, Integer>`, sem mudar as regras que ja funcionam no jogo.

Esta atividade e posterior as duas aulas. Nao apague o trabalho da Aula 2. Antes de comecar, execute o jogo e confirme que mineracao, inventario e espada estao funcionando. Durante a refatoracao, altere uma parte por vez e rode novamente.

## O que voce vai aprender

- Um `Map` relaciona uma chave a um valor.
- Neste inventario, o nome do material e a chave (`String`) e a quantidade e o valor (`Integer`).
- `put` guarda ou atualiza uma entrada; usar novamente a mesma chave atualiza aquela entrada.
- `getOrDefault` consulta uma chave e fornece zero caso ela ainda nao esteja no mapa.
- `entrySet()` permite percorrer as entradas com `for-each`.

Uma lista guarda itens em uma sequencia. Um mapa e mais apropriado aqui porque queremos encontrar a quantidade diretamente pelo nome do recurso.

## Etapas

### 1. Prepare o mapa

Em `Jogador.java`, importe `Map` e `HashMap` e declare o campo:

```java
private Map<String, Integer> inventario = new HashMap<>();
```

No construtor, guarde o nome e registre madeira, pedra e ferro com quantidade zero usando `put`.

### 2. Crie operacoes reutilizaveis

Complete estas assinaturas ja preparadas em `Jogador.java`:

```java
public void adicionarRecurso(String recurso, int quantidade) {
    // TODO: consultar o valor atual com getOrDefault, somar e atualizar com put.
}

public boolean possuiRecursos(String recurso, int quantidade) {
    // TODO: verificar se a quantidade atual e suficiente.
    return false; // temporario: substitua ao completar o metodo.
}

public boolean consumirRecurso(String recurso, int quantidade) {
    // TODO: so descontar se houver recursos suficientes e retornar o resultado.
    return false; // temporario: substitua ao completar o metodo.
}
```

Nao consuma materiais quando a quantidade disponivel for menor que a pedida. Se a operacao nao puder ser realizada, o inventario deve continuar igual.

### 3. Mude as mineracoes uma de cada vez

Atualize madeira, depois pedra e depois ferro para usarem as operacoes do mapa. Preserve as regras:

- Madeira adiciona 3.
- Pedra precisa de 3 madeiras e adiciona 2 pedras. O requisito nao e consumido.
- Ferro precisa de 4 pedras e adiciona 1 ferro. O requisito nao e consumido.

Depois de cada mudanca, execute o menu e confira o inventario.

### 4. Atualize espada e exibicao

A receita continua sendo 2 ferros e 1 madeira. Use o mapa para conferir os materiais e para consumi-los somente quando ambos estiverem disponiveis. Preserve a protecao contra fabricar uma segunda espada.

Em `mostrarInventario()`, percorra `inventario.entrySet()` usando `for-each` e mostre cada nome e quantidade. So depois de todas as operacoes funcionarem, remova os campos antigos `madeira`, `pedra` e `ferro`.

## Dicas progressivas

1. Para consultar uma chave que pode ainda nao existir, qual metodo permite informar um valor padrao?
2. O que deve acontecer com o valor anterior quando voce adiciona mais unidades do mesmo recurso?
3. Antes de descontar, compare a quantidade disponivel com a solicitada.
4. No `for-each`, cada elemento de `entrySet()` representa uma chave e seu valor. Os metodos da entrada permitem consultar ambos.
5. Ao fabricar, confira primeiro os dois ingredientes; so depois faca qualquer desconto.

## Exemplo de comportamento esperado

```text
Inventario de Cauã:
madeira = 3
pedra = 2
ferro = 0

Voce precisa de pelo menos 4 pedras para minerar ferro.
```

A ordem de exibicao pode variar, pois o mapa nao promete a ordem das entradas. O importante e mostrar cada recurso com a quantidade correta.

## Checklist

- [ ] Os tres recursos iniciam com quantidade zero no mapa.
- [ ] Adicionar o mesmo recurso atualiza a quantidade, sem duplicar a chave.
- [ ] Recursos insuficientes nunca sao consumidos.
- [ ] Mineracao e espada continuam obedecendo as regras anteriores.
- [ ] O inventario percorre as entradas do mapa.
- [ ] Os campos individuais de quantidade foram removidos ao final.
- [ ] O projeto compila e o menu continua funcionando.
