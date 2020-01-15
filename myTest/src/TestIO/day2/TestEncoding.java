package TestIO.day2;

import java.io.UnsupportedEncodingException;

/**
 * 字符编码：
 *      IS0-8859-1 收录除ASCII外,还包括西欧、希腊语、泰语、阿拉伯语、希伯来语对应的文字符号。
 *      UTF-8  针对Unicode的可变长度字符编码
 *      GB2312 简体中文
 *      GBK    简体中文、扩充
 *      BIG5   台湾，繁体中文
 */
public class TestEncoding {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String s1 = "你好世界123abc";//一个字符是两个子节
        byte[] bs = s1.getBytes("GBK"); //GBK文本转二进制

        String s2 = new String(bs,"GBK"); //二进制转GBK文本
        System.out.println(s2);


    }
}
