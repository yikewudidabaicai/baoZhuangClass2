package yunge.Collertion.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * 不允许存入重复内容
 */
public class SetDemo {
    public static void main(String[] args) {
        //set集合能使用Collertion集合的所有功能 自身没有扩展功能
        System.out.println("创建set集合");
        Set set = new HashSet();

        System.out.println("存入内容：");
        set.add("张三");
        set.add("张三");//不允许存入重复的内容 第二个不存入
        System.out.println("集合的长度为："+set.size());
        set.add("李四");
        set.add("王五");
        set.add("赵六");

        /**********遍历取值*********/
        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
        System.out.println();
        for (Object s:set) {
            System.out.print(s+" ");
        }
        System.out.println();

    }

}
