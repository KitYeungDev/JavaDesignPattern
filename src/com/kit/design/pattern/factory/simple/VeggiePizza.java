package com.kit.design.pattern.factory.simple;

/**
 * Created by chent on 2017/9/24.
 */
public class VeggiePizza extends Pizza {
    @Override
    void prepare() {
        System.out.println("prepare Veggie Pizza ... ");
    }

    @Override
    void bake() {
        System.out.println("bake Veggie Pizza ... ");
    }

    @Override
    void cut() {
        System.out.println("cut Veggie Pizza ... ");
    }

    @Override
    void box() {
        System.out.println("box Veggie Pizza ... ");
    }
}
