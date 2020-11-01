package patron_de_methode.implementation2;

/**
 * Created by Armel on 20/09/2020.
 */
public class The extends BoissonCafeine{

    public void suivreRecette() {

        faireBouillirEau();
        infuser();
        verserDansTasse();
        ajouterCitron();
    }

    void infuser() {
        System.out.println("Infuser the");
    }

    void ajouterCitron() {
        System.out.println("Ajouter citron");
    }

}
