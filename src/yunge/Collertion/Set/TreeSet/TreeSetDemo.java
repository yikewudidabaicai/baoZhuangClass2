package yunge.Collertion.Set.TreeSet;

import java.util.Set;
import java.util.TreeSet;

/**
 * 底层数据结构为树
 * 有顺序   存储的顺序为queals比较的大小顺序 升序排序
 *不能存入空值
 * 不能存入不同的引用类型
 */
public class TreeSetDemo {
    public static void main(String[] args) {
        Set set  = new TreeSet<>();
        /*set.add(1);
        set.add(112);
        set.add(53);
        set.add(3);*/
        set.add("张三");
        set.add("李四");
        set.add("王五");
        set.add("李白");
        //放入即排序
        for (Object s:
                set) {
            System.out.println(s);
        }
    }
}
