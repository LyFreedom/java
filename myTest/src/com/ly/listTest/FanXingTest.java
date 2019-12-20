package com.ly.listTest;

import java.util.ArrayList;

/**
 * 泛型集合：
 *      概念：参数化类型、类型安全的集合，强制集合元素的类型必须一致。
 *      特点：编译即可检查，而非运行时抛出异常。
 *           访问时，不必类型转化（拆箱）。
 *           不同泛型之间引用不能相互赋值，泛型不存在多态。
 */
public class FanXingTest {
    public static void main(String[] args) {
        ArrayList<Employee> arrayList = new ArrayList<Employee>();
        arrayList.add(new Employee("张三",25,2550.0,"开发","1994-03-26"));
//        for (int i = 0; i < arrayList.size(); i++) {
//            System.out.println(arrayList.get(i).getName());
//        }
        MyStaticClass.method(123); //class java.lang.Integer
        MyStaticClass.method(123.0); //class java.lang.Double
        //MyStaticClass.method("hello"); //class java.lang.String
    }
}
