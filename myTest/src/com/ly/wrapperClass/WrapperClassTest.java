package com.ly.wrapperClass;

public class WrapperClassTest {
    public static void main(String[] args) {
        WrapperClass1 wc = new WrapperClass1((byte) 10);
        System.out.println(wc);
        Object object = new Byte((byte)20);
    }
}
