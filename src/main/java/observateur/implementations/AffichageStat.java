package observateur.implementations;

import com.sun.javafx.geom.transform.Affine2D;
import observateur.interfaces.Affichage;
import observateur.interfaces.Observateur;
import observateur.interfaces.Sujet;

/**
 * Created by Armel on 09/05/2020.
 */
public class AffichageStat implements Observateur, Affichage {

    private float temperature;
    private float humidite;
    private float pression;

    private Sujet donneesMeteo;

    public AffichageStat(Sujet donneesMeteo) {
        this.donneesMeteo = donneesMeteo;
        donneesMeteo.enregistrerObservateur(this);
    }

    @Override
    public void afficher() {

    }

    @Override
    public void actualiser(float temperature, float humidite, float pression) {
        this.temperature = temperature;
        this.humidite = humidite;
        this.pression = pression;
        this.afficher();
    }
}
