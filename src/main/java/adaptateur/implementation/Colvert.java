package adaptateur.implementation;

import adaptateur.interfaces.Canard;

/**
 * Created by Armel on 20/09/2020.
 */
public class Colvert implements Canard {

    private Colvert() {
    }

    public static Colvert create() {
        return new Colvert();
    }

    @Override
    public void cancaner() {
        System.out.println("coicoin");
    }

    @Override
    public void voler() {
        System.out.println("je vole");
    }
}
