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

}
