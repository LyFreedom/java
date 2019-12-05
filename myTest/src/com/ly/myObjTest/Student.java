package com.ly.myObjTest;

public class Student {
    String name;
    int age;
    String sex;
    double salary;

//    public Student(String name, int age, String sex, double salary) {
//        super();
//        this.name = name;
//        this.age = age;
//        this.sex = sex;
//        this.salary = salary;
//    }

    @Override
    public String toString() {
        return "Student{" + "name='" + name + '\'' + ", age=" + age + ", sex='" + sex + '\'' +
                ", salary=" + salary +
                '}';
    }
}
