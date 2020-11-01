package fabrique.implementations;

import fabrique.Pizza;

/**
 * Created by Armel on 15/06/2020.
 */
public class PizzaFromageStyleStrasbourg extends Pizza {
    public PizzaFromageStyleStrasbourg() {
        name = "Pizza pâte style strasbourg et fromage";
        pate = "Extra épaisse";
        sauce = "Sauce aux tomates cerise";
        garnitues.add("Lamelles de mozzarella");
    }

    public void couper() {
        System.out.println("Découpage en part carrées");
    }
}
