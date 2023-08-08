package yunge.FileDemo;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class FileDemo1 {
    public static void main(String[] args) throws IOException {
        //根据文件路径创建File对象
        File file = new File("D://testFile/test.txt");
        file.delete();
        //根据文件夹路径创建File对象
        File file2 = new File("D://testFile/test");
        file2.delete();

        //根据父目录和文件名或者问价夹名来创建对象
        File file3 = new File("D://testFile","test2.txt");

        file3.delete();


        /****************新建文件**************************/
        File file4 = new File("D://testFile/test1","星际争霸.txt");
        System.out.println("创建当前对象里的文件，如果没有相应的父文件夹，则创建");
        file4.createNewFile();


        /*****************************/
        System.out.println("检查该对象是不是文件"+file4.isFile());
        System.out.println("检查该对象是不是文件夹"+file4.isDirectory());

        System.out.println("获取文件的内容的字节长度："+file4.length());

        System.out.println("获取文件名或者文件夹名，"+file4.getName());
        System.out.println("获取文件名或文件夹的父目录的绝对路径"+file4.getParent());

        /***************************************/
        File file1 = new File("D://book/");
        System.out.println("返回目录下的所有文件或者文件夹的String名字对象数组");
        System.out.println(Arrays.toString(file1.list()));
        System.out.println("返回该目录下的所有文件或者文件夹的file对象数组");
        System.out.println(Arrays.toString(file1.listFiles()));


        /**************/
        File file5 = new File("D://book/小说/玄幻");
        System.out.println("只能删除文件或者空目录"+file5.delete());
        file5 = new File("D://book/小说/玄幻/file0.txt");
        System.out.println("只能删除文件或者空目录"+file5.delete());
        file5 = new File("D://book/小说/经典/历史");
        System.out.println("只能删除文件或者空目录"+file5.delete());
        //
    }
}
