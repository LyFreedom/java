package FilesAbout;

import java.io.File;
import java.io.FileFilter;

public class TestShowAllFiles {
    static int count = 0;
    public static void main(String[] args) {
        File file = new File("F:\\");
        showAll(file);
        System.out.println(count);
    }
    /**
     * 定义一个方法,访问一个文件夹中的所有.bak文件
     */
    public static void showAll(File dir){
        //获取dir所代表的"F盘"中,所有的文件夹+所有的.bak文件
        File[] files = dir.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                if (pathname.isDirectory()){
                    return true;
                }
                if(pathname.isFile()){
                    if (pathname.getName().endsWith(".bak")){
                        return true;
                    }
                }
                return false;
            }
        });
        if(files != null){
            for (File file :files){
                if(file.isFile()){
                    count++;
                    System.out.println(file.getAbsoluteFile());
                }else {
                    //递归查找所有文件夹中的所有.bak文件
                    showAll(file);
                }
            }
        }
    }
}
