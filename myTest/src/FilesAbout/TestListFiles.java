package FilesAbout;

import java.io.File;
import java.io.FileFilter;

public class TestListFiles {
    public static void main(String[] args) {
        //遍历一个目录下的所有文件名称
        File file1 = new File("F:\\");
        String[] fileName = file1.list(); //获取文件夹中所有文件名称（含文件夹）
//        for (String sir:fileName) {
//            System.out.println(sir);
//        }
        //获取文件夹中所有文件名称（含文件夹）对象
        File[] fileName2 = file1.listFiles();
        for (File file: fileName2) {
            //System.out.println(file.getPath());
            if(file.isFile()){
                if(file.getName().endsWith(".bak")){
                    System.out.println(file.getAbsoluteFile());
                }
            }
        }
        //定义过滤对象
        myFilter filter = new myFilter();
        File[] files = file1.listFiles(filter);
        for (File file : files){
            System.out.println(file.getPath());
        }
    }
}


class myFilter implements FileFilter{

    @Override
    public boolean accept(File pathname) {
        if(pathname.isFile()){
            if(pathname.getName().endsWith(".txt")){
                return true;
            }
        }
        return false;
    }
}