package com.kit.design.pattern.factory.method;

/**
 * Created by chent on 2017/9/24.
 */
public class NYStylePizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new NYStyleCheesePizza();
        } else if (item.equals("pepperoni")) {
            return new NYStylePepperoniPizza();
        } else if (item.equals("clam")) {
            return new NYStyleClamPizza();
        } else if (item.equals("veggie")) {
            return new NYStyleVeggiePizza();
        } else return null;
    }
}
