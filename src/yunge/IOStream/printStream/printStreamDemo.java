package yunge.IOStream.printStream;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class printStreamDemo {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter printWriter= new PrintWriter("D://book/滕王阁序.txt");

        printWriter.print("hello");
        printWriter.close();
    }
}
