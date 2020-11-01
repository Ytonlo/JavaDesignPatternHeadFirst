package decorateur.implementations;

import decorateur.interfaces.Boisson;
import decorateur.interfaces.DecorateurIngredient;

/**
 * Created by Armel on 09/05/2020.
 */
public class Chantilly extends DecorateurIngredient {

    private Boisson boisson;

    public Chantilly(Boisson boisson) {
        this.boisson = boisson;
    }

    @Override
    public String getDescription() {
        return boisson.getDescription() + " Chantilly";
    }

    @Override
    public double cout() {
        return boisson.cout() + 0.30;
    }
}
