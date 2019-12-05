package com.ly.myObjTest;

/**
 * Object类:
 *      超类、基类,所有类的直接或间接父类,位于继承树的最顶层.
 *
 *      任何类,如没有书写extends显示继承某个类,都默认直接继承Object类.
 *      否则为间接继承
 *
 *      Object类中所定义的方法,是所有对象都具备的方法.
 *
 *      Object类型可以存储任何对象.
 *          作为参数,可接受任何对象
 *          作为返回值,可返回任何对象
 *
 *  getClass()方法：
 *          public final Class<?> getClass(){}
 *          返回引用中存储的实际对象类型.
 *          应用：通常用于判断两个引用中实际存储对象类型是否一致.
 *          instanceof用来直接比较两个对象;也可以用==来判断(对象.getClass());
 *  hashCode()方法：
 *          public int hashCode(){}
 *          返回该对象的十六进制的哈希码值。
 *          哈希算法根据对象的地址或字符串或数字计算出来的int类型的数值。
 *          哈希码并不唯一,可保证相同对象返回相同哈希码,尽量保证不同对象返回不同哈希码.
 */
public class MyObj {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.getClass()); //class com.ly.myObjTest.Student

        Object obj = new Object();
        System.out.println(obj.getClass()); //class java.lang.Object

        Object o = new Student();
        System.out.println(o.getClass()); //class com.ly.myObjTest.Student

//        if(s instanceof ){
//
//        }

        if(s.getClass() == o.getClass()){
            System.out.println("都是Student类型");
        }else{
            System.out.println("不是同一种类型");
        }
    }
}
