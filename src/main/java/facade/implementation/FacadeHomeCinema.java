package facade.implementation;

import facade.modeles.*;

/**
 * Created by Armel on 20/09/2020.
 */
public class FacadeHomeCinema {

    Amplificateur amp;
    Tuner tuner;
    LecteurDvd dvd;
    LecteurCd cd;
    Projecteur projecteur;
    Lumieres lumieres;
    Ecran ecran;
    MachineAPopcorn machineAPopCorn;

    public FacadeHomeCinema(Amplificateur amp, Tuner tuner, LecteurDvd dvd, LecteurCd cd, Projecteur projecteur, Lumieres lumieres, Ecran ecran, MachineAPopcorn machineAPopCorn) {
        this.amp = amp;
        this.tuner = tuner;
        this.dvd = dvd;
        this.cd = cd;
        this.projecteur = projecteur;
        this.lumieres = lumieres;
        this.ecran = ecran;
        this.machineAPopCorn = machineAPopCorn;
    }

    public void regarderFilm(String film) {
        System.out.println("Vous allez voir un bon film...");
        machineAPopCorn.marche();
        machineAPopCorn.eclater();
        lumieres.attenuer(10) ;
        ecran.baisser();
        projecteur.marche();
        projecteur.modeGrandEcran();
        amp.marche();
        amp.setDvd(dvd);
        amp.setSonSurround();
        amp.setVolume(5);
        dvd.marche();
        dvd.jouer(film);
    }
}
