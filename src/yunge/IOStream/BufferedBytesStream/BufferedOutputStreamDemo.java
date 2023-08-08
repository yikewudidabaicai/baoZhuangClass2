package yunge.IOStream.BufferedBytesStream;

import java.io.*;

/**
 * 字节缓冲输出流
 */
public class BufferedOutputStreamDemo {
    public static void main(String[] args) throws IOException {
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(new File("D://book/漫画/滕王阁序.txt"),true));

        bos.write(99);
        bos.write(100);
        bos.write(101);
        bos.write(102);

        bos.close();
    }
}
