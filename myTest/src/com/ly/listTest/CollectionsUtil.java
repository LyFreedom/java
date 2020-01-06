package com.ly.listTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Collections工具类
 *      概念：集合工具类，定义了除了存取以外的集合常用方法。
 *      方法：public static void reverse(List<?> list) //反转集合中元素的顺序
 *           public static void shuffle(List<?> list) //随机重置集合元素的顺序
 *           public static void sort(List<T> list) //升序排序（元素类型必须实现Comparable接口）
 */
public class CollectionsUtil {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(2);
        list.add(6);
        list.add(5);
        list.add(9);
        list.add(1);
 //       Collections.reverse(list);//反转
//        for (int i = 0; i < list.size(); i++) {
//            System.out.print(list.get(i)+"\t");  //1 9 5 6 2
//        }
//        Collections.shuffle(list);//随机重置元素顺序
//        for (int i = 0; i < list.size(); i++) {
//            System.out.print(list.get(i)+"\t");  //2	1	9	6	5
//        }
        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+"\t");  //1	2	5	6	9
        }
        List<Student> list1 = new ArrayList<Student>();
        Student student = new Student();
        student.setName("张三");
        student.setAge(25);
        student.setSex("男");
        student.setScores(150.0);
        list1.add(student);
        System.out.println(list1.get(0)); //Student{name='张三', age=25, sex='男', scores=150.0}
    }
}
