package fabrique.fabriquemethodeabstraite;

/**
 * Created by Armel on 15/06/2020.
 */
public class PizzeriaTest {
    public static void main(String[] args) {
        Pizzeria pizzeriaBrest = new PizzeriaBrest();
        pizzeriaBrest.commanderPizza("fromage");
    }
}
