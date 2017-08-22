package com.lft.secretgarden.rpc;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by liufeitian on 16/9/29.
 */
public class RPCInvocationHandler implements InvocationHandler {

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        method.invoke(proxy,args);
        return null;
    }
}
