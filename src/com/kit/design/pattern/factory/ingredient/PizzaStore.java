package com.kit.design.pattern.factory.ingredient;

import com.kit.design.pattern.factory.method.Pizza;

/**
 * Created by chent on 2017/9/24.
 */
public abstract class PizzaStore {

    public com.kit.design.pattern.factory.ingredient.Pizza orderPizza(String type) {
        com.kit.design.pattern.factory.ingredient.Pizza pizza;

        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    abstract com.kit.design.pattern.factory.ingredient.Pizza createPizza(String type);
}
