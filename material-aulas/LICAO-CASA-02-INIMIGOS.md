# Licao de casa 2 — Inimigos, interface e vida

**Objetivo:** acrescentar uma batalha simples por turnos. Tres inimigos diferentes seguem o mesmo contrato de interface, e o mesmo codigo de batalha funciona para todos.

Esta licao vem depois da atividade de `Map`. Preserve as mineracoes, o inventario, a espada e o menu existente. Use Java basico; nao adicione explosoes, flechas, distancias, classes abstratas ou sistemas novos de equipamento.

## O contrato dos inimigos

Crie `Inimigo.java` no pacote `desafio`:

```java
public interface Inimigo {
    String getNome();
    int getVida();
    int atacar();
    void receberDano(int dano);
}
```

Crie `Zumbi`, `Esqueleto` e `Creeper`, cada um implementando `Inimigo`. Cada classe tera uma vida privada e dano fixo:

| Classe | Vida inicial | Dano por ataque |
|---|---:|---:|
| `Zumbi` | 20 | 3 |
| `Esqueleto` | 15 | 4 |
| `Creeper` | 12 | 5 |

`atacar()` devolve o dano fixo. `receberDano(int dano)` diminui a vida, mas nunca deixa o resultado abaixo de zero.

## Etapas

### 1. Complete os inimigos

Implemente as quatro operacoes definidas pela interface em cada classe. O nome identifica o inimigo, a vida deve refletir o dano recebido e o ataque deve devolver o valor indicado na tabela.

**Dica 1:** todas as classes devem usar os mesmos nomes e tipos de metodos da interface.  
**Dica 2:** receber dano altera a vida; consultar a vida nao deve altera-la.  
**Dica 3:** teste mentalmente o caso em que o dano e maior do que a vida restante.

### 2. Acrescente vida ao jogador

Em `Jogador`, mantenha `vidaMaxima = 20` e `vidaAtual = 20`. Complete:

- `receberDano(int dano)`: diminuir a vida sem ficar abaixo de zero.
- `estaVivo()`: retornar se a vida atual e maior que zero.
- `dormir()`: restaurar a vida ate o maximo, sem ultrapassa-lo.

O sono so acontece pelo menu, fora da rotina de batalha. Como a batalha e executada ate acabar antes do menu aparecer novamente, o jogador nao pode interrompe-la para dormir.

### 3. Sorteie um inimigo

Na classe `Minecraft`, crie um metodo auxiliar `sortearInimigo()` que devolve o tipo `Inimigo`. Use `Random` e `nextInt(3)` para selecionar um `new Zumbi()`, `new Esqueleto()` ou `new Creeper()`.

**Dica 1:** o resultado do sorteio pode ser 0, 1 ou 2.  
**Dica 2:** cada opcao retorna uma classe concreta, mas todas podem ser usadas como `Inimigo`.  
**Dica 3:** uma escolha final pode servir como caso restante depois das outras duas.

### 4. Integre combate ao menu

Preserve as opcoes anteriores e acrescente:

```text
6 - Dormir
7 - Batalhar
8 - Sair
```

Ao batalhar:

1. Sorteie e anuncie o inimigo.
2. Mostre a vida do jogador e a do inimigo.
3. O jogador ataca primeiro: causa 5 de dano se possui espada, ou 2 sem espada.
4. Se o inimigo ainda tiver vida, ele ataca e o jogador recebe o dano.
5. Repita enquanto ambos estiverem vivos.
6. Se vencer, mostre a vitoria e volte ao menu. Se a vida do jogador chegar a zero, mostre a derrota e encerre a partida.

Use uma variavel `Inimigo` para a batalha: nao crie uma rotina diferente para cada classe.

## Exemplo de combate

```text
7 - Batalhar
Escolha uma opcao: 7
Um Esqueleto apareceu!
Sua vida: 20/20 | Vida do Esqueleto: 15
Voce causou 5 de dano!
Esqueleto causou 4 de dano!
Sua vida: 16/20 | Vida do Esqueleto: 10
...
Voce venceu!
```

Os valores e a quantidade de turnos mudam conforme o inimigo sorteado e o jogador tenha ou nao espada.

## Dicas progressivas

1. Uma interface descreve metodos que cada classe concreta deve oferecer.
2. O valor de vida apos receber dano nao pode ser menor que zero. Pense em `if/else` antes de atualizar o campo.
3. Para escolher uma classe aleatoriamente, gere um numero de 0 ate 2 e use `switch`.
4. A batalha termina quando o inimigo cai **ou** o jogador cai. Qual operador expressa que ela continua somente enquanto ambos estiverem vivos?
5. O inimigo so contra-ataca se ainda estiver vivo depois do ataque do jogador.
6. A derrota precisa impedir que o loop principal apresente o menu novamente.

## Checklist

- [ ] As tres classes implementam `Inimigo`.
- [ ] A vida de inimigos e jogador nunca fica negativa.
- [ ] Cada ataque tem o dano indicado.
- [ ] O inimigo e escolhido entre as tres classes.
- [ ] Uma unica rotina de batalha trabalha com o tipo `Inimigo`.
- [ ] O jogador ataca primeiro e o inimigo so contra-ataca se sobreviver.
- [ ] Dormir recupera a vida sem ultrapassar o maximo e ocorre fora do combate.
- [ ] Sem espada, o dano e 2; com espada, e 5.
- [ ] A vitoria retorna ao menu e a derrota encerra o jogo.
- [ ] Mineracao, inventario e fabricacao continuam funcionando.
