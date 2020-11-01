package fabrique.fabriquesimple;

import fabrique.Pizza;
import fabrique.implementations.*;

/**
 * Created by Armel on 14/06/2020.
 */
public class PizzeriaVersion2PressionMarche {
    Pizza commanderPizza(String typePizza) {

        Pizza pizza = new PizzaDeBase();

        /* Aspects du codes qui varients, à séparer de ce qui varie pas ==> à encapsuler */

        if (typePizza.equals("fromage")) {
            pizza = new PizzaFromage();
        } else if (typePizza.equals("fruitsdeMer")) {
            pizza = new PizzaFruitsDeMer();
        } else if (typePizza.equals("vegetarienne")) {
            pizza = new PizzaVegetarienne();
        } else if (typePizza.equals("poivrons")) {
            pizza = new PizzaPoivrons();
        }

        /* Aspects du codes qui ne varient pas */
        pizza.preparer();
        pizza.cuire();
        pizza.decouper();
        pizza.emballer();

        return pizza;
    }
}
