package yunge.IOStream.ByteStream;

import java.io.*;
import java.util.Arrays;

/****
 * 字节流不要读中文，否则会乱码
 */
public class InputStreamDemo {

    public static void main(String[] args) throws IOException {

        //test1();//一次读取一个字节

        test2();//一次读取一个字节数组
    }
    public static void test1() throws IOException {
        /*****************使用字节输入流读取文件中的内容**********************/
        //创建字节输入流
        InputStream inputStream = new FileInputStream(new File("D:\\book\\帮助说明.txt"));

        int read = inputStream.read();

        /*********一次读一个字节***/
        while (read!=-1){
            System.out.print((char) read);
            read = inputStream.read();
        }
        //关闭流
        inputStream.close();

    }
    public static void test2() throws IOException {
        /*********一次读一个字节数组***/
        InputStream inputStream = new FileInputStream(new File("D:\\book\\帮助说明.txt"));

        byte[] bytes = new byte[18];

        int read1 = inputStream.read(bytes);

        while (read1!=-1){
            String s = new String(bytes,0,read1);
            System.out.print(s);
            read1 = inputStream.read(bytes);
        }

    }

}
