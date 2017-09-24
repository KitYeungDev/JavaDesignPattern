package com.kit.design.pattern.factory.simple;

/**
 * Created by chent on 2017/9/24.
 */
public class ClamPizza extends Pizza {
    @Override
    void prepare() {
        System.out.println("prepare Clam Pizza ... ");
    }

    @Override
    void bake() {
        System.out.println("bake Clam Pizza ... ");
    }

    @Override
    void cut() {
        System.out.println("cut Clam Pizza ... ");
    }

    @Override
    void box() {
        System.out.println("box Clam Pizza ... ");
    }
}
