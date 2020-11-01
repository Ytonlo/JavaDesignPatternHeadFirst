package decorateur.implementations;

import decorateur.interfaces.Boisson;
import decorateur.interfaces.DecorateurIngredient;

/**
 * Created by Armel on 09/05/2020.
 */
public class Caramel extends DecorateurIngredient{

    private Boisson boisson;

    public Caramel(Boisson boisson) {
        this.boisson = boisson;
    }

    @Override
    public String getDescription() {
        return boisson.getDescription() + " Caramel";
    }

    @Override
    public double cout() {
        return 0.10 + boisson.cout() + boisson.getTaille().cout();
    }
}
