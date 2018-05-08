package com.demo.design.pattern.proxy.stati;

/**
 * Author:   dengkp
 * Date:     2018/5/8 11:27
 * Description: user proxy
 * Since: 1.0
 */

public class UserProxy implements UserDao {

    private UserDao userDao;

    public UserProxy(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void save() {

        System.out.println("user proxy");
        userDao.save();
    }
}