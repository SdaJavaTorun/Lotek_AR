package com.sdajava.dpobservator2;

/**
 * Created by RENT on 2017-04-10.
 */
public interface Obserwowany {

    public void dodajObserwatora(Obserwator obserwator);
    public void usunObserwatora(Obserwator obserwator);
    public void powiadamiajObserwatorow();

}
