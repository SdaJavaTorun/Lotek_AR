package com.sdajava.dpobservator2;

import java.util.List;

public class Internet implements Media, Obserwator {
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
    private int [] wyniki = new int[10];
    private TotoLotek lotek;

    public Internet (TotoLotek lotek) {
        this.lotek = lotek;
        this.lotek.dodajObserwatora(this);
    }

    public void spadam() {
        System.out.println("Bye NET");
    }
}
