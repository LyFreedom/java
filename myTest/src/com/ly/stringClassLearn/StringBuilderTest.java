package com.ly.stringClassLearn;

import java.math.BigDecimal;

/**
 * BigDecimal
 *      位置：java.math包中
 *      作用：精确计算浮点数。
 *      创建方式：BigDecimal bd=new BigDecimal("1.0")
 */
public class StringBuilderTest {
    public static void main(String[] args) {
        String str = "hello";//定义字符串hello
        str += "world"; //将world追加给hello
        //1,创建StringBuilder
        //2,调用append追加的方法
        //3,调用toString转换回string
        //在JDK5.0后会自动进行以上操作,+=在内存中只创建了一个对象，jdk帮我们优化了
        System.out.println(str);
        System.out.println("------------BigDecimal-------------");
        BigDecimal bigDecimal = new BigDecimal("2.23");
        BigDecimal bigDecima2 = new BigDecimal("3.25");

        System.out.println(bigDecimal.add(bigDecima2));
        System.out.println(bigDecimal.subtract(bigDecima2));
        System.out.println(bigDecimal.multiply(bigDecima2));
        //第一个参数是被除数，第二个是保留位数，第三位是四舍五入
        System.out.println(bigDecimal.divide(bigDecima2,2,BigDecimal.ROUND_HALF_UP));
    }
}
