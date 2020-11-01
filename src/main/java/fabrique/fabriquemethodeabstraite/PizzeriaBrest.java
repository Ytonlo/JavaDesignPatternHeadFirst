package fabrique.fabriquemethodeabstraite;

import fabrique.Pizza;
import fabrique.implementations.*;

/**
 * Created by Armel on 15/06/2020.
 */
public class PizzeriaBrest extends Pizzeria {
    @Override
    Pizza creerPizza(String typePizza) {

        Pizza pizza = new PizzaDeBase();

        if (typePizza.equals("fromage")) {
            return new PizzaFromageStyleBrest();
        } else if (typePizza.equals("vegetarienne")) {
            return new PizzaVegetarienneStyleBrest();
        } else if (typePizza.equals("fruitsDeMer")) {
            return new PizzaFruitsDeMerStyleBrest();
        } else if (typePizza.equals("poivrons")) {
            return new PizzaPoivronsStyleBrest();
        }

        return pizza;
    }
}
