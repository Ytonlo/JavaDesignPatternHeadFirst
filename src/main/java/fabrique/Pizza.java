package fabrique;

import java.util.ArrayList;

/**
 * Created by Armel on 11/06/2020.
 */
public abstract class Pizza {

    protected String name;
    protected String sauce;
    protected String pate;
    protected ArrayList garnitues = new ArrayList();

    public void preparer() {
        System.out.println("Preparation de " + name);
        System.out.println("Etalage de la pâte ...");
        System.out.println("Ajout de la sauce ...");
        System.out.println("Ajout des garnitures ...");
        garnitues.forEach(garniture -> {
            System.out.println(" " + garniture);
        });
    }

    public void cuire() {
        System.out.println("Cuisson à 25 minutes à 180°");
    }

    public void decouper() {
        System.out.println("Découpage en parts triangulaires");
    }

    public void emballer() {
        System.out.println("Emballage dans une boîte officielle");
    }

    public String getName() {
        return name;
    }
}
