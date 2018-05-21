package com.demo.design.pattern.sign;

/**
 * Author:   dengkp
 * Date:     2018/5/9 16:20
 * Description: test
 * Since: 1.0
 */
public class Test {

    private static Test test;

    private Test() {
    }

    private Test getInstance() {
        if (test == null) {
            synchronized (Test.class) {
                test = new Test();
            }
        }
        return test;
    }
}
