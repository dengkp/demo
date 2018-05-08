package com.demo.design.pattern.proxy.stati;

/**
 * Author:   dengkp
 * Date:     2018/5/8 10:30
 * Description: 动态代理模式
 * Since: 1.0
 */
public class DynamicProxyTest {

    public static void main(String[] args) {
        UserDao user = new User();
        UserDao proxy = (UserDao) new ProxyFactory(user).getTarge();
        proxy.save();
    }
}
