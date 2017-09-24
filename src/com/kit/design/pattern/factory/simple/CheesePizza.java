package com.kit.design.pattern.factory.simple;

/**
 * Created by chent on 2017/9/24.
 */
public class CheesePizza extends Pizza {

    @Override
    void prepare() {
        System.out.println("prepare Cheese Pizza ... ");
    }

    @Override
    void bake() {
        System.out.println("bake Cheese Pizza ... ");
    }

    @Override
    void cut() {
        System.out.println("cut Cheese Pizza ... ");
    }

    @Override
    void box() {
        System.out.println("box Cheese Pizza ... ");
    }
}
