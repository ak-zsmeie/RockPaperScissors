package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Tests {

    @Test
    public void zwrociTabliceZNapisu() {
        Gra gra = new Gra();
        char[] znaki = gra.zamienNapis("A Y");
        Assertions.assertArrayEquals(new char[]{'A','Y'}, znaki);
    }

    @Test
    public void zwrociPunktyZaFigure() {
        Gra gra = new Gra();
        Assertions.assertEquals(1, gra.figuraGracza('X'));
        Assertions.assertEquals(2, gra.figuraGracza('Y'));
        Assertions.assertEquals(3, gra.figuraGracza('Z'));
    }

    @Test
    public void policzyWynikRundy() {
        Gra gra = new Gra();
        Assertions.assertEquals(6, gra.wynikRundy('A','Y'));
        Assertions.assertEquals(0, gra.wynikRundy('B','X'));
        Assertions.assertEquals(3, gra.wynikRundy('C','Z'));
    }

    @Test
    public void policzyWiersz() {
        Gra gra = new Gra();
        Assertions.assertEquals(8, gra.policzWiersz("A Y"));
        Assertions.assertEquals(1, gra.policzWiersz("B X"));
        Assertions.assertEquals(6, gra.policzWiersz("C Z"));
    }

    @Test
    public void policzyCalaGre() {
        Gra gra = new Gra();
        String[] dane = {"A Y","B X","C Z"};
        Assertions.assertEquals(15, gra.policzCalaGre(dane));
    }
}
