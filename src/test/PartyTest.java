package test;

import org.junit.jupiter.api.Test;

import java.Party;
import java.Arma;
import java.ArmaFactory;
import java.Personagem;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class PartyTest {

    @Test
    void deveRetornarIntegrantesParty() {
        Party party = new Party();
        party.novoMenbro("Akaza", "Espada", 4);
        party.novoMenbro("Dante", "Espada", 4);
        party.novoMenbro("Urzha", "Porrete", 3);
        party.novoMenbro("Fidel", "Porrete", 3);

        List<String> saida = Arrays.asList(
                "Personagem{nome='Akaza', arma='Espada', dano da arma='4'}",
                "Personagem{nome='Dante', arma='Espada', dano da arma='4'}",
                "Personagem{nome='Urzha', arma='Porrete', dano da arma='3'}",
                "Personagem{nome='Fidel', arma='Porrete', dano da arma='3'}");

        assertEquals(saida, party.obterIntegrantesParty());
    }

    @Test
    void deveRetornarTotalArmas() {
        Party party = new Party();
        party.novoMenbro("Akaza", "Espada", 4);
        party.novoMenbro("Dante", "Espada", 4);
        party.novoMenbro("Urzha", "Porrete", 3);
        party.novoMenbro("Fidel", "Porrete", 3);

        assertEquals(2, ArmaFactory.getTotalArmas());
    }
}
