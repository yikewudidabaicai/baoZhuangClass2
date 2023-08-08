package yunge.IOStream.BufferedBytesStream;

import java.io.*;

/***
 * 字节缓冲输入流
 * 缓冲流,也叫高效流
 * 创建流对象时，会创建一个内置的默认大小的缓冲区数组，通过缓冲区读写，减少系统IO次数，从而提高读写的效率。
 * 默认缓冲长度为8192
 */
public class BufferedInputStreamDemo {
    public static void main(String[] args) throws IOException {
        //8192是默认缓冲区的字节缓冲数组的长度
        //BufferedInputStream bis = new BufferedInputStream(new FileInputStream(new File("C:\\Users\\aq\\Videos\\Captures\\地下城与勇士.mp4")));
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(new File("D://book/滕王阁序.txt")));

        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(new File("D://book/漫画/滕王阁序.txt")));

        byte[] bytes = new byte[1024];
        int len;
        while ((len = bis.read(bytes)) != -1){
            System.out.println(new String(bytes,0,len));
            bos.write(bytes,0,len);
        }
        bis.close();
        bos.close();






    }


}
