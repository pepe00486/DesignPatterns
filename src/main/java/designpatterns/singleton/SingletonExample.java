package designpatterns.singleton;

import java.util.Random;

public class SingletonExample {
    private static SingletonExample instance;
    private final long id;

    private SingletonExample() {
        id = new Random().nextLong();
    }

    public static SingletonExample getInstance() {
        if (instance == null) instance = new SingletonExample();

        return instance;
    }

    public long getId() {
        return id;
    }
}
