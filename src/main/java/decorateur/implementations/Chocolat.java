package decorateur.implementations;

import decorateur.interfaces.Boisson;
import decorateur.interfaces.DecorateurIngredient;

/**
 * Created by Armel on 09/05/2020.
 */
public class Chocolat extends DecorateurIngredient {

    private Boisson boisson;

    public Chocolat(Boisson boisson) {
        this.boisson = boisson;
    }

    @Override
    public String getDescription() {
        return boisson.getDescription() + ", chocolat";
    }

    @Override
    public double cout() {
        return 0.20 + boisson.cout();
    }

}
