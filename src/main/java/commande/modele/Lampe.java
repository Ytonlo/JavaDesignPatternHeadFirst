package commande.modele;

/**
 * Created by Armel on 08/09/2020.
 */
public class Lampe {

    private Lampe () {

    }
    public Lampe allumer() {
        return this;
    }

    public Lampe etteindre () {
        return this;
    }

    public static Lampe create() {
        return new Lampe();
    }

}
