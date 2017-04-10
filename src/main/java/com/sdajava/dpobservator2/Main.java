package com.sdajava.dpobservator2;

public class Main {

    public static void main(String[] args) {

        TotoLotek totoLotek = new TotoLotek();

        Internet internet = new Internet(totoLotek);
        Telewizja telewizja = new Telewizja(totoLotek);

        totoLotek.setWyniki();
        telewizja.spadam();
        totoLotek.setWyniki();
        internet.spadam();

        telewizja.subscribe();
        totoLotek.setWyniki();
    }
}
