package adaptateur.implementation;

import adaptateur.interfaces.Canard;
import adaptateur.interfaces.Dindon;

/**
 * Created by Armel on 20/09/2020.
 */
public class AdaptateurDindon implements Canard {

    Dindon dindon;

    private AdaptateurDindon(Dindon dindon) {
        this.dindon = dindon;
    }

    public static AdaptateurDindon create (Dindon dindon) {
        return new AdaptateurDindon(dindon);
    }

    @Override
    public void cancaner() {
            dindon.glouglouter();
    }

    @Override
    public void voler() {
        for (int i = 0; i < 5; i++) {
            dindon.voler();
        }
    }
}
