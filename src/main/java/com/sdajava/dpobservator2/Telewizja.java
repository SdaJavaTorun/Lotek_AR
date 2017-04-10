package com.sdajava.dpobservator2;

import java.util.List;

public class Telewizja implements Media, Obserwator {

    private TotoLotek lotek;

    @Override
    public void informuj() {
        System.out.println("Tu TV - proszę podać wyniki ostaniego losowania");
    }

    @Override
    public void update(List<Integer> wyniki) {
        System.out.println("\nTV podaje wyniki: ");
        for (Integer i : wyniki) {
            System.out.printf(i + " ");
        }
    }

    public Telewizja ( TotoLotek lotek) {
        this.lotek = lotek;
        this.lotek.dodajObserwatora(this);
    }

    @Override
    public void spadam() {
        System.out.println("\nTV mówi dobranoc");
        this.lotek.usunObserwatora(this);
    }

    @Override
    public void subscribe() {
        System.out.println("\nTV wchodzi do transmisji");
        this.lotek.dodajObserwatora(this);
    }
}
