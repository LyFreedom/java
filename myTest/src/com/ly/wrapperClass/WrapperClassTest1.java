package com.ly.wrapperClass;

public class WrapperClassTest1 {
    public static void main(String[] args) {
        //从长度为256的数组中（-128 ~ 127），取出预先创建好的一个Short对象(此对象代表整数127)
        Short s1 = 127;  //Short@541
        Short s2 = 127;  //Short@541
        //由于此对象不在预先创建Short对象（-128 ~ 127）数组中，因此需要重新创建一个地址，所以地址值发生了变化
        Short s3 = 129;  //Short@542
        Short s4 = 129;  //Short@543
        // '='判断的是地址,equals比较的是对象
        System.out.println(s1 == s2); //true  -128 ~ 127(byte取值范围)
        System.out.println(s3 == s4);  //false   地址不一样了
        System.out.println(s3.equals(s4));//true 同是Short对象

    }
}
