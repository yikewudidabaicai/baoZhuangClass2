package yunge.IOStream.ByteStream;

import java.io.*;

/**
 *
 */
public class CopyFileDemo {
    public static void main(String[] args) throws IOException {

    copy();

    }

    public static void copy() throws IOException {
        /******创建输入流和输出流*****/
        InputStream inputStream = new FileInputStream(new File("D://book/滕王阁序.txt"));
        OutputStream outputStream = new FileOutputStream(new File("D://book/经典/滕王阁序2.txt"));
        /****用字节输入输出流 一次读写一个字节复制文件***/
          int read = inputStream.read();
            while (read!=-1){
                outputStream.write((char)read);
                read = inputStream.read();
            }
            inputStream.close();
        outputStream.close();


        /****用字节输入输出流 一次读写一个字节数组复制文件***/
        File file2 = new File("D://book/滕王阁序.txt");
        InputStream inputStream2 = new FileInputStream(file2);
        OutputStream OutputStream2 = new FileOutputStream(new File("D://book/小说/滕王阁序2.txt"));

        byte[] bytes = new byte[1024];
        int read1;
        while ((read1 = inputStream2.read(bytes)) != -1) {
            String s = new String(bytes, 0, read1);
            OutputStream2.write(bytes,0,read1);
        }
        inputStream2.close();
        OutputStream2.close();
    }
}
