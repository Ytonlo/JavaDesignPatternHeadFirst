package strategie;

import strategie.implementations.cancan.Cancan;
import strategie.implementations.vol.NePasVoler;

/**
 * Created by Armel on 15/04/2020.
 */
public class DemoStrategie {

    public static void main(String[] args) {
        System.out.println("-------------------------");
        Canard colvert = new Colvert();

        colvert.effectuerCancan();
        colvert.effectuerVol();
        colvert.afficher();

        System.out.println("------------------------");
        Canard prototypeCanard = new PrototypeCanard();
        prototypeCanard.setComportementCancan(new Cancan())
                        .setComportementVol(new NePasVoler());

        prototypeCanard.effectuerCancan();
        prototypeCanard.effectuerVol();
        prototypeCanard.afficher();

        System.out.println("-------------------------");
    }
}
