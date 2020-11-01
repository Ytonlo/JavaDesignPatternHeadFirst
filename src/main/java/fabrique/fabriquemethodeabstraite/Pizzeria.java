package fabrique.fabriquemethodeabstraite;

import fabrique.Pizza;

/**
 * Created by Armel on 15/06/2020.
 */
public abstract class Pizzeria {

    Pizza commanderPizza(String typePizza) {

        Pizza pizza = creerPizza(typePizza);

        pizza.preparer();
        pizza.cuire();
        pizza.decouper();
        pizza.emballer();

        return pizza;
    }

    abstract Pizza creerPizza(String typePizza);
}
