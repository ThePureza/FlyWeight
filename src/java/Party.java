package java;

import java.util.ArrayList;
import java.util.List;

public class Party {

    private List<Personagem> party = new ArrayList<>();

    public void novoMenbro(String nomePersonagem, String nomeArma, Integer danoArma) {
        Arma arma = ArmaFactory.getArma(nomeArma, danoArma);
        Personagem personagem = new Personagem(nomePersonagem, arma);
        party.add(personagem);
    }

    public List<String> obterIntegrantesParty() {
        List<String> saida = new ArrayList<String>();
        for (Personagem personagem : this.party) {
            saida.add(personagem.obterPersonagem());
        }
        return saida;
    }
}
