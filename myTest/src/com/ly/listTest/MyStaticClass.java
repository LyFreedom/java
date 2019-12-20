package com.ly.listTest;

/**
 * 静态泛型
 */
public class MyStaticClass {
    public static <T extends Number> void method(T t){
        System.out.println(t.getClass());
    }
}
