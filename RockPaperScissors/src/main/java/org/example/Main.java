package org.example;

public class Main {
    public static void main(String[] args) {
        String[] dane = {
                "A Y",
                "B X",
                "C Z"
        };

        Gra gra = new Gra();
        int wynik = gra.policzCalaGre(dane);

        System.out.println(wynik);
    }
}
