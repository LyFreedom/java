package com.ly.listTest;

import java.util.ArrayList;
import java.util.Vector;

/**
 * ArrayList[重点]:
 *      数组结构实现，查询快、增删慢；
 *      JDK1.2版本，运行效率快、线程不安全。
 * Vector:
 *      数组结构实现，查询快，增删慢
 *      JDK1.0版本，运行效率慢、线程安全
 * LinkedList:
 *      链表结构实现，增删快，查询慢.
 *      链表可以不是空间连续的，只有前后二者关联，和空间位置无关
 *
 * ArrayList 和 LinkedList之间的相同和不同点：
 *      ArrayList必须开辟连续空间，查询快，增删慢。
 *      LinkedList无需开辟连续空间，查询慢，增删快
 */
public class TestArrayList {
    public static void main(String[] args) {
        //无参构造，jdk1.6时默认分配10个空间，jdk1.7后改为0，根据实际插入的值分配空间
        ArrayList scores = new ArrayList();
        scores.add(99D);
        scores.add(95D);
        scores.add(96D);
        scores.add(98D);
        scores.add(97D);
        double sum = 0;
        for (int i = 0; i < scores.size(); i++) {
            sum += (double)scores.get(i);
        }
        System.out.println(sum); //485.0
        Vector vector = new Vector();
        vector.add("a");   //加了synchronized关键字，线程安全
        vector.add("bc");
        System.out.println(vector.get(1)); //bc
    }
}
