package quiz;

public class Respostas extends Jogador{
    private boolean verdadeiroFalso;


    public void exibeRespostaCorreta(){
        if (verdadeiroFalso == false){
            System.out.println("CORRETO!!! \nParabens! Você ganhou um ponto!");
            System.out.println("Sua pontuação atual: " + getPontos()); 
        }

    }

    public void exibeRespostaErrada(){
        if (verdadeiroFalso == false){
            System.out.println("ERRADO.");
        }
    }
}

