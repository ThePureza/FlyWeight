package java;

public class Arma {
    private String nome;
    private Integer dano;

    public Arma(String nome, Integer dano) {
        this.nome = nome;
        this.dano = dano;
    }

    public String getNome() {
        return this.nome;
    }

    public Integer getDano() {
        return this.dano;
    }
}
