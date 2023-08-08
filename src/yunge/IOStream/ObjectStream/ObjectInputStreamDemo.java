package yunge.IOStream.ObjectStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * 返序列化：
 * 把文本中的数据据以流的形式进行还原成对象
 * 流数据---对象
 */
public class ObjectInputStreamDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("D://BOOK/Students.josn");
        //创建反序列化流对象
        ObjectInputStream ois = new ObjectInputStream(fis);
        //将文件中的学生集合对象反序列化为学生集合对象arrayList
        Object o = ois.readObject();
        ArrayList arrayList = (ArrayList) o;
        System.out.println(arrayList);
      /*  Object o2 = ois.readObject();
        System.out.println(o2);*/
        fis.close();
    }
}
