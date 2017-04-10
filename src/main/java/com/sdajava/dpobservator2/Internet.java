package com.sdajava.dpobservator2;

import java.util.List;

public class Internet implements Media, Obserwator {

    private TotoLotek lotek;

    @Override
    public void informuj() {
        System.out.println("Tu NET");
    }

    @Override
    public void update(List<Integer> wyniki) {
        System.out.println("\nInternety podaja wyniki: ");
        for (Integer i : wyniki)
            System.out.print(i + " ");
    }

    public Internet (TotoLotek lotek) {
        this.lotek = lotek;
        this.lotek.dodajObserwatora(this);
    }

    @Override
    public void spadam() {
        System.out.println("\nNET mówi nara");
        this.lotek.usunObserwatora(this);
    }

    @Override
    public void subscribe() {
        System.out.println("\nNET wchodzi do transmisji");
        this.lotek.dodajObserwatora(this);
    }
}
