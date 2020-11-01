package singleton.implementation;

import java.util.Objects;

/**
 * Created by Armel on 07/09/2020.
 */
public class Singleton2 {
    private static Singleton2 uniqueInstance;

    private Singleton2() {
    }

    public static synchronized Singleton2 getInstance() {
        if (Objects.isNull(uniqueInstance)) {
            uniqueInstance = new Singleton2();
        }

        return uniqueInstance;
    }
}
