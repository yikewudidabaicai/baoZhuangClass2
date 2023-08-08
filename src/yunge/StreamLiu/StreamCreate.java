package yunge.StreamLiu;

import java.util.*;
import java.util.stream.Stream;

/**
 * 获取stream流的三种方法
 */
public class StreamCreate {
    public static void main(String[] args) {
        //Collection体系的集合可以使用默认方法stream()生成流
        List<String> list = new ArrayList<String>();
        Stream<String> listStream = list.stream();

        Set<String> set = new HashSet<String>();
        Stream<String> setStream = set.stream();

        //Map体系的集合间接的生成流
        //Map集合没有Stream流方法
        //在获取集合对象时可以获取集合对象的流
        Map<String,Integer> map = new HashMap<String, Integer>();
        Stream<String> keyStream = map.keySet().stream();
        Stream<Integer> valueStream = map.values().stream();
        Stream<Map.Entry<String, Integer>> entryStream = map.entrySet().stream();


        //数组可以通过Stream.of(Array)来获取流
        int[] nums = {1,2,6,8,5,7,3};
        Stream<int[]> nums1 = Stream.of(nums);
        //或者直接输入
        Stream nums2 = Stream.of(4,6,7,2,3,6,9,0,7);




    }

}
