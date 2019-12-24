package com.ly.setTest;

import java.util.Objects;

public class Student1 {
    private String name;
    private Integer age;
    private String sex;
    private Double scores;

    public Student1(String name, Integer age, String sex, Double scores) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.scores = scores;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Double getScores() {
        return scores;
    }

    public void setScores(Double scores) {
        this.scores = scores;
    }

    @Override
    public String toString() {
        return "Student1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", scores=" + scores +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student1 student1 = (Student1) o;
        return name.equals(student1.name) &&
                age.equals(student1.age) &&
                sex.equals(student1.sex) &&
                scores.equals(student1.scores);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, sex, scores);
    }
}
