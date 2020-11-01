package strategie;

import strategie.implementations.cancan.Cancan;
import strategie.implementations.vol.NePasVoler;
import strategie.interfaces.ComportementCancan;
import strategie.interfaces.ComportementVol;

/**
 * Created by Armel on 15/04/2020.
 */
public class PrototypeCanard extends Canard {

    public void afficher() {
        System.out.println("Prototype");
    }
}
