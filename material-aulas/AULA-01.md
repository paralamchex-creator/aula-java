# Aula 1 — Minecraft: Primeira noite

**Duracao:** 60 minutos  
**Objetivo:** construir em `Minecraft.java` um menu de terminal que minera recursos, respeita pre-requisitos e mostra o inventario. Esta aula usa somente variaveis locais; `Jogador.java` ainda nao e usado.

## Roteiro

| Tempo | Etapa |
|---|---|
| 0–10 min | Desafio 1: perguntar o nome, ler com `Scanner`, criar o inventario e dar boas-vindas |
| 10–25 min | Desafio 2: apresentar o menu, ler uma opcao e repeti-lo ate escolher sair |
| 25–45 min | Desafio 3: implementar as tres mineracoes e a exibicao do inventario |
| 45–60 min | Desafio 4: bloquear pedra e ferro ate que os pre-requisitos sejam atendidos |

## Desafio 1 — Criar o jogador (10 min)

Complete o TODO inicial de `Minecraft.java`:

1. Leia o nome digitado pelo jogador usando o `Scanner`.
2. Guarde o texto em `nome`.
3. Mantenha madeira, pedra e ferro como inteiros iniciados em zero.
4. Mostre uma saudacao que inclua o nome.

**Dica 1:** `Scanner` tem um metodo para ler uma linha de texto.  
**Dica 2:** guarde o resultado desse metodo na variavel `nome`.  
**Dica 3:** junte uma mensagem e o nome com `+`.

## Desafio 2 — Menu interativo (15 min)

Mostre este menu e pergunte uma opcao:

```text
===== MINECRAFT JAVA =====
1 - Minerar madeira
2 - Minerar pedra
3 - Minerar ferro
4 - Ver inventario
5 - Sair
Escolha uma opcao:
```

O menu deve aparecer novamente depois de cada acao, exceto quando a pessoa escolher sair. Trate opcoes desconhecidas com uma mensagem clara.

**Dica 1:** crie uma variavel inteira para a opcao.  
**Dica 2:** um `while` pode continuar enquanto a opcao nao for 5.  
**Dica 3:** dentro do loop, use `if/else` ou `switch` para decidir a acao.

## Desafio 3 — Mineracao e inventario (20 min)

Implemente as acoes do menu:

- Madeira: adicione 3 unidades.
- Pedra: adicione 2 unidades.
- Ferro: adicione 1 unidade.
- Inventario: exiba madeira, pedra e ferro com seus valores atuais.

**Dica 1:** cada variavel guarda a quantidade acumulada.  
**Dica 2:** para minerar, some a quantidade encontrada a quantidade atual.  
**Dica 3:** mantenha a exibicao do inventario em uma unica opcao do menu.

## Desafio 4 — Pre-requisitos (15 min)

- Para minerar pedra, o jogador precisa ter pelo menos 3 madeiras.
- Para minerar ferro, precisa ter pelo menos 4 pedras.
- Esses materiais sao requisitos: nao devem ser descontados.
- Se faltar algum requisito, explique ao jogador o que precisa fazer.

**Dica 1:** verifique o requisito antes de adicionar o novo recurso.  
**Dica 2:** use comparacao de maior ou igual.  
**Dica 3:** a mensagem de bloqueio pertence ao caso em que a condicao nao foi atendida.

## Exemplo de execucao

```text
Qual e o seu nome, jogador? Cauã
Bem-vindo ao Minecraft Java, Cauã!
===== MINECRAFT JAVA =====
1 - Minerar madeira
2 - Minerar pedra
3 - Minerar ferro
4 - Ver inventario
5 - Sair
Escolha uma opcao: 2
Voce precisa de pelo menos 3 madeiras para minerar pedra.
Escolha uma opcao: 1
Voce minerou 3 madeiras.
Escolha uma opcao: 2
Voce minerou 2 pedras.
Escolha uma opcao: 4
Inventario: madeira = 3, pedra = 2, ferro = 0
```

As mensagens exatas podem ser diferentes; confirme que as quantidades e bloqueios estao corretos.

## Checklist de conclusao

- [ ] O programa pergunta e usa o nome.
- [ ] O menu continua aparecendo ate escolher sair.
- [ ] Madeira, pedra e ferro sao acumulados corretamente.
- [ ] O inventario mostra os valores atuais.
- [ ] Pedra exige 3 madeiras e ferro exige 4 pedras.
- [ ] Requisitos nao sao consumidos.
- [ ] Opcoes fora do menu recebem uma resposta compreensivel.
- [ ] O programa compila e roda sem depender de `Jogador.java`.
