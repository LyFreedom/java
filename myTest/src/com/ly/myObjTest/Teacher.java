package com.ly.myObjTest;

public class Teacher {
    String name = "Hello World!";

    @Override
    public String toString(){
        return name;
        //return this.getClass().getName() + "#" +Integer.toHexString(this.hashCode());
    }
}
