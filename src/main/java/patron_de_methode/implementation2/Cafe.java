package patron_de_methode.implementation2;

/**
 * Created by Armel on 20/09/2020.
 */
public class Cafe extends BoissonCafeine{

    public void suivreRecette() {

        faireBouillirEau();
        filtrerCafe();
        verserDansTasse();
        ajouterLaitEtSucre();
    }


    void filtrerCafe() {
        System.out.println("Filtrer café");
    }

     void ajouterLaitEtSucre() {
        System.out.println("Ajouter lait et surce");
    }
}
