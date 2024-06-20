package quiz;

import java.util.Scanner;

public class Quiz {

    public static void main(String[] args) {
        // INSTANCIEI TODAS CLASSES NECESSÁRIAS
        Jogador jogador = new Jogador();
        Esporte esporte = new Esporte();
        Anhembi anhembi = new Anhembi();
        Java java = new Java();

        // SETEI O NOME
        jogador.setNome("bia");
        System.out.println(jogador.toString());

        Scanner tc = new Scanner(System.in);
        boolean continuarJogando;

        do {
            // INICIEI O JOGO
            System.out.println("Selecione o tema do quiz! ");
            System.out.println();
            System.out.println("[1] ESPORTE \n[2] ANHEMBI \n[3] JAVA");
            System.out.println();

            // FIZ USUARIO ESCOLHER TEMA
            int r = 0;
            boolean entradaValida = false;

            while (entradaValida == false) {
                System.out.print("Para selecionar basta digitar o número que corresponde ao tema: ");
                String teclado = tc.nextLine();

                try {
                    r = Integer.parseInt(teclado);
                    if (r >= 1 && r <= 3) {
                        entradaValida = true;
                    } else {
                        System.out.println("Por favor, digite um número entre 1 e 3.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Por favor, digite um número válido.");
                }
            }

            switch (r) {
                case 1:
                    esporte.perguntaEsporte();
                    esporte.exibePrimeiraPerguntaEsporte();
                    esporte.exibeSegundaPerguntaEsporte();
                    esporte.exibeTerceiraPerguntaEsporte();
                    break;
                case 2:
                    anhembi.perguntaAnhembi();
                    anhembi.exibePrimeiraPerguntaAnhembi();
                    anhembi.exibeSegundaPerguntaAnhembi();
                    anhembi.exibeTerceiraPerguntaAnhembi();
                    break;
                case 3:
                    java.perguntaJava();
                    java.exibePrimeiraPerguntaJava();
                    java.exibeSegundaPerguntaJava();
                    java.exibeTerceiraPerguntaJava();
                    break;
                default:
                    System.out.println("Tema inválido!");
                    break;
            }
            continuarJogando = false;
            entradaValida = false;

            while (!entradaValida) {
                System.out.println("Parabéns, chegamos ao fim do Quiz! Deseja jogar novamente?");
                System.out.println("[1] Sim");
                System.out.println("[2] Não");
                String resposta = tc.nextLine();
                try {
                    int j = Integer.parseInt(resposta);
                    if (j == 1) {
                        continuarJogando = true;
                        entradaValida = true;
                    } else if (j == 2) {
                        continuarJogando = false;
                        entradaValida = true;
                    } else {
                        System.out.println("Por favor, digite um número entre 1 e 2.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Por favor, digite um número válido.");
                }
            }
        } while (continuarJogando);
        System.out.println("Obrigado por jogar!");
    }
}



