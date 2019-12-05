package com.ly.mycontroller;

/**
 * 内部类与常用类
 *   内部类：成员内部类,静态内部类,局部内部类,匿名内部类
 *   概念：在一个类的内部再定义一个完整的类
 *   特点：编译之后可生成独立的字节码文件;
 *        内部类可直接访问外部类的私有成员,而不破坏封装;
 *        可为外部类提供必要的内部功能组件;
 *
 */
public class ObjTest {
    public static void main(String[] args) {
        /******************成员内部类*************************************/
        //成员内部类
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner(); //成员内部类对象的创建(必须依赖外部类对象),注意语法
        System.out.println(inner.b);
        inner.m2();  //内部类可以直接访问外部类对象中的属性和方法,当外部类、内部类存在重名属性时,会优先访问内部类属性
        System.out.println("-------------------------------------");
        /******************静态内部类**************************************/
        //静态内部类
        OuterStatics in = new OuterStatics();
        System.out.println(OuterStatics.b); //外部类静态属性
        OuterStatics.m1(); //外部类静态方法
        //创建静态内部类对象时，可以直接通过完整名称进行创建
        OuterStatics.Inners inn = new OuterStatics.Inners(); //静态内部类的创建,不依赖外部类的对象
        inn.m2();
        //通过外部类名.内部类类名.内部类的静态属性,来访问内部类中的静态变量
        System.out.println(OuterStatics.Inners.field);
        OuterStatics.Inners.m3(); //直接访问静态内部类的静态方法
        System.out.println("-------------------------------------");
        /***********************局部内部类**********************************/
        PartOuter partOuter = new PartOuter();
        partOuter.m1();
        /***********************匿名内部类**********************************/
        System.out.println("-------------------------------------");
        AnonymousOuter.getTeacher(3).teach();
    }
}
