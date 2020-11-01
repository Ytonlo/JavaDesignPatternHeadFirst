package fabrique;

import fabrique.fabriqueabstraite.ingredientsabstraits.*;

/**
 * Created by Armel on 15/06/2020.
 */
public abstract class PizzaVersion2 {
    protected String name;
    protected Pate pate;
    protected Sauce sauce;
    protected Legumes legumes [];
    protected Fromage fromage;
    protected Poivrons poivrons;
    protected Moules moules;

    abstract void preparer();


}
