package com.ly.wrapperClass;

/**
 * 什么是包装类？
 *      基本数据类型所对应的引用数据类型
 *      Object可统一所有数据，包装类的默认值是null
 * 包装类对应：
 *      byte --- Byte
 *      short --- Short
 *      int --- Integer
 *      long --- Long
 *      float --- Float
 *      double --- Double
 *      boolean --- Boolean
 *      char --- Character
 * 都有一个共同的父类Number
 */
public class WrapperClass1 {
    private byte value;

    public WrapperClass1(byte value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "WrapperClass1{" +
                "value=" + value +
                '}';
    }
}
