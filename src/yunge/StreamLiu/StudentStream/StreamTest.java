package yunge.StreamLiu.StudentStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest {
    public static void main(String[] args) {
        test();

    }

    public static void test(){
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(1,"张三","男",24));
        students.add(new Student(2,"悟空","男",19));
        students.add(new Student(3,"八戒","女",18));
        students.add(new Student(4,"沙是僧","男",26));
        students.add(new Student(5,"唐二僧","女",30));

        //遍历展示男性，年龄大于23
        students.stream().filter(s->s.getSex().equals("男")).filter(s->s.getAge()>23).forEach(System.out::println);

        //筛选名字长度是三个字的人
        System.out.println("名字是三个字的学生");
        students.stream().filter(s->s.getName().length() ==3).forEach(System.out::println);

        /***********map***************/

        HashMap<String,String> mm = new HashMap<>();
        mm.put("1","张三");
        mm.put("2","王二");
        mm.put("3","例句");
        mm.put("4","赵四");
        mm.put("5","钱五");

        mm.keySet().stream().filter(s->Integer.parseInt(s)>2).forEach(s -> System.out.println(mm.get(s)));

        /*******数组*****/
        Object[] objects = students.toArray();
        Student[] ss = (Student[])objects;
        //先将数组转化为集合
        List<Student> students1 = Arrays.asList(ss);
        //通过集合获取流
        Stream<Student> stream = students.stream();
        //或者利用Stream.of()获取流
        Stream<List<Student>> students11 = Stream.of(students1);
    }
}
