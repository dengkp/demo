package com.demo.design.pattern.factory.simple;

/**
 * Author:   dengkp
 * Date:     2018/5/8 11:54
 * Description: simple factory
 * Since: 1.0
 */
public class SimpleFactory {

    private final int apple_type = 1;
    private final int banana_type = 2;

    public Fruit createFruit(int type) {
        switch (type) {
            case apple_type:
                return new Apple();
            case banana_type:
                return new Banana();

        }
        return null;
    }
}
