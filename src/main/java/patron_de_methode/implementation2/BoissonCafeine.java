package patron_de_methode.implementation2;

/**
 * Created by Armel on 20/09/2020.
 */
public abstract class BoissonCafeine {

     protected void faireBouillirEau () {
        System.out.println("Bouillir eau");
    }

    protected void verserDansTasse() {
        System.out.println("Verser café dans tasse ");
    }

    abstract void suivreRecette();
}
