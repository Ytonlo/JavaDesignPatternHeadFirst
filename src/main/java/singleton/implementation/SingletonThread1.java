package singleton.implementation;

/**
 * Created by Armel on 07/09/2020.
 */
public class SingletonThread1 extends Thread {
    @Override
    public void run() {
        super.run();

        Singleton1 singleton1 = Singleton1.getInstance();

    }
}
