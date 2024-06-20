package quiz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Java extends Respostas {
    private List<String> perguntas;

    public void perguntaJava(){
        //CRIADA LISTA DE PERGUNTAS DE ESPORTE
        this.perguntas = new ArrayList<>();
        perguntas.add("Quando a linguaguem Java foi criada? ");
        perguntas.add("Quem criou o Java? ");
        perguntas.add("No ranking de linguagens de programação mais utilizadas, em que lugar o Java está? ");
    }

    public void exibePrimeiraPerguntaJava(){
        System.out.println(perguntas.get(0)); //printar lista
        System.out.println("[1] 1950");
        System.out.println("[2] 1995");
        System.out.println("[3] 1960");
        System.out.println("[4] 1965");
        System.out.println("[5] 1970");
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
     else if (r == 1 || r == 3 || r == 4 || r == 5){
            exibeRespostaErrada();
    }
    
}
    public void exibeSegundaPerguntaJava(){
        System.out.println(perguntas.get(1));
        System.out.println("[1] Tim Berners-Lee");
        System.out.println("[2] James Gosling");
        System.out.println("[3] Jon Skeet");
        System.out.println("[4] Linus Java");
        System.out.println("[5] Anders Hejlsberg");
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
     else if (r == 1 || r == 3 || r == 4 || r == 5){
            exibeRespostaErrada();
    }
}
    public void exibeTerceiraPerguntaJava(){
        System.out.println(perguntas.get(2));
        System.out.println("[1] Primeiro");
        System.out.println("[2] Segundo");
        System.out.println("[3] Terceiro");
        System.out.println("[4] Quarto");
        System.out.println("[5] Quinto");
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
     else if (r == 1 || r == 3 || r == 4 || r == 5){
            exibeRespostaErrada();
    }
}
}