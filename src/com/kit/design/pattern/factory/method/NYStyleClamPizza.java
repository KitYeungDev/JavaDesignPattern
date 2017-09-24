package com.kit.design.pattern.factory.method;

/**
 * Created by chent on 2017/9/24.
 */
public class NYStyleClamPizza extends Pizza {
    public NYStyleClamPizza() {
        name = "NY Style Sauce and Clam Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara  Sauce";

        toppings.add("Grated Clam");
    }
}
