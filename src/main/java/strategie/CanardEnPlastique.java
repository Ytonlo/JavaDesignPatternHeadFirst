package strategie;

import strategie.implementations.cancan.CancanMuet;
import strategie.implementations.vol.NePasVoler;
import strategie.interfaces.ComportementCancan;
import strategie.interfaces.ComportementVol;

/**
 * Created by Armel on 15/04/2020.
 */
public class CanardEnPlastique  extends Canard{

    public CanardEnPlastique() {
        ComportementCancan comportementCancan = new CancanMuet();
        ComportementVol comportementVol = new NePasVoler();
    }

    public void afficher() {
        System.out.println("canar en plastique");
    }
}
