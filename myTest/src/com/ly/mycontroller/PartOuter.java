package com.ly.mycontroller;

/**
 * 局部内部类
 *         定义在外部方法中，作用范围和创建对象范围仅限于当前方法
 *         局部内部类访问外部类当前方法中的局部变量时，因无法保障变量的生命周期与自身相同，变量必须修饰为final
 */
public class PartOuter {
    int a = 20;

    public void m1(){
        System.out.println("这是m1方法。。。");
        final String local = "Hello ";
        String aa = "World!"; //java1.8后隐式的为其修饰了final,所以此时不报错
        //周期：方法使用开始到结束
        class Inner{
            int a = 10;
            public void m3(){
                int a = 30;
                //不加final,也无法对局部变量再次赋值(这里不报错的原因是java1.8之后,隐式的将局部变量修饰为final)
                //如果访问外部类局部变量,则只能访问加final关键字的
                //局部变量local的生命周期可能和局部内部类对象的生命周期不同,加final是要大于局部内部类的生命周期
                System.out.println("这是m3方法。。。" + local + aa);
            }
        }

        Inner in = new Inner();
        in.m3();
    }

    public static void m2(){
        System.out.println("这是静态的m2方法。。。");
    }
}
