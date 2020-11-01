package fabrique.fabriqueabstraite;

import fabrique.fabriqueabstraite.ingredientsabstraits.*;

/**
 * Created by Armel on 15/06/2020.
 */
public interface FabriqueIngredientsPizza {
    public Pate creerPate();
    public Sauce crrerSauce();
    public Fromage creerFromage();
    public Legumes[] creerLegumes();
    public Poivrons creerPoivrons();
    public Moules creerMoules();
}
