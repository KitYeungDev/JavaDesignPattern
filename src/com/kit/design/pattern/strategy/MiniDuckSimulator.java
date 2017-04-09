package com.kit.design.pattern.strategy;

/**
 * Simulator
 *
 * @author Kit.Yeung
 * @create 2017-04-09 下午 9:19
 */


public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRockPowered());
        model.performFly();
    }
}
