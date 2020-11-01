package commande.implementation;

/**
 * Created by Armel on 09/09/2020.
 */
public class TeleCommande {

    Commande[] commandesMarche;
    Commande[] commandesArret;

    public TeleCommande(Commande[] commandesMarche, Commande[] commandesArret) {
        this.commandesMarche = new Commande[7];
        this.commandesArret = new Commande[7];

        Commande pasDeCommande = new PasDeCommande();
        for(int i=0;i<7;i++) {
            commandesMarche[i] = pasDeCommande;
            commandesArret[i] = pasDeCommande;
        }

    }

    public void setCommande(int empt, Commande comMarche, Commande comArret) {
        commandesMarche[empt] = comMarche;
        commandesArret[empt] = comArret;
    }

    public void boutonMarchePresse(int empt) {
        commandesMarche[empt].executer();
//        commandeAnnulation = commandesMarche[empt];
    }

    public void boutonArretPresse(int empt) {
        commandesArret[empt].executer();
//        commandeAnnulation = commandesArret[empt];
    }
}
