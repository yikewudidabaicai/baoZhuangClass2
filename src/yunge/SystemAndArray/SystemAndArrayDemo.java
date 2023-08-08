package yunge.SystemAndArray;

import java.io.PrintStream;
import java.util.Arrays;

public class SystemAndArrayDemo {
    public static void main(String[] args) {
        //testSystem();
        testArray();
    }

    public static void testSystem(){
        //OUt 属性  输出流
        PrintStream stream = System.out;
        stream.println("hello");
        //OUt 属性  错误输出流  表现为红褐色
        //System.err.println("hello");
        long l = System.currentTimeMillis();//获取当前系统时间和(1970年1月1日)之间相差的毫秒数
        System.out.println(l/1000.0/60/60/24/365);
        //运行垃圾回收器
       // System.gc();
    }
    public static void testArray(){
        int[] nums = {21,78,99,45,66};
        int i = Arrays.binarySearch(nums, 66);/**需要排序后再搜索 否则大概率搜索不到该元素)*///
        System.out.println(i);
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.binarySearch(nums, 66));

    }


}
