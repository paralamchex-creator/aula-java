package desafio;

import desafio.personagens.Jogador;

import java.util.Scanner;

public class Minecraft {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual e o seu nome, jogador? ");
        // TODO: leia o nome digitado usando o Scanner.
        String nome = scanner.nextLine();

        Jogador jogador = new Jogador(nome);
        // TODO: crie variaveis inteiras para os materiais, comecando em zero.
        int opcao = 0;

        // TODO: mostre uma mensagem de boas-vindas usando a variavel nome.
        System.out.println("bem vindo ao Minecraft java, " + nome);

        // TODO: implemente aqui o menu e as regras das aulas anteriores.
        // Nas licoes de casa, preserve as opcoes existentes e acrescente dormir,
        // batalha, sorteio de inimigo e a opcao de sair no final do menu.

        while (6 != opcao) {
            System.out.println("===== MINECRAFT JAVA =====");
            System.out.println("1 - Minerar madeira");
            System.out.println("2 - Minerar pedra");
            System.out.println("3 - Minerar ferro");
            System.out.println("4 - Ver inventario");
            System.out.println("5 - Fabricar espada");
            System.out.println("6 - Sair");
            System.out.println("Escolha uma opcao:");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1 :
                    jogador.minerarMadeira();
                    break;
                case 2 :
                    jogador.minerarPedra();
                    break;
                case 3 :
                    jogador.minerarFerro();
                    break;
                case 4 :
                    jogador.mostrarInventario();
                    break;
                case 5 :
                    jogador.fabricarEspada();
                    break;
                case 6 :
                    System.out.println("ate a proxima " + nome);
                    break;

                default :
                    System.out.println("opcao nao encontrada");
                    break;

            };


        }


          // pedra = 3 madeiras
        // ferro = 4 pedras

        scanner.close();


    }
}
