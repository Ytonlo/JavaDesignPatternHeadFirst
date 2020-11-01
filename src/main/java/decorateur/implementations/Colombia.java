package decorateur.implementations;

import decorateur.interfaces.Boisson;

/**
 * Created by Armel on 09/05/2020.
 */
public class Colombia extends Boisson {

    public Colombia() {
        description = "Pur Colombia";
    }

    @Override
    public double cout() {
        return 0.89;
    }
}
