package quiz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Anhembi extends Respostas {
    private List<String> perguntas;

    public void perguntaAnhembi(){
        //CRIADA LISTA DE PERGUNTAS DA ANHEMBI
        this.perguntas = new ArrayList<>();
        perguntas.add("Quantas unidades a Anhembi Morumbi tem? ");
        perguntas.add("Em que ano a Anhembi Morumbi foi fundada? ");
        perguntas.add("Qual a nota da Anhembi Morumbi no MEC? ");
    }

    public void exibePrimeiraPerguntaAnhembi(){
        System.out.println(perguntas.get(0)); //PRINTAR LISTA
        System.out.println("[1] 1");
        System.out.println("[2] 2");
        System.out.println("[3] 3");
        System.out.println("[4] 4");
        System.out.println("[5] 5");
        System.out.println();
    Scanner tc = new Scanner(System.in);
    int r = 0;
    boolean entradaValida = false;

    while(entradaValida == false) {
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

    if (r == 5) {
        exibeRespostaCorreta();
        incrementarPontos();
    } 
    else if (r == 1 || r == 2 || r == 3 || r == 4){
            exibeRespostaErrada();
    }
}

    public void exibeSegundaPerguntaAnhembi(){
        System.out.println(perguntas.get(1));
        System.out.println("[1] 1970");
        System.out.println("[2] 1999");
        System.out.println("[3] 1985");
        System.out.println("[4] 2000");
        System.out.println("[5] 1990");
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

    if (r == 1) {
        exibeRespostaCorreta();
        incrementarPontos();
    } 
    else if (r == 2 || r == 3 || r == 4 || r == 5){
            exibeRespostaErrada();
    }
}

    public void exibeTerceiraPerguntaAnhembi(){
        System.out.println(perguntas.get(2));
        System.out.println("[1] 1");
        System.out.println("[2] 2");
        System.out.println("[3] 3");
        System.out.println("[4] 4");
        System.out.println("[5] 5");
        System.out.println();
    Scanner tc = new Scanner(System.in);
    int r = 0;
    boolean entradaValida = false;

    while(entradaValida == false) {
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
}