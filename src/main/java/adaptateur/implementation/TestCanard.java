package adaptateur.implementation;

import adaptateur.interfaces.Canard;
import adaptateur.interfaces.Dindon;

/**
 * Created by Armel on 20/09/2020.
 */
public class TestCanard {

    public static void main(String[] args) {

        Canard colvert = Colvert.create();
        Dindon dindonSauvage = DindonSauvage.create();
        Canard adaptateurDindon = AdaptateurDindon.create(dindonSauvage);

        System.out.println("Didon dit ..");
        testerDindon(dindonSauvage);

        System.out.println("\n Carnard dit ...");
        testerCarnard(colvert);

        System.out.println("\n AdaptateurDindon dit ...");
        testerCarnard(adaptateurDindon);
    }


    private static void testerDindon(Dindon dindon) {
        dindon.glouglouter();
        dindon.voler();
    }

    private static void testerCarnard(Canard canard) {
        canard.cancaner();
        canard.voler();
    }
}
