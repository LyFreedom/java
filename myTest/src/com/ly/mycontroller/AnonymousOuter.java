package com.ly.mycontroller;

import com.ly.demo.Teacher;

/**
 * 匿名内部类：
 *          没有类名的局部内部类（一切特征都与局部内部类相同）
 *          必须继承一个父类或者实现一个接口
 *          定义类,实现类,创建对象的语法合并,只能创建一个该类的对象
 *      优点：减少代码量
 *      缺点：可读性差
 */
public class AnonymousOuter {
    public static Teacher getTeacher(int num){
        Teacher teacher = null;
        if(num % 2 != 0){
            teacher = new Teacher() {
                @Override
                public void teach() {
                    System.out.println("大牛老师在上课...");
                }
            };
        }else{
            teacher = new Teacher() {
                @Override
                public void teach() {
                    System.out.println("初级老师在上课");
                }
            };
        }
        return teacher;
    }
}
