package com.kit.design.pattern.decorator;

/**
 * Created by devkit on 17-5-30.
 */
public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        beverage = new Mocha(beverage);
        beverage = new Mocha(beverage);
        System.out.println(beverage.getDescription()
         + " $" + beverage.cost());
    }
}
