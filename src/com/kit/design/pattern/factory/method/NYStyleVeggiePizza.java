package com.kit.design.pattern.factory.method;

/**
 * Created by chent on 2017/9/24.
 */
public class NYStyleVeggiePizza extends Pizza {
    public NYStyleVeggiePizza() {
        name = "NY Style Sauce and Veggie Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara  Sauce";

        toppings.add("Grated Veggie");
    }
}
