package yunge.FanShe.FanShegetFields;

import yunge.FanShe.FanSheMethods.Person;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class FanShegetFields {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        Class c = Class.forName("yunge.FanShe.FanSheMethods.Person");
        //获取共有的无参构造方法
        Constructor constructor = c.getConstructor();
        //运行构造方法 返回对象


        //获取全部public成员变量
        System.out.println("获取全部public成员变量");
        Field[] fields = c.getFields();
        for (Field s : fields) {
            System.out.println(s);
        }
        //获取全部的变量 包括私有的 默认的等
        System.out.println("获取全部的变量 包括私有的 默认的等");
        Field[] declaredFields = c.getDeclaredFields();
        for (Field s : declaredFields) {
            //获取变量的名字
            String name = s.getName();
            System.out.println(name);
            System.out.println(s);
        }


        //获取一个对象
        Object person1 = constructor.newInstance();
        System.out.println(person1);
        Person person2 = new Person("name",26,"南阳");
        System.out.println(person2);
        //获取私有成员变量
        Field declaredField = c.getDeclaredField("name");
        //修改权限
        declaredField.setAccessible(true);
        //强制修改对象的内容
        declaredField.set(person1,"张大彪");
        declaredField.set(person2,"王苗条");
        //
        System.out.println(person1);
        System.out.println(person2);


    }
}
