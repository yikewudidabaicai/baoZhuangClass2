package yunge.Collertion;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;

/**
 * 单列集合测试类
 */
public class CollectionDemo {
    public static void main(String[] args) {
        /**
         * 集合长度可变 数组长度不可变
         * 数组中需要存同一种类型的值，但是集合中可以存储任意引用数据类型的值
         * 集合的分类：   单列集合collection(提供所有单列集合的通用功能的模式)，                   双列集合map
         *              List                   Set                       **

         */
        //创建一个单列集合
        Collection coll = new ArrayList<>();

        //集合中添加数据
        coll.add("ABC");
        coll.add(true);

        coll.add(new Date());

        //返回集合中的元素个数
        System.out.println("集合的元素个数是："+coll.size());
        coll.add("bcd");
        coll.add("哈哈");
        System.out.println("集合的元素个数是："+coll.size());

        //允许将其他集合中的内容全部放进当前集合中
        Collection coll2 = new ArrayList<>();
        coll2.add("123");
        coll2.add(456);

        coll.addAll(coll2);//将其他集合中的内容全部放进当前集合中
        System.out.println("添加coll2后集合的元素个数是："+coll.size());

        //删除集合中的元素

        System.out.println("移除元素是否成功？"+coll.remove("哈哈"));
        System.out.println("移除后集合的元素个数是："+coll.size());
            //移除多个
        System.out.println("删除**交**集是否成功？"+coll.removeAll(coll2));
        System.out.println("移除后集合的元素个数是："+coll.size());
    /*************集合中的内容展示*************/
        /**********迭代器*****************/
        Iterator iterator = coll.iterator();
        //遍历
            while (iterator.hasNext()){
                System.out.print(iterator.next()+"//");
            }


        System.out.println("\n检测集合中是否有指定内容：ABC--"+coll.contains("ABC"));



    }
}
