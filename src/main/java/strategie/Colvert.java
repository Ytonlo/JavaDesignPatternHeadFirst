package strategie;

import strategie.implementations.cancan.Cancan;
import strategie.implementations.vol.VolerAvecDesAiles;

/**
 * Created by Armel on 15/04/2020.
 */
public class Colvert extends Canard{

    public Colvert() {
       comportementCancan = new Cancan();
       comportementVol = new VolerAvecDesAiles();
    }

    public void afficher() {
        System.out.println("Colvert");
    }
}
