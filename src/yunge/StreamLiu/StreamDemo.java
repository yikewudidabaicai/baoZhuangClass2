package yunge.StreamLiu;

import javax.sql.rowset.Predicate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.prefs.Preferences;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();

        Collections.addAll(arrayList,"张三","李四","王五","张小凡","张无忌");
        //循环遍历出姓张的名字
        for (String s:arrayList) {
            if(s.startsWith("张")){
                System.out.println(s);
            }
        }
        //stream流过滤张姓人
        Stream<String> stream = arrayList.stream();
        //返回首个元素
        //过滤
        stream.filter(t -> t.startsWith("张")).forEach(t -> System.out.println(t));

        //查询集合中姓张的前两位limit（2）筛选前两个
        arrayList.stream().filter(t->t.startsWith("张")).limit(2).forEach(System.out::println);

        //成绩集合
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,1,2,88,99,33,66,77);
        list.stream().sorted(Comparator.reverseOrder()).limit(5).forEach(System.out::println);




    }
}
