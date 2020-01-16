package TestIO.day2;

import java.io.*;

/**
 * 字符编码：
 *      IS0-8859-1 收录除ASCII外,还包括西欧、希腊语、泰语、阿拉伯语、希伯来语对应的文字符号。
 *      UTF-8  针对Unicode的可变长度字符编码
 *      GB2312 简体中文
 *      GBK    简体中文、扩充
 *      BIG5   台湾，繁体中文
 * 当编码方式和解码方式不一致时,会出现乱码
 * 字符流：
 *      字符流的父类（抽象类）：
 *      Reader:字符输入流
 *          public int read(){}
 *          public int read(char[] c){}
 *          public int read(char[] b,int off ,int len){}
 *      Writer:字符输出流
 *          public void write(int n){}
 *          public void write(String str){}
 *          public void write(char[] c){}
 *      字符节点流（实现类子类）：
 *          FileWriter:
 *              public void write(String str) //一次写多个字符,将b数组中所有字符,写入输出流
 *          FileReader:
 *              public int read(char[] c) //从流中读取多个字符,将读到内容存入c数组,返回实际读到的字符数;
 *              如果达到文件的尾部,则返回-1.
 */
public class TestEncoding {
    public static void main(String[] args) throws IOException {
        String s1 = "你好世界123abc";//一个字符是两个子节
        byte[] bs = s1.getBytes("GBK"); //GBK文本转二进制(编码)

        String s2 = new String(bs,"GBK"); //二进制转GBK文本(解码)
        //System.out.println(s2);
        Writer fw = new FileWriter("src\\TestIO\\day2\\chars.txt");
        fw.write("HelloWorld");
        fw.flush();
        fw.close();

        Reader fr = new FileReader("src\\TestIO\\day2\\chars.txt");
        char[] cache = new char[5];
        while (true){
            int n = fr.read(cache);
            if (n == -1){
                break;
            }
            for (int i = 0; i <n ; i++) {
                System.out.print(cache[i]+"\t");
            }
            System.out.println();
        }
    }
}
