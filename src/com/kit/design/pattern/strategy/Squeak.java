package com.kit.design.pattern.strategy;

/**
 * @author Kit.Yeung
 * @create 2017-05-22 下午 9:08
 */


public class Squeak implements QuackBehavior{

    @Override
    public void quack() {
        System.out.println("Squeak ...");
    }
}
