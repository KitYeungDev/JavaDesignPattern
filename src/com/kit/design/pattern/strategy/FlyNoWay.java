package com.kit.design.pattern.strategy;

/**
 * how to fly for duck which can not fly
 *
 * @author Kit.Yeung
 * @create 2017-04-09 下午 9:02
 */


public class FlyNoWay implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("I can't fly!");
    }
}
