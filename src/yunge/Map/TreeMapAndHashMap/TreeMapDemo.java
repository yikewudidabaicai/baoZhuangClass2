package yunge.Map.TreeMapAndHashMap;

import java.util.Map;
import java.util.TreeMap;

/**
 * 基于红黑树的数据结构 按照对象对比值的大小顺序存储
 *
 *tree里边的键不允许存入null值  原因是要通过键进行比较排序
 */
public class TreeMapDemo {
    public static void main(String[] args) {
        Map map =  new TreeMap<>();
            //map.put(null,"1");//键不可以为空
            map.put("1",null);//值可以为空
        System.out.println(map);

    }
}
