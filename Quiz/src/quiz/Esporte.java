package quiz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Esporte extends Respostas {
    private List<String> perguntas;

    public void perguntaEsporte(){
        //CRIADA LISTA DE PERGUNTAS DE ESPORTE
        this.perguntas = new ArrayList<>();
        perguntas.add("Qual é a seleção que mais ganhou copas? ");
        perguntas.add("Quem é considerado o atleta mais vitorioso das oliempíadas? ");
        perguntas.add("Qual foi a maior velocidade que Usain Bolt atingiu? ");
    }


    public void exibePrimeiraPerguntaEsporte(){
        System.out.println(perguntas.get(0)); //printar a lista
        System.out.println("[1] Argentina");
        System.out.println("[2] Alemanha");
        System.out.println("[3] Italia");
        System.out.println("[4] Brasil");
        System.out.println("[5] França");
        System.out.println();
    Scanner tc = new Scanner(System.in);
    int r = 0;
    boolean entradaValida = false;

    while (entradaValida == false) {
        System.out.print("Digite sua resposta: ");
        String teclado = tc.nextLine();

        try {
                r = Integer.parseInt(teclado);
            if (r >= 1 && r <= 5) {
                entradaValida = true;
            } else {
                System.out.println("Por favor, digite um número entre 1 e 5.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Por favor, digite um número válido.");
        }
    }

    if (r == 4) {
        exibeRespostaCorreta();
        incrementarPontos();
    }
     else if (r == 1 || r == 2 || r == 3 || r == 5){
            exibeRespostaErrada();
    }
}


    public void exibeSegundaPerguntaEsporte(){
        System.out.println();
        System.out.println(perguntas.get(1));
        System.out.println("[1] Usain Bolt");
        System.out.println("[2] Michael Phelps");
        System.out.println("[3] Serena Williams");
        System.out.println("[4] Cesar Cielo");
        System.out.println("[5] Larissa Latynina");
        System.out.println();
            Scanner tc = new Scanner(System.in);
    int r = 0;
    boolean entradaValida = false;

    while (entradaValida == false) {
        System.out.print("Digite sua resposta: ");
        String teclado = tc.nextLine();

        try {
            r = Integer.parseInt(teclado);
            if (r >= 1 && r <= 5) {
                entradaValida = true;
            } else {
                System.out.println("Por favor, digite um número entre 1 e 5.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Por favor, digite um número válido.");
        }
    }

    if (r == 2) {
        exibeRespostaCorreta();
        incrementarPontos();
    } 
     else if (r == 1 || r == 3|| r == 4 || r == 5){
            exibeRespostaErrada();
    }
}


    public void exibeTerceiraPerguntaEsporte(){
        System.out.println();
        System.out.println(perguntas.get(2));
        System.out.println("[1] 44,5km/h");
        System.out.println("[2] 44,6km/h");
        System.out.println("[3] 44,7km/h");
        System.out.println("[4] 44,8km/h");
        System.out.println("[5] 44,9km/h");
        System.out.println();
    Scanner tc = new Scanner(System.in);
    int r = 0;
    boolean entradaValida = false;

    while (entradaValida == false) {
        System.out.print("Digite sua resposta: ");
        String teclado = tc.nextLine();

        try {
            r = Integer.parseInt(teclado);
            if (r >= 1 && r <= 5) {
                entradaValida = true;
            } else {
                System.out.println("Por favor, digite um número entre 1 e 5.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Por favor, digite um número válido.");
        }
    }

    if (r == 3) {
        exibeRespostaCorreta();
        incrementarPontos();
    } 
     else if (r == 1 || r == 2 || r == 4 || r == 5){
            exibeRespostaErrada();
    }
}
}