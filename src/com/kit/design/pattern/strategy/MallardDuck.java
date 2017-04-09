package com.kit.design.pattern.strategy;

/**
 * MallardDuck
 *
 * @author Kit.Yeung
 * @create 2017-04-09 下午 9:16
 */


public class MallardDuck extends Duck {

    public MallardDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
