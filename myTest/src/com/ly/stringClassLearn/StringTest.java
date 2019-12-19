package com.ly.stringClassLearn;
/**
 * String 类
 *      字符串是常量，创建之后不可改变
 *      字符串字面值存储在字符串池中，可以共享
 *      String s = "hello"；产生一个对象，字符串池中存储.
 *      String s = new String("hello");产生两个对象，堆、池各存储一个
 *  常用方法：
 *      public char charAt(int index);根据下标获取字符
 *      public boolean contains(String str);判断当前字符串中是否包含str
 *      public char[] toCharArray();将字符串转换成数组.
 *      public int indexOf(String str);查找str首次出现的下标，存在则返回该下标；不存在则返回-1.
 *      public int lastIndexOf(String str);查找字符串中最后一次出现的下标索引.
 *      public int length();返回字符串的长度
 *      public String trim();去掉字符串前后的空格
 *      public String toUpperCase();将小写转成大写
 *      public String toLowerCase();将大写转为小写
 *      public boolean endWith(String str);判断字符串是否以str结尾
 *      public boolean startsWith(String str);判断字符串是否以str开头
 *      public String replace (char OldChar,char newChar);将旧字符串替换成新字符串
 *      public String[] split(String str);根据str作拆分
 */
public class StringTest {
    public static void main(String[] args) {
        String s = "hello";
        //先在池中开辟空间存储"abc",再在堆中开辟空间存储"abc",最后定义变量接收堆中数据
        String s1 = new String("hello");
        System.out.println(s == s1); //false
        System.out.println("hello".equals(s)); //true

        //常用方法
        String s2 = "helloWorld!";
        System.out.println(s2.charAt(5)); //W
        System.out.println(s2.contains("hello")); //true
        //将字符串转换成数组
        char[] arr = s2.toCharArray();
        for (char arr1:arr) {
            System.out.print(arr1+" "); //h	e	l	l	o	W	o	r	l	d	!
        }
        System.out.println("");
        //找下标
        System.out.println(s2.indexOf("d")); //9
        System.out.println(s2.indexOf("O")); //-1
        System.out.println(s2.indexOf("llo")); //2
        System.out.println(s2.indexOf("l",4)); //8 ,'l'从下标4开始查
        //查找字符串中最后一次出现的下标索引
        System.out.println(s2.lastIndexOf("l")); //8
        System.out.println(s2.length()); //字符串长度11
        String s3 = "   hello    world    ";
        //去掉前后空格
        System.out.println(s3.trim()); //hello    world
        //大小写转化
        System.out.println(s2.toUpperCase());//大写
        System.out.println(s2.toLowerCase());//小写
        //忽略大小写
        String s4 = s2.toUpperCase();
        System.out.println(s2.equals(s4)); //false
        System.out.println(s2.equalsIgnoreCase(s4)); //true
        //判断字符串是否以str结尾
        String filename = "hello.java";
        System.out.println(filename.endsWith(".java")); //true
        System.out.println(filename.startsWith("hello")); //true 判断字符串是否以str开头
        //替换
        System.out.println(filename.replace(".java",".class")); //hello.class
        //分割字符串
        String s5 = "hello,world,hi,marry";
        String[] s6= s5.split(",");
        for (String arr1:s6) {
            System.out.println(arr1);
        }
        //substring截取字符串
        System.out.println(filename.substring(3)); //lo.java --从下标为3的字符开始截取
        System.out.println(filename.substring(3,7));//lo.j 前闭后开
    }
}
