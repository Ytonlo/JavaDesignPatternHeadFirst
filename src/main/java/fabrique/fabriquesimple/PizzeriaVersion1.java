package fabrique.fabriquesimple;

import fabrique.Pizza;
import fabrique.implementations.PizzaDeBase;
import fabrique.implementations.PizzaFromage;
import fabrique.implementations.PizzaGrecque;
import fabrique.implementations.PizzaPoivrons;

/**
 * Created by Armel on 11/06/2020.
 */
public class PizzeriaVersion1 {

    Pizza commanderPizza(String typePizza) {

        Pizza pizza = new PizzaDeBase();

        if (typePizza.equals("fromage")) {
            pizza = new PizzaFromage();
        } else if (typePizza.equals("grecque")) {
            pizza = new PizzaGrecque();
        } else if (typePizza.equals("poivrons")) {
            pizza = new PizzaPoivrons();
        }

        pizza.preparer();
        pizza.cuire();
        pizza.decouper();
        pizza.emballer();

        return pizza;
    }
}
