package com.kit.design.pattern.factory.method;

/**
 * Created by chent on 2017/9/24.
 */
public class ChicagoStylePepperoniPizza extends Pizza {
    public ChicagoStylePepperoniPizza() {
        name = "Chicago Style Deep Dish Pepperoni Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Grated Pepperoni");
    }
}
