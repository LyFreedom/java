package TestIO.day2;
import java.io.*;

/**
 * 字符过滤流：
 *      缓冲流:BufferedWriter/BufferedReader
 *          支持输入换行符。
 *          可一次写一行、读一行。
 *      PrintWriter:
 *          封装了print() / println()方法,支持写入后换行.
 *
 */
public class BufferedWriterAndReaderTest {
    public static void main(String[] args) throws IOException {
        //写
        Writer fw = new FileWriter("src\\TestIO\\day2\\b.txt");
        //BufferedWriter bw = new BufferedWriter(fw);
        //bw.newLine(); //换行
        //bw.write("helloWorld");
        PrintWriter pw = new PrintWriter(fw);
        pw.println("Hello"); //写入后换行
        pw.println("World");
        pw.flush();

        //读
        Reader fr = new FileReader("src\\TestIO\\day2\\b.txt");
        BufferedReader br = new BufferedReader(fr);
        while (true){
            String s = br.readLine();
            if (s == null){
                break;
            }
            System.out.println(s);
        }
    }
}
