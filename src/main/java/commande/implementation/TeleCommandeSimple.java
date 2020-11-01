package commande.implementation;

/**
 * Created by Armel on 08/09/2020.
 */
public class TeleCommandeSimple {

    Commande emplacement;
    private static TeleCommandeSimple uniqueInstance = new TeleCommandeSimple();

    private TeleCommandeSimple() {
    }

    public static TeleCommandeSimple create() {
        return uniqueInstance;
    }

    public TeleCommandeSimple setEmplacement(Commande commande) {
        emplacement = commande;
        return this;
    }

    public TeleCommandeSimple boutonPresse() {
        emplacement.executer();
        return this;
    }
}
