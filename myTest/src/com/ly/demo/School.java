package com.ly.demo;

public class School {
    public static Teacher getTeacher(int classNo){
        //局部内部类（隐藏类的信息）
        class BeginnerTeacher implements Teacher{
            @Override
            public void teach() {
                System.out.println("初级老师在上课...");
            }
        }

        class AdvencedTeacher implements Teacher{
            @Override
            public void teach() {
                System.out.println("高级老师在上课...");
            }
        }

        Teacher t = null;
        if(classNo % 2 != 0){
            t = new AdvencedTeacher();
        }else {
            t = new BeginnerTeacher();
        }

        return t;
    }

}
