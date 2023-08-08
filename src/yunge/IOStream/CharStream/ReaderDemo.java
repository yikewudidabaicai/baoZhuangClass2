package yunge.IOStream.CharStream;

import java.io.*;

/**
 * 字符输入流
 */
public class ReaderDemo {
    public static void main(String[] args) throws IOException {
        /****创建一个字符输入流对象**/
        Reader reader = new FileReader(new File("D://book/滕王阁序.txt"));

        int read = reader.read();
        System.out.println((char) read);


        /*****一次读取一个字符数组*****/
        System.out.println("********换行符占两个字符*************");
        char[] chars = new char[5];
        int read1 = reader.read(chars);
        System.out.println(new String(chars));

    }
}
