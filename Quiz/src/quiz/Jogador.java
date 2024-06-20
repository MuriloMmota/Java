package quiz;

public class Jogador {
     private String nome;
    private int pontos; 

    public int getPontos() {
        int i = 1;
        return pontos + i;
        
    }

        public void incrementarPontos() {
        pontos++;
            
    }
    
    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    //setando nome jogador no principal
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    //gerar pontuação do jogador

    //printando o inicio do jogo
    @Override
    public String toString() {
        return "Boa " + nome + "!\nVamos começar! \n" + "Sua pontuação atual é: " + (pontos ); 

}
}
