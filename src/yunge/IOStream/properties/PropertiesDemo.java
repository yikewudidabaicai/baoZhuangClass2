package yunge.IOStream.properties;

import yunge.IOStream.ObjectStream.Student;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

/**
 * Properties类的使用
 */
public class PropertiesDemo {
    public static void main(String[] args) throws IOException {
        //创建Properties集合对象
        Properties properties = new Properties();
        properties.setProperty("name","张三");
        properties.setProperty("sex","男");
        properties.setProperty("age","21");
        Student student1 = new Student("李四",20);
        Student student2 = new Student("王五",22);
        properties.put("999",student1.toString());
        properties.put("777",student2.toString());
        properties.store(new FileWriter("D://book/student.properties"),"studentMessage");//studentMessage为解释说明 尽量不要用中文


        properties.load(new FileReader("D://book/student.properties"));
        //System.out.println(properties.get("name"));

        System.out.println("******properties类的特有方法******");
        Object name = properties.get("name");//根据键返回值
        System.out.println("****"+name);
        Set<String> strings = properties.stringPropertyNames();//从该属性列表中返回一个不可修改的键集，其中键及其对应的值是字符串
        System.out.println("打印不可修改的健集");
        for (String s: strings){
            System.out.println("****"+s+"****");
        }


        /***遍历****/
        Set<Object> objects = properties.keySet();
        for (Object o :
                objects) {
            System.out.println(o);
            System.out.println(properties.get(o));
        }


    }
}
