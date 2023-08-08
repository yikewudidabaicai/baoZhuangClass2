package yunge.GenericDemo.Demo1;

import yunge.GenericDemo.Demo1.Demo1;

import java.util.ArrayList;
import java.util.List;

/**
 * 泛型演示 T E K V ?
 */
public class GenericDemo1 {
    public static void main(String[] args) {
        /*******************************/
        Demo1<Integer> demo1 = new Demo1<Integer>();
        demo1.a = 21;
        System.out.println(demo1.a);

        Demo1<String> demo2 = new Demo1<String>();
        demo2.a = "21";
        String b = demo2.test("99");
        System.out.println(b);
        System.out.println(demo2.a);
        /*******************************/
        ArrayList<String> list = new ArrayList<>();
        list.add("hello");
        list.add("hi");
        for (String s :
                list) {
            System.out.println(s);

        }
        /******************问号通配符的使用<?>************************/

        Demo1<? extends List> de = new Demo1<>();//指定为类型为List或者List的子类

        Demo1<? super List> de2 = new Demo1<>();//指定为类型为List或者List的父类


    }
}
