package org.alasgarov.creationaldesignpatterns.singleton;

public class SingletonLazy {
    private static SingletonLazy INSTANCE;
    private SingletonLazy() {}

    public static SingletonLazy getInstance(){
        if (INSTANCE == null)
            INSTANCE = new SingletonLazy();
        return INSTANCE;
    }
}
