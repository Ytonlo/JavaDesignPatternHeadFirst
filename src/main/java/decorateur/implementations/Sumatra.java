package decorateur.implementations;

import decorateur.interfaces.Boisson;

/**
 * Created by Armel on 09/05/2020.
 */
public class Sumatra extends Boisson{

    public Sumatra() {
        description = "Sumatra";
    }

    @Override
    public double cout() {
        return 1.2;
    }
}
