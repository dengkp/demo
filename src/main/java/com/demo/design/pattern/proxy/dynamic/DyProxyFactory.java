package com.demo.design.pattern.proxy.dynamic;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Author:   dengkp
 * Date:     2018/5/8 11:28
 * Description: dynaic proxyFactory
 * Since: 1.0
 */
public class DyProxyFactory implements MethodInterceptor {

    private User user;

    public DyProxyFactory(User user) {
        this.user = user;
    }

    public Object getInstance() {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(user.getClass());
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        return method.invoke(user, objects);
    }
}
