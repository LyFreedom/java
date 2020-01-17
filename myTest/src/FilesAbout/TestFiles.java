package FilesAbout;

import java.io.File;
import java.io.IOException;

/**
 * File类:
 *      概念：代表物理盘符中的一个文件或者文件夹
 *      方法：
 *          createNewFile() //创建一个新文件
 *          Mkdir()    //创建一个新目录
 *          Delete()   //删除文件或空目录
 *          Exists()   //判断File对象所代表的对象是否存在
 *          getAbsolutePath() //获取文件的绝对路径
 *          getName()        //取得名字
 *          getParent()     //获取文件、目录所在的目录
 *          isDirectory()  //判断是否是目录
 *          isFile()       //是否是文件
 *          length()       //获得文件的长度
 *          listFiles()    //列出目录中的所有内容
 *          renameTo()     //修改文件名为
 */
public class TestFiles {
    public static void main(String[] args) {
//        File file = new File("src\\FilesAbout\\a.txt");
        File file = new File("src\\FilesAbout\\subDir");
//        System.out.println(file.canWrite()); //true:可写入,false:不可写入
//        System.out.println(file.canRead());  //true:可读,false:不可读
//        System.out.println(file.canExecute());//所有可打开的文件,都是可执行的
//        file.delete();
        try {
            if(!file.exists()){
                //file.createNewFile(); //创建文件
                file.mkdir(); //创建文件夹
            }else{
                System.out.println("该文件已存在");
//                System.out.println(file.getName()); //a.txt
//                System.out.println(file.getPath()); //src\FilesAbout\a.txt
//                System.out.println(file.getAbsoluteFile()); //F:\mygithub\java\myTest\src\FilesAbout\a.txt
//                System.out.println(file.getParent()); //src\FilesAbout
//                //获取该文件所在盘符的空间大小
//                System.out.println(file.getTotalSpace()); //296895901696
//                System.out.println(file.getTotalSpace()/1024/1024/1024); //276GB
//                System.out.println(file.getFreeSpace()/1024/1024/1024); //可用254GB
//                System.out.println(file.isHidden()); //是否隐藏文件 false
//                System.out.println(file.isFile()); //true
//                System.out.println(file.isDirectory());//false
//                //获取最后一次修改时间
//                System.out.println((System.currentTimeMillis() - file.lastModified())/1000/60);//41分钟前
//                System.out.println(file.delete()); //true
//                  Thread.sleep(3000);
//                  file.deleteOnExit(); //当虚拟机结束时删除
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

}
