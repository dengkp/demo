package com.demo.design.pattern.proxy.stati;

/**
 * Author:   dengkp
 * Date:     2018/5/8 11:26
 * Description: user
 * Since: 1.0
 */
public class User implements UserDao {

    @Override
    public void save() {
        System.out.println(" user");
    }
}