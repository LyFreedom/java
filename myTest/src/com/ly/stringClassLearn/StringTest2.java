package com.ly.stringClassLearn;

/**
 * 可变字符串
 *      StringBuffer:可变字符串,JDK1.0提供,运行效率慢、线程安全。
 *          字符串都是常量,他们的值在创建之后不能更改,字符串缓冲区支持可变的字符串.因为String对象是不可变的，所以可以共享。
 *          线程安全的可变字符字符序列，一个类似于String的字符串缓冲区，但不能修改。虽然在任意时间点上他都包含某种特定的字符
 *          序列，但通过某些方法调用可以改变该序列的长度和内容。
 *      StringBuilder:可变长字符串,JDK5.0提供,运行效率快、线程不安全.
 */
public class StringTest2 {
    public static void main(String[] args) {
        //从始至终都是一个对象,如果需要频繁的追加则选择StringBuffer更好一点。
        StringBuffer stringBuffer = new StringBuffer(); //初始容量是16个,可以扩容
        stringBuffer.append("hello");
        stringBuffer.append("World");
        System.out.println(stringBuffer); //helloWorld
        System.out.println(appendEnds("13892153995"));
    }
    //获取邮箱名方法
    public static String appendEnds(String emailName){
        StringBuffer buffer = new StringBuffer(emailName);
        buffer.append("@163.com");
        return buffer.toString();
    }
}
