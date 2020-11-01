package commande.implementation;

/**
 * Created by Armel on 09/09/2020.
 */
public class MacroCommande implements Commande {
    Commande[] commandes;
    public MacroCommande(Commande[] commandes) {
        this.commandes = commandes;
    }
    public void executer() {
        for (int i = 0; i < commandes.length; i++) {
            commandes[i].executer();
        }
    }
    public void annuler() {

    }
}
