package observateur;

import observateur.implementations.AffichageCondition;
import observateur.implementations.AffichageStat;
import observateur.implementations.DonneesMeteo;

/**
 * Created by Armel on 09/05/2020.
 */
public class StationMeteo {
    public static void main(String[] args) {
        DonneesMeteo donneesMeteo = new DonneesMeteo();

        AffichageCondition affichageCondition = new AffichageCondition(donneesMeteo);
        AffichageStat affichageStat = new AffichageStat(donneesMeteo);

        donneesMeteo.setMesures(26,65,1020);
        donneesMeteo.setMesures(28,70,1012);
        donneesMeteo.setMesures(22,60,1012);

    }
}
