package com.kit.design.pattern.factory.method;

/**
 * Created by chent on 2017/9/24.
 */
public class NYStylePepperoniPizza extends Pizza {
    public NYStylePepperoniPizza() {
        name = "NY Style Sauce and Pepperoni Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara  Sauce";

        toppings.add("Grated Pepperoni");
    }
}
