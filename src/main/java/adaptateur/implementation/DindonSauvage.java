package adaptateur.implementation;

import adaptateur.interfaces.Dindon;

/**
 * Created by Armel on 20/09/2020.
 */
public class DindonSauvage implements Dindon {

    private DindonSauvage() {
    }

    public static DindonSauvage create() {
        return new DindonSauvage();
    }

    @Override
    public void glouglouter() {
        System.out.println("Glouglou");
    }

    @Override
    public void voler() {
        System.out.println("Je ne vole pas loin");
    }
}
