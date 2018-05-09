package com.demo.design.pattern.factory.simple;

/**
 * Author:   dengkp
 * Date:     2018/5/8 11:57
 * Description: test
 * Since: 1.0
 */
public class Test {
    @org.junit.Test
    public void test() {
        Fruit apple = new SimpleFactory().createFruit(1);
        apple.eat();
    }
}
