package com.ly.setTest;


import java.util.HashSet;

/**
 * Set 子接口
 *     特点：无序、无下标、元素不可重复
 *     方法：全部继承自Collection中的方法
 *     实现类：
 *          HashSet【重点】：
 *              基于HashCode实现元素不重复。首先通过比较元素哈希码值，如果相同则调用equals方法进行比较。
 *              所以，对象中不仅要重写equals方法，还要重写HashCode方法。
 *              当存入元素的哈希码值相同时，会调用equals方法进行确认，如果为true，则拒绝后者存入。
 *              相同对象返回相同哈希码，不同对象尽量返回不同哈希码（有小几率返回相同哈希码值）。
 */
public class SetTest1 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>();
        set.add("Hello ");
        set.add("World");
        set.add("!");
//        System.out.println(set.size()); //3
//        for (String str: set) {
//            System.out.println(str); //Hello ! World 无序的
//        }
        Student1 s1 = new Student1("tom",20,"boy",99D);
        Student1 s2 = new Student1("jack",21,"boy",97D);
        Student1 s3 = new Student1("marry",22,"girl",99D);
        Student1 s4 = new Student1("jenny",20,"girl",99D);
        Student1 s5 = new Student1("jenny",20,"girl",99D);
        /*排除重复对象，先通过hashcode值进行比较，hash码的值相同时调用重写的equals方法比较
        * equals 触发条件是哈希码值相同
        * 哈希码不同，要调用equals方法进行比较，需要重写hashcode()方法
        * */
        HashSet<Student1> set1 = new HashSet<Student1>();
        set1.add(s1);
        set1.add(s2);
        set1.add(s3);
        set1.add(s4);
        set1.add(s1);//插入重复对象（地址重复）
        set1.add(s5);//插入重复对象（地址不同，内容相同）
        for (Student1 stu:set1) {
            System.out.println(stu); //没有重复元素，结果为s1~s4的值
        }
        System.out.println(s4.equals(s5)); //true 这是因为我们在Student1对象中重写了equals方法
        System.out.println(s4.hashCode()); //-363843813
        System.out.println(s5.hashCode()); //-363843813
    }
}
