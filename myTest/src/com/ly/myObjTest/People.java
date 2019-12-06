package com.ly.myObjTest;

import java.util.Objects;

public class People {
    String name;
    int age;
    String sex;
    double salary;
    //构造方法
    public People(String name, int age, String sex, double salary) {
        super();
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.salary = salary;
    }
    //覆盖toString()方法
    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", salary=" + salary +
                '}';
    }
    //覆盖equals()方法
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof People)) return false;
        People people = (People) o;
        return age == people.age &&
                Double.compare(people.salary, salary) == 0 &&
                Objects.equals(name, people.name) &&
                Objects.equals(sex, people.sex);
    }
    //覆盖hashCode()方法
    @Override
    public int hashCode() {
        return Objects.hash(name, age, sex, salary);
    }
}
