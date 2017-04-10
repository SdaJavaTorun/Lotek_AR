package com.sdajava.dpobservator2;

import java.util.List;

public interface Obserwator {

    public void update(List<Integer> wyniki);
    public void subscribe();
    public void spadam();
}
