package fabrique.fabriquesimple;

import fabrique.Pizza;

/**
 * Created by Armel on 14/06/2020.
 */
public class PizzeriaAvecSimpleFabriqueTest {

    public static void main(String[] args) {

        SimpleFabriquePizza simpleFabriquePizza = new SimpleFabriquePizza();
        PizzeriaAvecFabriqueSimple pizzeriaAvecFabriqueSimple = new PizzeriaAvecFabriqueSimple(simpleFabriquePizza);
        Pizza pizzaFromage = pizzeriaAvecFabriqueSimple.commanderPizza("fromage");

    }
}
