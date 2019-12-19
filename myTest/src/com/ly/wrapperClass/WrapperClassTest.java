package com.ly.wrapperClass;

/**
 * Byte Short Integer Long Float Double
 * 都具有将自身类型的对象，转换成其他6种基本类型的方法
 *
 * 8种包装类提供不同类型间的转换方式：
 *     parseXXX()静态方法
 *     valueOf()静态方法
 *
 *  注意：需保证类型兼容，否则抛出NumberFormatException异常
 *  JDK 5.0之后,自动装箱、拆箱。基本数据类型和包装类自动转换.
 */
public class WrapperClassTest {
    public static void main(String[] args) {
//        WrapperClass1 wc = new WrapperClass1((byte) 10);
//        System.out.println(wc);
//        Object object = new Byte((byte)20);
        Short s = new Short("10");
        System.out.println(s.byteValue());  //10
        System.out.println(s.shortValue()); //10
        System.out.println(s.intValue()); //10
        System.out.println(s.longValue()); //10
        System.out.println(s.floatValue()); //10.0
        System.out.println(s.doubleValue()); //10.0

        //将字符串转成byte
        byte b1 = Byte.parseByte("123");
        byte b2 = new Byte("123").byteValue();

        //字符串转Byte
        Byte b3 = Byte.valueOf((byte) 123);
        Byte b4 = new Byte("123");
        //将字符串转换成int
        int i1 = Integer.parseInt("123");
        int i2 = new Integer("123").intValue();

        //自动装箱，拆箱
        Byte b = 10; //自动装箱
        byte b5 = b; //自动拆箱

        m(100);  //100
    }

    public static void m(Object o){
        System.out.println(o);
    }
}
