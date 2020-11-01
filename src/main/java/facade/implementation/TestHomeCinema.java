package facade.implementation;

import facade.modeles.*;

/**
 * Created by Armel on 20/09/2020.
 */
public class TestHomeCinema {

    public static void main(String[] args) {
        FacadeHomeCinema facadeHomeCinema = new FacadeHomeCinema(new Amplificateur(),
                new Tuner(),
                new LecteurDvd(),
                new LecteurCd(),
                new Projecteur(),
                new Lumieres(),
                new Ecran(),
                new MachineAPopcorn());

        facadeHomeCinema.regarderFilm("test");
    }
}
