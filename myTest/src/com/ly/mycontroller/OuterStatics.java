package com.ly.mycontroller;

/**
 * 静态内部类：
 *      不依赖外部类对象,可直接创建或通过类名访问,可声明静态成员
 *      只能直接访问外部类的静态成员（实例成员需实例化外部类对象）,如果外部类中定义的变量不是静态的,
 *      则静态内部类中的方法不能直接访问
 * 额外比成员内部类多了一个定义的内容（静态属性和静态方法）
 */
public class OuterStatics {
    static int b = 25;

    static class Inners{
        static  String field = "hello world!";
        int a = 20;
        public void m2(){
            System.out.println("OuterStatics.m2()----"+"a:"+a+",b:"+b);
        }

        public static void m3(){
            System.out.println("OuterStatics.m3()----");
        }
    }

    static void m1(){
        System.out.println("OuterStatics.m1()---- ");
    }
}
