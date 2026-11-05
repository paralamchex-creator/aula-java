# Aula 2 — Jogador e fabricacao de espada

**Duracao:** 60 minutos  
**Objetivo:** refatorar o jogo da Aula 1 para que os dados e comportamentos do jogador fiquem reunidos em um objeto `Jogador`, depois implementar a fabricacao da espada.

## Roteiro

| Tempo | Etapa |
|---|---|
| 0–15 min | Desafio 5: compreender e completar a classe `Jogador` |
| 15–30 min | Desafio 6: implementar os metodos de mineracao e inventario |
| 30–50 min | Desafio 7: adicionar a receita da espada e ajustar o menu |
| 50–60 min | Desafio 8: executar os testes manuais e corrigir problemas |

## Uma ideia simples sobre orientacao a objetos

Uma classe e como uma descricao do que um jogador tem e sabe fazer. Um objeto e um jogador concreto criado a partir dessa descricao. Os atributos guardam o estado (nome, recursos e espada); os metodos representam acoes que podem mudar ou mostrar esse estado.

Na `main`, mantenha o que coordena a execucao: criar o `Scanner`, mostrar e ler o menu e chamar a acao escolhida. O inventario e as regras que alteram o inventario pertencem ao objeto `Jogador`.

## Evolua o trabalho da Aula 1, sem descarta-lo

1. Mantenha o menu e a leitura da opcao que ja funcionam.
2. Antes de alterar a logica, execute a versao da Aula 1 e confirme que ela compila.
3. Crie ou complete `Jogador.java`. Ao migrar uma operacao, passe a chamar o metodo do jogador em vez de alterar a variavel local correspondente.
4. Troque as variaveis locais de inventario por um objeto criado com `new Jogador(nome)`.
5. Execute e confira cada opcao depois de cada pequena mudanca. Nao apague nem reescreva o menu inteiro.

Se quiser preservar um ponto de retorno, use o historico local do IntelliJ ou salve uma copia de seguranca fora do pacote de codigo antes de comecar a refatoracao.

## Desafio 5 — Classe Jogador (15 min)

Complete a classe `desafio.Jogador`. Ela ja tem os atributos e as assinaturas para orientar o trabalho:

```text
nome: String
madeira: int
pedra: int
ferro: int
possuiEspada: boolean
```

No construtor, guarde o nome recebido. Os recursos devem comecar em zero e o jogador deve iniciar sem espada. Pense: quais dados pertencem a cada jogador, e quais instrucoes continuam sendo responsabilidade da `main`?

**Dica 1:** use `this` para diferenciar o atributo do parametro quando os nomes forem iguais.  
**Dica 2:** `int` começa em zero e `boolean` começa em `false`, mas escreva a inicializacao explicitamente para deixar a intencao visivel.

## Desafio 6 — Metodos do jogador (15 min)

Complete os metodos ja declarados em `Jogador.java`:

- `minerarMadeira`: acrescenta 3 madeiras.
- `minerarPedra`: verifica 3 madeiras e acrescenta 2 pedras ou informa o requisito.
- `minerarFerro`: verifica 4 pedras e acrescenta 1 ferro ou informa o requisito.
- `mostrarInventario`: exibe o nome e as quantidades.

Na `Minecraft`, crie um objeto `Jogador` e encaminhe a ele as opcoes do menu. Preserve o menu e a leitura que ja construiu.

**Dica 1:** metodos da mesma classe podem usar seus atributos diretamente.  
**Dica 2:** minerar pedra e ferro precisa testar a condicao antes de alterar o atributo.  
**Dica 3:** quem deve saber quantos recursos possui e o proprio objeto `Jogador`.

## Desafio 7 — Fabricar espada (20 min)

Atualize o menu para incluir `5 - Fabricar espada` e mover `Sair` para a opcao 6. Implemente `fabricarEspada()`:

- Receita: 2 ferros e 1 madeira.
- Se faltar um ou ambos os materiais, informe claramente o que falta.
- Ao fabricar, desconte os materiais, marque que possui espada e mostre uma mensagem de vitoria.
- Nao permita fabricar uma segunda espada.

**Dica 1:** primeiro verifique se a espada ja foi fabricada.  
**Dica 2:** verifique madeira e ferro sem descontar nada durante a verificacao.  
**Dica 3:** so depois de confirmar que todos os materiais existem, faca os descontos e atualize o booleano.

## Desafio 8 — Revisao e depuracao (10 min)

Rode o jogo e confira cada situacao:

- [ ] Opcao valida e opcao invalida.
- [ ] Mineracao de pedra bloqueada e liberada.
- [ ] Mineracao de ferro bloqueada e liberada.
- [ ] Inventario atualizado depois de cada acao.
- [ ] Tentativa de fabricar sem recursos suficientes, incluindo falta de cada material.
- [ ] Fabricacao bem-sucedida com os materiais descontados.
- [ ] Tentativa de fabricar uma segunda espada.
- [ ] Saida do menu pela opcao 6.
