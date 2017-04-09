package com.kit.design.pattern.strategy;

/**
 * can not quack
 *
 * @author Kit.Yeung
 * @create 2017-04-09 下午 9:09
 */


public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println(" ... ");
    }
}
