package patron_de_methode.implementation3;

/**
 * Created by Armel on 20/09/2020.
 */
public abstract class BoissonCafeine {

    final void suivreRecette() {
         faireBouillirEau();
         preparer();
         verserDansTasse();
         ajouterSupplements();
    }

    abstract void preparer();
    abstract void ajouterSupplements();

    final void faireBouillirEau () {
        System.out.println("Bouillir eau");
    }
    final void verserDansTasse() {
        System.out.println("Verser café dans tasse ");
    }
}
