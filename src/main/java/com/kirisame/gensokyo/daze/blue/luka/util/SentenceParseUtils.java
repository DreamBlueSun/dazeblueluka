package com.kirisame.gensokyo.daze.blue.luka.util;

import java.lang.reflect.Method;

/**
 * @description:
 * @auther: MaoHangBin
 * @date: 2019/12/19 11:19
 */

public class SentenceParseUtils<T> {

    /**
     * @param object
     * @param clazz
     * @param methodName
     * @return T
     * @author MaoHangBin
     * @description 反射调用类方法（无参数）
     * @date 2019/12/19 11:21
     **/
    public T parseFunction(Object object, Class clazz, String methodName) {
        try {
            Method method = clazz.getMethod(methodName);
            T invoke = (T) method.invoke(object);
            return invoke;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public T parseFunction(Object object, String className, String methodName) {
        try {
            Class<?> clazz = Class.forName(className);
            Method method = clazz.getMethod(methodName);
            T invoke = (T) method.invoke(object);
            return invoke;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * @param object
     * @param clazz
     * @param methodName
     * @param parameter
     * @return T
     * @author MaoHangBin
     * @description 反射调用类方法（有参数）
     * @date 2019/12/19 15:12
     **/
    public T parseFunction(Object object, Class clazz, String methodName, String parameter) {
        try {
            Method method = clazz.getMethod(methodName, String.class);
            T invoke = (T) method.invoke(object, parameter);
            return invoke;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * @param object
     * @param className
     * @param methodName
     * @param parameters
     * @return T
     * @author MaoHangBin
     * @description 反射调用类方法（有参数）
     * @date 2019/12/19 15:12
     **/
    public T parseFunction(Object object, String className, String methodName, String[] parameters) {
        try {
            Class<?> clazz = Class.forName(className);
            Method method = clazz.getMethod(methodName, String[].class);
            T invoke = (T) method.invoke(object, (Object) parameters);
            return invoke;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
