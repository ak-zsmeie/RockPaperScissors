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

    public int wynikRundy(char opp, char me) {
        if (opp == 'A') {
            if (me == 'X') return 3;
            if (me == 'Y') return 6;
            return 0;
        }
        if (opp == 'B') {
            if (me == 'X') return 0;
            if (me == 'Y') return 3;
            return 6;
        }
        if (opp == 'C') {
            if (me == 'X') return 6;
            if (me == 'Y') return 0;
            return 3;
        }
        return 0;
    }

    public int policzWiersz(String w) {
        char[] z = zamienNapis(w);
        int figura = figuraGracza(z[1]);
        int wynik = wynikRundy(z[0], z[1]);
        return figura + wynik;
    }

    public int policzCalaGre(String[] dane) {
        int suma = 0;
        for (String d : dane) suma += policzWiersz(d);
        return suma;
    }
}
