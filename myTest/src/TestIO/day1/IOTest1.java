package TestIO.day1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 什么是流？
 *      概念：内存与存储设备之间传输数据的通道。
 *      流的分类：
 *      按方向【重点】：
 *          输入流：将<存储设备>中的内容读入到<内存>
 *          输出流：将<内存>中的内容写入到<存储设备>中
 *      按单位：
 *          字节流：以字节为单位，可以读写所有数据。一个字节8位。
 *          字符流：以字符为单位，只能读写文本数据。一个字符2字节16位
 *      按功能：
 *          节点流：具有实际传输数据的读写功能
 *          过滤流：在节点流的基础之上增强功能
 * 字节流：
 *      字节流的父类(抽象类)：
 *      InputStream:字节输入流
 *          public int read(){}
 *          public int read(byte[] b){}
 *          public int read(byte[] b,int off,int len){}
 *      OutputStream:字节输出流
 *          public void write(int n){}
 *          public void write(byte[] b){}
 *          public void write(byte[] b,int off,int len){}
 *      字节流的子类：
 *       FileOutputStream:
 *          public void write(byte[] b) //一次写多个字节，将b数组中所有字节，写入输出流
 *       FileInputStream:
 *          public int read(byte[] b) //从流中读取多个字节，将读到内容存入b数组，返回实际读到的字节数；
 *          如果达到文件的尾部，则返回-1。
 */
public class IOTest1 {

    public static void main(String[] args) {
        try {
            //F:\ java中\有转义字符的意思，故F:\\ ,append true追加，false不追加.默认false
            //绝对路径：F:\mygithub\java\myTest\src\TestIO\day1\target.txt
            //相对路径：src\TestIO\day1\target.txt  与上一中形式等价
            FileOutputStream fos = new FileOutputStream("src\\TestIO\\day1\\target.txt",true);
            fos.write(65);
            fos.write(66); //一次输出一个
            fos.write(67);
            byte[] bt = new byte[]{65,66,67,68,69,70};
            fos.write(bt); //一次输出一组字节
            fos.write(bt,1,3); //一次输出一组数据的一部分
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    

}
