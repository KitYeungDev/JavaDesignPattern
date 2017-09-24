package com.kit.design.pattern.factory.method;

/**
 * Created by chent on 2017/9/24.
 */
public class NYStyleCheesePizza extends Pizza {
    public NYStyleCheesePizza() {
        name = "NY Style Sauce and Cheese Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara  Sauce";

        toppings.add("Grated Reggiano Cheese");
    }
}
