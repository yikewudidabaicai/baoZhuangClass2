package yunge.FileDemo;

import java.io.File;

/**
 * 打印指定目录下的所有文件以及目录
 */
public class PrintAllFileDeno {
    public static void main(String[] args) {
        File file = new File("D://book");

        test1(file);
        System.out.println(test2(3));

    }
    public static void test1(File file){
        File[] files = file.listFiles();
        for (File f : files) {
            System.out.println(f.getAbsolutePath());
            if(f.isDirectory()){
                test1(f);
            }
        }
    }


    public static int test2(int i){
      if(i == 1){
          return 1;
      }
      return test2(i-1)+i;
    }



}
