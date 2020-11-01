package fabrique.fabriquesimple;

import fabrique.Pizza;
import fabrique.implementations.*;

/**
 * Encapsule la creation des pizzas ==> Responsabilite : creer des pizzas
 */
public class SimpleFabriquePizza {

    public Pizza creerPizza(String typePizza) {

        Pizza pizza = new PizzaDeBase();

        if (typePizza.equals("fromage")) {
            pizza = new PizzaFromage();
        } else if (typePizza.equals("fruitsdeMer")) {
            pizza = new PizzaFruitsDeMer();
        } else if (typePizza.equals("vegetarienne")) {
            pizza = new PizzaVegetarienne();
        } else if (typePizza.equals("poivrons")) {
            pizza = new PizzaPoivrons();
        }

        return pizza;
    }
}
