package commande.implementation;

import commande.modele.Lampe;

/**
 * Created by Armel on 08/09/2020.
 */
public class ProduitProprietaireFactoryImpl implements ProduitProprietaireFactory{
    @Override
    public Lampe creerLampe() {
        return Lampe.create();
    }
}
