package com.demo.design.pattern.proxy.stati;

import com.demo.design.pattern.proxy.stati.UserDao;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Author:   dengkp
 * Date:     2018/5/8 10:22
 * Description: proxy factory
 * Since: 1.0
 */
public class ProxyFactory {

    private UserDao target;

    public ProxyFactory(UserDao target) {
        this.target = target;
    }

    public Object getTarge() {
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                return method.invoke(target, args);
            }
        });
    }
}
