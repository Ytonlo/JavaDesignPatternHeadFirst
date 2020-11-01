package observateur.implementations;

import observateur.interfaces.Observateur;
import observateur.interfaces.Sujet;

import java.util.ArrayList;

/**
 * Created by Armel on 09/05/2020.
 */
public class DonneesMeteo implements Sujet {

    private ArrayList<Observateur> observateurs;
    private float temperature;
    private float humidite;
    private float pression;

    public DonneesMeteo() {
        observateurs = new ArrayList();
    }

    public void enregistrerObservateur(Observateur observateur) {
        observateurs.add(observateur);
    }

    public void supprimerObservateur(Observateur observateur) {
        int indexObservateur = observateurs.indexOf(observateur);
        if(indexObservateur >= 0) {
            observateurs.remove(observateur);
        }
    }

    public void notifierObservateurs() {
        observateurs.forEach( observateur -> observateur.actualiser(temperature, humidite,pression));
    }

    public void actualiserMesures () {
        notifierObservateurs();
    }

    public void setMesures (float temperature, float humidite, float pression) {
        this.temperature = temperature;
        this.humidite = humidite;
        this.pression = pression;
        this.actualiserMesures();
    }
}
