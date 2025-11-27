package org.example;

public class Gra {

    public char[] zamienNapis(String napis){
        String bezSpacji = napis.replace(" ", "");
        return bezSpacji.toCharArray();
    }

    public char[] zamienNaPolskie(char[] znaki){
        return znaki;
    }

}
