package TestIO.day1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @program: myTest
 * @description: 输入流
 * @author: liu yao
 * @create: 2020-01-14 17:40
 */
public class FileInputStreamTest {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("src\\TestIO\\day1\\target.txt");
//            int a = fis.read(); //读取文件中的一个字节
//            System.out.println((char) a);
            //一次读一个
            /*while (true){
                int m = fis.read();
                if(m == -1){
                    break;
                }
                System.out.println((char)m);
            }*/
            //一次读一组字节
            byte[] cache = new byte[4];  //创建了一个长度为4的数组，作为了读取时的缓存
            while (true){
                int count = fis.read(cache);//读到的字节个数，每读取一次填满数组。(最后一次可能无法满足)
                if (count == -1){
                    break;
                }
                for (int i = 0; i < count; i++) {
                    System.out.print((char)cache[i]);
                }
                System.out.println();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
