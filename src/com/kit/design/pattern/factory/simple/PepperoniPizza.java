package com.kit.design.pattern.factory.simple;

/**
 * Created by chent on 2017/9/24.
 */
public class PepperoniPizza extends Pizza {
    @Override
    void prepare() {
        System.out.println("prepare Pepperoni Pizza ... ");
    }

    @Override
    void bake() {
        System.out.println("bake Pepperoni Pizza ... ");
    }

    @Override
    void cut() {
        System.out.println("cut Pepperoni Pizza ... ");
    }

    @Override
    void box() {
        System.out.println("box Pepperoni Pizza ... ");
    }
}
