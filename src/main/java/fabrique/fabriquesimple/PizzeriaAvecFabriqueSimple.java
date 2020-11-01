package fabrique.fabriquesimple;

import fabrique.Pizza;

/**
 * Created by Armel on 14/06/2020.
 */
public class PizzeriaAvecFabriqueSimple {

    SimpleFabriquePizza simpleFabriquePizza;

    public PizzeriaAvecFabriqueSimple(SimpleFabriquePizza simpleFabriquePizza) {
        this.simpleFabriquePizza = simpleFabriquePizza;
    }

    Pizza commanderPizza(String typePizza) {

        Pizza pizza = simpleFabriquePizza.creerPizza(typePizza);

        pizza.preparer();
        pizza.cuire();
        pizza.decouper();
        pizza.emballer();

        return pizza;
    }
}
