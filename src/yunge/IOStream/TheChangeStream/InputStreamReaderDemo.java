package yunge.IOStream.TheChangeStream;

import java.io.*;

/**
 * 转换流
 * 是从字节流到字符流的桥梁。
 * 它读取字节，并使用指定的字符集将其解码为字符。
 * 它的字符集可以由名称指定，也可以接受平台的默认字符集。
 * idea默认字符集 utf-8
 */
public class InputStreamReaderDemo {
    public static void main(String[] args) throws IOException {
        //使用方法和字节流一样，但可以指定编码方式
        InputStreamReader isr = new InputStreamReader(new FileInputStream(new File("D:\\book\\滕王阁序.txt")),"utf8");
        int read = isr.read();

        System.out.println((char) read);

    }
}
