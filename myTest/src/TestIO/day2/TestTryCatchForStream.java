package TestIO.day2;

import java.io.*;

public class TestTryCatchForStream {
    public static void main(String[] args) {
        outPutInfo();
        inputInfo();
    }
    public static void outPutInfo(){
        OutputStream os = null;
        BufferedOutputStream bos = null;
        try {
            os = new FileOutputStream("src\\TestIO\\day2\\test.txt");
            bos = new BufferedOutputStream(os);
            bos.write(65);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (os != null){
                    bos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static void inputInfo(){
        InputStream is = null;
        try {
            is = new FileInputStream("src\\TestIO\\day2\\test.txt");
            while (true){
                int n = is.read();
                if(n == -1){
                    break;
                }
                System.out.println((char)n);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(is != null){
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
