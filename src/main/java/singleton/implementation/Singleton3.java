package singleton.implementation;

import java.util.Objects;

/**
 * Created by Armel on 07/09/2020.
 */
public class Singleton3 {

    private static Singleton3 uniqueInstance = new Singleton3();

    private Singleton3() {

    }

    public static Singleton3 getInstance() {
        return uniqueInstance;
    }
}
