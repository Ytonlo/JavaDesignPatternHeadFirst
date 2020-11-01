package patron_de_methode.implementation3;

/**
 * Created by Armel on 20/09/2020.
 */
public class The extends BoissonCafeine {

    @Override
    void preparer() {
        System.out.println("Infuser the");
    }

    @Override
    void ajouterSupplements() {
        System.out.println("Ajouter citron");
    }
}
