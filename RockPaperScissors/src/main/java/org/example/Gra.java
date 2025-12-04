package org.example;

public class Gra {

    public char[] zamienNapis(String wiersz) {
        String[] t = wiersz.split(" ");
        return new char[]{t[0].charAt(0), t[1].charAt(0)};
    }

    public int figuraGracza(char me) {
        if (me == 'X') return 1;
        if (me == 'Y') return 2;
        return 3;
    }

}

