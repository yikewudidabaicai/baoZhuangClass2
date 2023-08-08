package yunge.IOStream.ObjectStream;

import java.io.*;
import java.util.ArrayList;

/**
 * 序列化流
 * 把对象以流的形式进行流化，存储或者在网络中转输        对象 --- 流数据
 */
public class ObjectOutputStreamDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student student1 = new Student("张三", 21);
        Student student2 = new Student("李四", 22);
        ArrayList<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);

        FileOutputStream fileOutputStream = new FileOutputStream("D://BOOK/Students.josn");
        // 创建序列化流对象
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        //将学生集合对象序列化到文件中
        objectOutputStream.writeObject(students);
        //关闭资源
        objectOutputStream.close();
        /*FileInputStream fis = new FileInputStream("D://BOOK/Students.josn");
        ObjectInputStream ois = new ObjectInputStream(fis);

        Object o = ois.readObject();
        System.out.println(((Student)o).getName());
        Object o2 = ois.readObject();
        System.out.println(o2);*/


    }
}
