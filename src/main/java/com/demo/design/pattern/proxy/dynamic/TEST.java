package com.demo.design.pattern.proxy.dynamic;


import org.junit.Test;

/**
 * Author:   dengkp
 * Date:     2018/5/8 11:12
 * Description: TEST
 * Since: 1.0
 */
public class TEST {

    @Test
    public void test() {
        //目标对象
        User target = new User();

        //代理对象
        User proxy = (User) new DyProxyFactory(target).getInstance();

        //执行代理对象的方法
        proxy.save();
    }
}
