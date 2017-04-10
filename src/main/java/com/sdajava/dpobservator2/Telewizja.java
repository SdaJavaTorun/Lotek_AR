package com.sdajava.dpobservator2;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.ArrayList;
import java.util.List;

public class Telewizja implements Media, Obserwator {
    @Override
    public void informuj() {
        System.out.println("Tu TV");
    }

    @Override
    public void update(List<Integer> wyniki) {
        System.out.println("\nTV podaje wyniki: ");
        for (Integer i : wyniki) {
            System.out.printf(i + " ");
        }
    }

    private List<Double> wyniki = new ArrayList<>();
    private TotoLotek lotek;

    public Telewizja ( TotoLotek lotek) {
        this.lotek = lotek;
        this.lotek.dodajObserwatora(this);
    }

    public void spadam() {
        System.out.println("Bye TV");
    }
}
