package yunge.Map.TreeMapAndHashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        Map map = new HashMap<>();
        System.out.println("只能有一个空键但是可以有多个空值");
        map.put(null,"1");
        map.put(null,"2");
        map.put(1,null);
        map.put(2,null);
        System.out.println(map);
        /***因为hashSet底层是HashMap 所以hashSet也只能有一个空值**/
    }
}
