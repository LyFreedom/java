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
 *          返回该对象的十进制的哈希码值。
 *          哈希算法根据对象的地址或字符串或数字计算出来的int类型的数值。
 *          哈希码并不唯一,可保证相同对象返回相同哈希码,尽量保证不同对象返回不同哈希码.
 *  toString()方法
 *          public String toString(){}
 *          返回该对象的字符串表示（表现形式）
 *          可以根据程序需求覆盖该方法，如：展示对象各个属性值
 *  equals()方法
 *          public boolean equals(Object obj){}
 *          默认实现为(this == obj),比较两个对象地址是否相同。
 *          可进行覆盖，比较两个对象的内容是否相同
 */
public class MyObj {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.getClass()); //class com.ly.myObjTest.Student
        System.out.println(s);  //重写toString，打印对象的属性值

        Object obj = new Object();
        System.out.println(obj.getClass()); //class java.lang.Object

        Object o = new Student();
        System.out.println(o.getClass()); //class com.ly.myObjTest.Student

        if(s instanceof Student){
            System.out.println("s是Student类型");
        }
        if (obj instanceof Object){
            System.out.println("s是Object类型");
        }

        if(s.getClass() == o.getClass()){
            System.out.println("s和o都是Student类型");
        }else{
            System.out.println("不是同一种类型");
        }

        System.out.println("----------------------------");

        for (int i = 0; i < 5; i++) {
            Object object = new Object();
            //object.hashCode()是十进制的哈希码值,object是十六进制内存地址
            System.out.println(object.hashCode()+"\t"+object);
        }
        //toString()方法
        System.out.println("------------------------------");
        System.out.println(o.toString());
        Object o1 = new Teacher();
        System.out.println(o1.getClass().getName());  //对象名称
        System.out.println(Integer.toHexString(o1.hashCode())); //十进制转十六进制
        System.out.println(o1); //重写toString（）方法后，打印对象输出的是重写的返回值Hello World!
        //equals()方法
        System.out.println("------------------------------");
        Object o2 = new Object();
        System.out.println(o1.equals(o2)); //封装成方法可被覆盖,可人为干预
        System.out.println(o1 == o2); //无法人为干预,,虽然equals()底层也是这样实现
        System.out.println("------------------------------");
        //两个地址不同,而内容相同的对象(可以进行比较)
        People people1 = new People("tom",20,"man",2000);
        People people2 = new People("tom",20,"man",2000);
        System.out.println(people1.equals(people2));
        System.out.println(people1.hashCode() + "----" + people2.hashCode());
        System.out.println(people1.toString());
        System.out.println(people1.equals(people2));
    }
}
