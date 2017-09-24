package com.kit.design.pattern.singleton;

/**
 * Created by chent on 2017/9/24.
 */
public class Singleton {
    private volatile static Singleton uniqueInstance;

    private Singleton() {}

    public  static Singleton getInstance() {
        if (uniqueInstance == null) {
            synchronized (Singleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }
}
