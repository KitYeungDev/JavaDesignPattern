package com.kit.design.pattern.factory.method;

/**
 * Created by chent on 2017/9/24.
 */
public class ChicagoStyleClamPizza extends Pizza {
    public ChicagoStyleClamPizza() {
        name = "Chicago Style Deep Dish Clam Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Grated Clam");
    }
}
