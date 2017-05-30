package com.kit.design.pattern.decorator;

/**
 * Created by devkit on 17-5-30.
 */
public abstract class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "Expresso";
    }

    @Override
    public double cost() {
        return .89;
    }
}
