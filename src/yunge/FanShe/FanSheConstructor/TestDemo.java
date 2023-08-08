package yunge.FanShe.FanSheConstructor;

import java.lang.reflect.Constructor;

public class TestDemo {
    public static void main(String[] args) throws Exception{
        //获取字节码文件对象
        Class c = Class.forName("yunge.FanShe.FanSheConstructor.Person");

        //获取所有的构造方法 包括私有共有，无参多参
        Constructor[] c1 = c.getDeclaredConstructors();
        for (Constructor s: c1) {
            System.out.println(s);
        }
        System.out.println(c1.length);

        //获取public修饰的所有构造方法
        Constructor[] c2 = c.getConstructors();//获取public修饰的构造
        for(Constructor cc : c2 ){
            System.out.println(cc);
        }
        System.out.println(c2.length);

        //获取单个构造方法
        Constructor con = c.getConstructor();


        //相当于 Person p = new Person();
        Object obj = con.newInstance();//运行构造方法
        System.out.println(obj);

        //获取带参构造方法
        System.out.println("***********获取带多参构造方法**********");
        Constructor con2 = c.getConstructor(String.class , int.class , String.class);
        System.out.println(con);
        Object obj2 = con2.newInstance("江一燕", 33 ,"上海");
        System.out.println(obj2);

        System.out.println("***********获取带**私有的**单参构造方法**********");
        Constructor con3 = c.getDeclaredConstructor(String.class);
        System.out.println(con3);
        con3.setAccessible(true);//暴力获取
        Object obj3 = con3.newInstance("往往阿维奈");
        System.out.println(obj3);




    }
}
