package yunge.IOStream.ObjectStream;

import java.io.Serializable;

/**
 * serialVersionUID 指定序列化编号，防止该类被修改时识别不到文件中已经序列化的对象
 * transient或者Static 修饰变量或者方法则该方法或者成员变量不会被序列化
 *
 */
public class Student implements Serializable {
    private String name;
    private static int age;
    private int sex;
    private static final  long serialVersionUID = 1l;
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
