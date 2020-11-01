package patron_de_methode.implementation1;

/**
 * Created by Armel on 20/09/2020.
 */
public class Cafe {

    public void suivreRecette() {

        faireBouillirEau();
        filtrerCafe();
        verserDansTasse();
        ajouterLaitEtSucre();
    }

    private void faireBouillirEau () {
        System.out.println("Bouillir eau");
    }

    private void filtrerCafe() {
        System.out.println("Filtrer café");
    }

    private void verserDansTasse() {
        System.out.println("Verser café dans tasse ");
    }

    private void ajouterLaitEtSucre() {

        System.out.println("Ajouter lait et surce");
    }
}
