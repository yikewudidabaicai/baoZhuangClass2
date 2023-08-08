package yunge.Collertion;

import java.util.*;

/**
 * 单列集合的工具类
 *
 */
public class CollectionsClass {
    public static void main(String[] args) {
        Collection col = new ArrayList<>();
        /****快速给单列集合中添加多个元素***/
        System.out.println("addAll方法将所有指定的集合添加到指定的集合中");
        Collections.addAll(col,"张大彪","王苗条","赵打咩","李二蛋");
        System.out.println(col);

        /*******最大最小值*****/
        List col2 = new ArrayList<>();
        Collections.addAll(col2,1,56,88,19,3,5,67,9);
        System.out.println("根据元素自然顺序给出固定集合中的最大/小元素");
        System.out.println("最大值为"+Collections.max(col2));
        System.out.println("最小值为"+Collections.min(col2));

        /********反转指定列表中的元素顺序*********/
        Collections.reverse(col2);
        System.out.println(col2);

        /********随机打乱集合中的顺序**********/
        Collections.shuffle(col2);
        System.out.println(col2);
        /********元素排序**********/
        Collections.sort(col2);//升序排序
        System.out.println(col2);

        String c [] = {"a", "b", "c"};
        System.out.println(Arrays.toString(c));
    }
}
