package desafio;

import java.util.Scanner;

public class Minecraft {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual e o seu nome, jogador? ");
        // TODO: leia o nome digitado usando o Scanner.
        String nome = scanner.nextLine();

        // TODO: crie variaveis inteiras para os materiais, comecando em zero.
        int madeira = 0;
        int pedra = 0;
        int ferro = 0;
        int opcao = 0;

        // TODO: mostre uma mensagem de boas-vindas usando a variavel nome.
        System.out.println("bem vindo ao Minecraft java, " + nome);

        // TODO: implemente aqui o menu e as regras das aulas anteriores.
        // Nas licoes de casa, preserve as opcoes existentes e acrescente dormir,
        // batalha, sorteio de inimigo e a opcao de sair no final do menu.

        while (5 != opcao) {
            System.out.println("===== MINECRAFT JAVA =====");
            System.out.println("1 - Minerar madeira");
            System.out.println("2 - Minerar pedra");
            System.out.println("3 - Minerar ferro");
            System.out.println("4 - Ver inventario");
            System.out.println("5 - Sair");
            System.out.println("Escolha uma opcao:");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1 :
                    madeira += 3;
                    System.out.println("vc minerou 3 madeiras" );
                    break;
                case 2 :
                    if (madeira < 3) {
                        System.out.println("erro. colete 3 madeiras");
                    }   else {
                        pedra += 2;
                        System.out.println("vc minerou 2 pedras");
                    }
                    break;
                case 3 :
                    if (pedra < 2) {
                        System.out.println("erro. colete 2 pedras");
                    }   else {
                        ferro += 1;
                        System.out.println("vc minerou 1 ferro");
                    }
                    break;
                case 4 :
                    System.out.println("inventario aberto: \n madeira = " + madeira + "\npedra: " + pedra + "\nferro: " + ferro);
                    break;
                case 5 :
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
