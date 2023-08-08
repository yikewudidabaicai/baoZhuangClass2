package yunge.IOStream.ByteStream;

import java.io.*;

/**
 * 字节输出流
 *
 */
public class OutputStreamDemo {
    public static void main(String[] args) throws IOException {
        test1();//一次写入一个字节

    }

    public static void test1() throws IOException {
        //输出流创建对象时，，文件可以新建 但是路径不会 如果路径不存在则会报错FileNotFoundException
        OutputStream outputStream = new FileOutputStream(new File("D://book/output.txt"));

        outputStream.write(97);

        outputStream.flush();//刷新缓冲区

        outputStream.close();


    }


}
