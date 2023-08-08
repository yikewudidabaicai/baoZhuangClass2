package yunge.IOStream.CharStream;

import java.awt.image.WritableRaster;
import java.io.*;

/**
 * 字符输出流
 */
public class WriteDemo {
    public static float a;
    public static void main(String[] args) throws IOException {
        //覆盖
        Writer writer = new FileWriter(new File("D://book/滕王阁序.txt"));
        //追加
        Writer writer2 = new FileWriter(new File("D://book/滕王阁序.txt"),true);

        writer.write("中");
        writer.flush();

        writer.write("中");

        writer.write("被");

        //writer.close();//关闭前会自动刷新


        /********一次输出一个字符数组**********/

        String s = "你好啊字符流";
        char[] chars = s.toCharArray();
        writer.write(chars);
        writer.write(chars,1,3);//从1下标开始往后输出三个字符
        writer.write("\n也可以直接写入一个字符串");
        writer.write("\n也可以写入 \n一个字符串的一部分",7,10);
        writer.flush();

        writer.close();
        writer2.close();
        /***未初始化的变量对比*****/
        float b=2;
        System.out.println(Math.max(a, b));
        System.out.println(a);

    }



}
