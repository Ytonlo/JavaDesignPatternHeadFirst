package observateur.implementations;

import observateur.interfaces.Affichage;
import observateur.interfaces.Observateur;
import observateur.interfaces.Sujet;

import java.util.StringJoiner;

/**
 * Created by Armel on 09/05/2020.
 */

public class AffichageCondition implements Observateur, Affichage {

    private float temperature;
    private float humidite;

    private Sujet donneesMeteo;

    public AffichageCondition(Sujet donneesMeteo) {
        this.donneesMeteo = donneesMeteo;
        donneesMeteo.enregistrerObservateur(this);
    }

    @Override
    public void actualiser(float temperature, float humidite, float pression) {
        this.temperature = temperature;
        this.humidite = humidite;
        this.afficher();
    }

    @Override
    public void afficher() {
        StringJoiner stringJoiner = new StringJoiner(" ");
        stringJoiner.add("Conditions actuelles :")
                    .add(Float.toString(temperature))
                    .add("degres C et ")
                    .add(Float.toString(humidite))
                    .add(" % humidité");

        System.out.println(stringJoiner.toString());
    }

    public void supprimerObservateur() {
        donneesMeteo.supprimerObservateur(this);
    }
}
