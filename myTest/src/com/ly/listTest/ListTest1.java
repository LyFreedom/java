package com.ly.listTest;

import java.util.ArrayList;

/**
 * 集合框架(Collection)
 * 什么是集合？
 * 概念：对象的容器，存储对象的随想，可代替数组
 * 特点：容器的工具类，定义了对多个对象进行操作的常用方法。
 * 位置：java.util.*;
 * Collection是该体系结构的根接口，代表一组对象。
 * List接口的特点：有序、有下标、元素可重复
 * <p>
 * Set接口的特点：无序、无下标、元素不能重复。
 * Collection父接口，继承自父类Iterable<E>(所有超级接口)
 * 特点：代表一组任意类型的对象，无序、无下标
 * 方法：boolean add(Object obj) //添加一个对象
 * boolean addAll(Collection c) //将一个集合中的所有对象添加到此集合中
 * void clear() //清空此集合中的所有对象
 * boolean contains(Object o) //检查此集合中是否包含o对象
 * boolean equals(Object o) //比较此集合是否与指定对象相符
 * boolean isEmpty() //判断此集合是否为空
 * boolean remove(Object o) //在此集合中移除o对象
 * int size() //返回此集合中的元素个数
 * Object[] toArray() //将此集合转换成数组
 * List集合
 * 特点：有序、有下标、元素可以重复
 * 方法：void add(int index,Object o) //在index位置插入对象o。
 * boolean addAll(int index,Collection c) //将一个集合中的元素添加到此集合中的index位置
 * Object get(int index); //返回集合中指定位置的元素。
 * List subList(int fromIndex,int toIndex) //返回fromIndex和toIndex之间的集合元素
 * List实现类：
 * ArrayList
 */
public class ListTest1 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
//         list.add("a");
//         System.out.println(list.get(0)); //a
//         list.remove("a");
        list.add("A");
        list.add("B");
        list.add("C");
        list.add(0, "D");
        for (int i = 0; i < list.size(); i++) {
            //System.out.println(list.get(i));//D A B C
        }
//        list.clear();//清空list集合
//        System.out.println(list.size()); //0
        Object[] obj = list.toArray();
        for (int i = 0; i < obj.length; i++) {
            System.out.println(obj[i]);
        }
    }

}
