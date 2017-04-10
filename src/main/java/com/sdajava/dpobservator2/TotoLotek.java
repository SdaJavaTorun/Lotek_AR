package com.sdajava.dpobservator2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TotoLotek implements Obserwowany {

    public TotoLotek(){}

    private List<Obserwator> obserwators = new ArrayList<>();

    private List<Integer> wyniki = new ArrayList<>();

    public List<Integer> getWyniki () {
        return wyniki;
    }

    public void setWyniki() {
        kolejneLosowanie();
        this.wyniki = wyniki;
        powiadamiajObserwatorow();
    }

    @Override
    public void dodajObserwatora(Obserwator obserwator) {
        obserwators.add(obserwator);
    }

    @Override
    public void usunObserwatora(Obserwator obserwator) {

        this.obserwators.remove(obserwator);
    }

    @Override
    public void powiadamiajObserwatorow() {
        obserwators.forEach(
                o -> o.update(wyniki));
    }

    public List<Integer> kolejneLosowanie(){
        Random random = new Random();
        wyniki.clear();
        for(int x =0; x < 10; x++) {
            wyniki.add(random.nextInt(50));
        }
        return wyniki;
    }
}
