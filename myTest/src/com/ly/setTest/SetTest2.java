package com.ly.setTest;

import java.util.TreeSet;

/**
 * Set实现类
 *    TreeSet
 *          基于排序顺序实现元素不重复
 *          实现了SortedSet接口，对集合元素自动排序。
 *          元素对象的类型必须实现Comparable接口，指定排序规则
 *          通过CompareTo方法确定是否为重复元素
 */
public class SetTest2 {
    public static void main(String[] args) {
//        TreeSet<String> set = new TreeSet<String>();
//        set.add("B");
//        set.add("A");
//        set.add("D");
//        set.add("C");
//        set.add("E");
//        for (String string:set) {
//            System.out.println(string); //A B C D E 不是按插入顺序排，而是对元素自动排序
//        }
        //一组对象，必须是“可比较的”（必须实现java.lang.Comparable接口）
        TreeSet<Student1> student1s = new TreeSet<Student1>();
        student1s.add(new Student1("tom",20,"男",9000D));
        student1s.add(new Student1("jack",22,"女",6000D));
        student1s.add(new Student1("Jerry",25,"男",5000D));
        student1s.add(new Student1("Liming",24,"男",8000D));
        student1s.add(new Student1("Abby",28,"男",8000D));
        //实现compareTo()方法，对学生分数进行升序排列
        //由于按照分数排序，当分数重复时，不允许分数重复的元素
        /**
         * 分数无重复和有重复的输出值（只根据分数比较）：
         * Student1{name='Jerry', age=25, sex='男', scores=5000.0}
         * Student1{name='jack', age=22, sex='女', scores=6000.0}
         * Student1{name='Liming', age=24, sex='男', scores=8000.0}
         * Student1{name='tom', age=20, sex='男', scores=9000.0}
         */
        /**
         * 重写比较每个元素，完全重复的才插不进去（全比）
         * Student1{name='Jerry', age=25, sex='男', scores=5000.0}
         * Student1{name='jack', age=22, sex='女', scores=6000.0}
         * Student1{name='Liming', age=24, sex='男', scores=8000.0}
         * Student1{name='Abby', age=28, sex='男', scores=8000.0}
         * Student1{name='tom', age=20, sex='男', scores=9000.0}
         */
        for (Student1 student1:student1s) {
            System.out.println(student1);
        }
    }
}
