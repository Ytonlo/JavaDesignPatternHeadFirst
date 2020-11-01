package strategie;

import strategie.interfaces.ComportementCancan;
import strategie.interfaces.ComportementVol;

/**
 * Created by Armel on 15/04/2020.
 */
public abstract class Canard {
    /* public void nager () {
    }
    public void cancaner () {
    } */
    ComportementCancan comportementCancan;
    ComportementVol comportementVol;

    public void effectuerVol() {
        comportementVol.voler();
    }

    public void effectuerCancan() {
        comportementCancan.cancaner();
    }

    public ComportementCancan getComportementCancan() {
        return comportementCancan;
    }

    public Canard setComportementCancan(ComportementCancan comportementCancan) {
        this.comportementCancan = comportementCancan;
        return this;
    }

    public ComportementVol getComportementVol() {
        return comportementVol;
    }

    public Canard setComportementVol(ComportementVol comportementVol) {
        this.comportementVol = comportementVol;
        return this;
    }

    public abstract void afficher ();
}
