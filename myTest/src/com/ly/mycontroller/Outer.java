package com.ly.mycontroller;

//成员内部类demo
public class Outer {
    private int a = 5;
    /**
     * 成员内部类,依赖外部类对象;
     * 不能脱离外部类对象而独立存在;
     * 当外部类、内部类存在重名属性时,会优先访问内部类属性
     * 成员内部类不能定义静态成员
     */
    class Inner{
        int b = 22;
        int a = 15;
        //内部类可以直接访问外部类对象中的属性和方法
        public void m2(){
            int a = 25; //局部变量
            //访问方法内的同名属性(自身的局部变量)
            System.out.println("inner m2()---"+a);
            //访问成员内部类中的同名属性(内部类中的实例变量)
            System.out.println("inner m2()---"+this.a);
            //成员内部类访问外部类的同名属性(外部类中的实例变量)
            System.out.println("inner m2()---"+Outer.this.a);
        }
    }
}
