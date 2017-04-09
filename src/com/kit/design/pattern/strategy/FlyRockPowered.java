package com.kit.design.pattern.strategy;

/**
 * @author Kit.Yeung
 * @create 2017-04-09 下午 9:25
 */


public class FlyRockPowered implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("I am flying with a rocket!");
    }
}
