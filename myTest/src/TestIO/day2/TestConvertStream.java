package TestIO.day2;

import java.io.*;

/**
 * 字符节点流：
 *      桥转换流：InputStreamReader/OutputStreamWriter
 *          可将字节流转换为字符流。
 *          可设置字符的编码方式。
 * 使用步骤：
 *      创建节点流
 *      创建过滤流,设置字符编码集
 *      封装过滤流
 *      读写数据
 *      关闭流
 */
public class TestConvertStream {
    public static void main(String[] args) throws IOException {
        //原来持有字节输出流
        OutputStream os = new FileOutputStream("src\\TestIO\\day2\\abc.txt");
        //转换为字符输出流
        OutputStreamWriter osw = new OutputStreamWriter(os,"GBK"); //设置编码方式
        //再包装一层
        PrintWriter pw = new PrintWriter(osw);
        pw.println("hello");
        pw.println("world");
        pw.println("你好");
        pw.println("世界");
        pw.close();
        System.out.println("-------------------------------------------------------");
        InputStream is = new FileInputStream("src\\TestIO\\day2\\abc.txt");
        InputStreamReader isr = new InputStreamReader(is,"GBK"); //设置解码方式
        BufferedReader br = new BufferedReader(isr);
        while (true){
            String s = br.readLine();
            if(s == null) break;
            System.out.println(s);
        }
    }
}
