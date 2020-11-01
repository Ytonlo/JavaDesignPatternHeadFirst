package singleton.implementation;

import java.util.Objects;

/**
 * Created by Armel on 07/09/2020.
 */
public class Singleton1 {
    private static Singleton1 uniqueInstance;

    private Singleton1() {
    }

    public static Singleton1 getInstance() {
        if (Objects.isNull(uniqueInstance)) {
            uniqueInstance = new Singleton1();
        }

        return uniqueInstance;
    }
}
