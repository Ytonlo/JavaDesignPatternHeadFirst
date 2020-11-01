package decorateur.implementations;

import decorateur.interfaces.Boisson;

/**
 * Created by Armel on 09/05/2020.
 */
public class Deca extends Boisson {

    public Deca() {
        description = "Deca";
    }

    @Override
    public double cout() {
        return 1.1;
    }
}
