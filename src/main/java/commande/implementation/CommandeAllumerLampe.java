package commande.implementation;

import commande.modele.Lampe;

/**
 * Created by Armel on 08/09/2020.
 */
public class CommandeAllumerLampe implements Commande {

    Lampe lampe;

    public CommandeAllumerLampe(Lampe lampe) {
        this.lampe = lampe;
    }

    @Override
    public void executer() {

        lampe.allumer();

    }
}
