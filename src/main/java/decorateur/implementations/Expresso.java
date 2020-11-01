package decorateur.implementations;

import decorateur.interfaces.Boisson;

/**
 * Created by Armel on 09/05/2020.
 */
public class Expresso extends Boisson {

    public Expresso() {
        description = "Expresso";
    }

    @Override
    public double cout() {
        return 1.99;
    }
}
