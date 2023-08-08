package yunge.IOStream.TheChangeStream;

import java.io.*;

/**
 * 根据指定的编码格式将字节输出流改变为字符输出流
 */
public class OutputStreamWriterDemo {

    public static void main(String[] args) throws IOException {
        File file = new File("D:\\book\\滕王阁序22.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(file,true);

        OutputStreamWriter osw = new OutputStreamWriter(fileOutputStream,"gbk");

        osw.write("长大via哦");
        osw.close();



    }
}
