package decorateur.interfaces;

import decorateur.Taille;

/**
 * Created by Armel on 09/05/2020.
 */
public abstract class Boisson {

    protected String description = "Boisson inconnu";
    protected Taille taille;

    public String getDescription() {
        return description;
    }

    public abstract double cout();

    public Taille getTaille() {
        return taille;
    }

    public Boisson setTaille(Taille taille) {
        this.taille = taille;
        return this;
    }

}
