package com.kit.design.pattern.strategy;

/**
 * Implement quack behavior
 *
 * @author Kit.Yeung
 * @create 2017-04-09 下午 9:03
 */


public class Quack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Quack ...");
    }
}
