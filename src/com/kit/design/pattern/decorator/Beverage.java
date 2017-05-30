package com.kit.design.pattern.decorator;

/**
 * Created by devkit on 17-5-30.
 * an abstract beverage class
 */
public abstract class Beverage {
    String description = "Unknow Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
