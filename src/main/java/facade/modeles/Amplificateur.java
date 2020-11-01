package facade.modeles;

/**
 * Created by Armel on 20/09/2020.
 */
public class Amplificateur {

     LecteurDvd dvd;
    private int volume;

    public void marche() {

    }

    public void setDvd(LecteurDvd dvd) {
        this.dvd = dvd;
    }

    public void setSonSurround() {
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
