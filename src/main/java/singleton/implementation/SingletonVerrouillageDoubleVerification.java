package singleton.implementation;

import java.util.Objects;

/**
 * Created by Armel on 07/09/2020.
 */
public class SingletonVerrouillageDoubleVerification {

    private volatile static SingletonVerrouillageDoubleVerification uniqueInstance;

    private SingletonVerrouillageDoubleVerification() {

    }

    public static SingletonVerrouillageDoubleVerification getInstance() {

        if (Objects.isNull(uniqueInstance)) {
            synchronized (SingletonVerrouillageDoubleVerification.class){
                if (Objects.isNull(uniqueInstance)) {
                    uniqueInstance = new SingletonVerrouillageDoubleVerification();
                }
            }
        }
        return uniqueInstance;
    }
}
