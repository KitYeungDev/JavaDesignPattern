package com.kit.design.pattern.strategy;

/**
 * hwo to fly for duck which can fly
 *
 * @author Kit.Yeung
 * @create 2017-04-09 下午 9:00
 */


public class FlyWithWings implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("I can fly with wings!");
    }
}
