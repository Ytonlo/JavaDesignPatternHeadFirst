package patron_de_methode.implementation4;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Created by Armel on 20/09/2020.
 */
public abstract class BoissonCafeineAvecAdaptateur {

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

    boolean clientVeutSupplements() {
        return true;
    }
}
