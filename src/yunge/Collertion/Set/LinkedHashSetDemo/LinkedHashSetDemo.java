package yunge.Collertion.Set.LinkedHashSetDemo;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * 底层链表+哈希表结果，会根据元素的插入顺序进行排序
 * 可以记录元素插入顺序
 * 基本操作功能和单列结合Connection的基本操作
 *
 */
public class LinkedHashSetDemo {
    public static void main(String[] args) {
        Set st = new LinkedHashSet<>();
        st.add("赵六");
        st.add("张三");
        st.add("李四");
        st.add("王五");
        for (Object s:
             st) {
            System.out.println(s);
        }

    }
}
