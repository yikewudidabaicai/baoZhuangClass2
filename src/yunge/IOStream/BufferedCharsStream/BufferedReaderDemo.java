package yunge.IOStream.BufferedCharsStream;

import java.io.*;

/**
 * 字符缓冲流
 */
public class BufferedReaderDemo {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(new File("D://book/滕王阁序.txt")));

        //一次读一个字符数组
        char[] chars = new char[1024];
        int len=0;
        while ((len = br.read(chars)) != -1){
            System.out.println(new String(chars,0,len));
        }
        br.close();
        BufferedReader br2 = new BufferedReader(new FileReader(new File("D://book/滕王阁序.txt")));

        String s ;
        /****特有方法 一次读一行****/
        //一次读一行
        while ((s = br2.readLine() )!= null){
            System.out.println(s);
        }

    }


}
