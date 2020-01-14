package TestIO.day1;

import java.io.*;

/**
 * 字节过滤流：
 *      缓冲流：BufferedOutputStream/BufferedInputStream
 *          提高IO效率,减少访问磁盘的次数;
 *          数据存储在缓冲区中,flush是将缓存区的内容写入文件中，也可以直接close.
 *          程序-write('A')->缓冲区(A)--flush()或close()->目标文件
 */
public class BufferedOutputStreamTest {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        BufferedOutputStream bos = null;
        FileInputStream fis = null;
        BufferedInputStream bis = null;
        try {
            fos = new FileOutputStream("src\\TestIO\\day1\\buffer.txt"); //节点流
            bos = new BufferedOutputStream(fos); //过滤流
            bos.write('A');
            bos.write('B');
            bos.write('C');
            bos.write('D');
            bos.flush();//刷新缓冲(将缓冲中的数据,一次性写入文件中，并清空缓冲区)
            fis = new FileInputStream("src\\TestIO\\day1\\buffer.txt");
            byte[] cache = new byte[4];
            while (true){
                int count = fis.read(cache);
                if (count == -1){
                    break;
                }
                for (int i = 0; i < count; i++) {
                    System.out.print(cache[i]+"\t");
                }
                System.out.println();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bos.close();//级联执行flush()
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
