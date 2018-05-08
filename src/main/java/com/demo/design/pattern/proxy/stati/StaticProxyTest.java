package com.demo.design.pattern.proxy.stati;

/**
 * Author:   dengkp
 * Date:     2018/5/8 10:08
 * Description: proxy TEST
 * Since: 1.0
 */
public class StaticProxyTest {
    public static void main(String[] args) {
        UserDao userDao = new UserProxy(new User());
        userDao.save();
    }
}
