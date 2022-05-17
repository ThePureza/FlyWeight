package java;

public class Personagem {

    private String nome;
    private Arma arma;

    public Personagem(String nome, Arma Arma) {
        this.nome = nome;
        this.arma = arma;
    }

    public String obterPersonagem() {
        return "Personagem{" +
                "nome='" + this.nome + '\'' +
                ", arma='" + arma.getNome() + '\'' +
                ", dano da arma='" + arma.getDano() + '\'' +
                '}';
    }
}
