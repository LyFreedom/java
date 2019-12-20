package com.ly.listTest;

public class Employee {
    private String Name;
    private Integer age;
    private Double salary;
    private String job;
    private String birthDay;

    public Employee(String name, Integer age, Double salary, String job, String birthDay) {
        Name = name;
        this.age = age;
        this.salary = salary;
        this.job = job;
        this.birthDay = birthDay;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Name='" + Name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", job='" + job + '\'' +
                ", birthDay='" + birthDay + '\'' +
                '}';
    }
}
