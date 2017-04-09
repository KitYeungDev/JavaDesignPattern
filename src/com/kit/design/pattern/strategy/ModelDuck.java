package com.kit.design.pattern.strategy;

/**
 * implement model duck
 *
 * @author Kit.Yeung
 * @create 2017-04-09 下午 9:23
 */


public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I am a model duck");
    }
}
