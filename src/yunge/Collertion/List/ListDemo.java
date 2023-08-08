package yunge.Collertion.List;

import java.util.*;

/**
 * 有序集合 提供一套下标，可以通过下标对集合进行操作
 * List集合具有下标属性，可以根据下标插入或者删除数据,,y
 *
 */
public class ListDemo {
    public static void main(String[] args) {
        List list = new ArrayList<>();//创建一个List集合
        System.out.println("根据下标进行元素添加：");
        list.add(0,"张三");//不能在越界位置添加元素 否则会索引越界异常indexOutOfBoundsException
        list.add(1,"李四");
        list.add(0,"王五");
        System.out.println("遍历集合：");
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }

        System.out.println("把指定集合中的内容添加到当前集合的指定下标位置：");
        List li = new ArrayList();
        li.add("赵六");
        li.add("田七");

        list.add(1,li);
        System.out.println("重新遍历集合：");
        iterator = list.iterator();//集合更新时 迭代器也要同步更新
        while (iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }

        list.addAll(1,li);
        System.out.println("重新遍历集合：");
        iterator = list.iterator();//集合更新时 迭代器也要同步更新
        while (iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }


        /*****************修改元素*************************/
        System.out.println("根据下标修改指定位置的元素：");
        list.set(3,"诚实");
        System.out.println("重新遍历集合：");
        iterator = list.iterator();//集合更新时 迭代器也要同步更新
        while (iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }

        /*****************删除元素*************************/
        System.out.println("根据下标删除指定位置的元素：");
        list.remove(1);
        System.out.println("重新遍历集合：");
        iterator = list.iterator();//集合更新时 迭代器也要同步更新
        while (iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
        /*****************获取元素************************/
        System.out.print("\n根据下标获取元素：");
        Object o = list.get(2);
        System.out.println(o);
        /**所以也可以使用For循环遍历***/
        System.out.print("\nfor循环遍历：");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
        /**所以也可以使用增强For循环遍历***/
        System.out.print("增强for循环遍历：");
        for (Object o1 : list) {
            System.out.print(o1+" ");
        }
        System.out.println();

        /***把集合转为数组***/
        System.out.println("把集合转为数组:");
        Object[] objects = list.toArray();
        System.out.println(Arrays.toString(objects));



    }
}
