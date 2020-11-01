package decorateur;

import decorateur.implementations.*;
import decorateur.interfaces.Boisson;

/**
 * Created by Armel on 09/05/2020.
 */
public class StarbuzzCoffee {
    public static void main(String[] args) {
        Boisson expresso = new Expresso();
        System.out.println(expresso.getDescription() + " Euro " + expresso.cout());

        Boisson sumatra = new Sumatra();
        sumatra.setTaille(Taille.GRAND);
        sumatra = new Chocolat(sumatra);
        sumatra = new Chocolat(sumatra);
        sumatra = new Chantilly(sumatra);
        System.out.println(sumatra.getDescription() + " Euro " + sumatra.cout());

        Boisson colombia = new Colombia();
        colombia = new Caramel(colombia);
        colombia = new Chantilly(colombia);
        colombia = new Chocolat(colombia);

        System.out.println(sumatra.getDescription() + " Euro " + colombia.cout());

    }
}
