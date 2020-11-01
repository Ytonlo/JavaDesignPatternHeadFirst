package commande.implementation;

import commande.modele.Lampe;

/**
 * Created by Armel on 08/09/2020.
 */
public class TestTelecommande {

    public static void main(String[] args) {

        ProduitProprietaireFactory produitProprietaireFactory =  new ProduitProprietaireFactoryImpl();

        Lampe lampe = produitProprietaireFactory.creerLampe();

        CommandeAllumerLampe commandeAllumerLampe = new CommandeAllumerLampe(lampe);

        TeleCommandeSimple teleCommandeSimple = TeleCommandeSimple.create()
                                                                  .setEmplacement(commandeAllumerLampe)
                                                                  .boutonPresse();



    }
}
