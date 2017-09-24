package com.kit.design.pattern.factory.method;

/**
 * Created by chent on 2017/9/24.
 */
public class ChicagoStylePizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new ChicagoStyleCheesePizza();
        } else if (item.equals("pepperoni")) {
            return new ChicagoStylePepperoniPizza();
        } else if (item.equals("clam")) {
            return new ChicagoStyleClamPizza();
        } else if (item.equals("veggie")) {
            return new ChicagoStyleVeggiePizza();
        } else return null;
    }
}
