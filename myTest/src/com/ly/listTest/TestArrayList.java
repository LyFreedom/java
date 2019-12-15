package com.ly.listTest;

import java.util.ArrayList;

/**
 * ArrayList[重点]:
 *      数组结构实现，查询快、增删慢；
 *      JDK1.2版本，运行效率快、线程不安全。
 */
public class TestArrayList {
    public static void main(String[] args) {
        //无参构造，jdk1.6时默认分配10个空间，jdk1.7后改为0给，根据实际插入的值分配空间
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
    }
}
