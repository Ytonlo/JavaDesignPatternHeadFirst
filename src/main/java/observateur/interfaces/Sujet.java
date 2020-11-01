package observateur.interfaces;

/**
 * Created by Armel on 09/05/2020.
 */
public interface Sujet {
    public void enregistrerObservateur(Observateur observateur);
    public void supprimerObservateur(Observateur observateur);
    public void notifierObservateurs();
}
