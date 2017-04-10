package com.sdajava.dpobservator2;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        TotoLotek totoLotek = new TotoLotek();

        new Internet(totoLotek);

        Telewizja telewizja = new Telewizja(totoLotek);

        totoLotek.setWyniki();
        totoLotek.usunObserwatora(telewizja);
        totoLotek.setWyniki();

        //totoLotek.setWyniki(result);
        //totoLotek.setWyniki(result);
    }
}
