package strategie.implementations.vol;

import strategie.interfaces.ComportementVol;

/**
 * Created by Armel on 15/04/2020.
 */
public class NePasVoler implements ComportementVol {
    public void voler() {
        System.out.println("Je ne vole pas");
    }
}
