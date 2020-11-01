package commande.implementation;

import commande.modele.Lampe;

/**
 * Created by Armel on 09/09/2020.
 */
public class CommandeEteindreLampe implements Commande
{
    Lampe lampe;
    public CommandeEteindreLampe(Lampe lampe) {
        this.lampe = lampe;
    }
    public void executer() {
        lampe.etteindre();
    }
    public void annuler() {
        lampe.allumer();
    }
}