package yunge.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 双列集合
 *
 */
public class MapDemo {
    public static void main(String[] args) {
        /**************创建Map集合* new一个实现类对象************************/
        Map map = new HashMap();//使用父类接收  测试通用功能能


        /**************了解相关操作*********************/
        //添加内容
        map.put("name","张三");//键值都可以为任何数据类型
        map.put("sex","男");
        Map map2 = new HashMap();

        map2.putAll(map);//快速添加 将map集合内容全部添加到map2中
        //查看内容
        System.out.println(map);
        System.out.println(map2);


        /****************修改内容**put中key不能重复，一旦重读则会覆盖原本内容******************/
    System.out.println("修改内容也使用put方法：");
        map.put("name","李四");
        System.out.println("修改后的内容为"+ map);

        /**********删除内容*****************/
        System.out.print("根据键名进行内容删除，将会返回对应的value值：");
        System.out.println(map.remove("name"));
        System.out.print("根据键值对进行内容删除，将会返回是否删除成功：");
        System.out.println(map.remove("sex", "男"));

        /*********查询************/
        System.out.print("查询集合中的键值对数量:");
        System.out.println(map2.size());

        System.out.print("根据键名获取值：");
        System.out.println(map2.get("name"));

        System.out.print("获取当前集合中的所有键名：");
        System.out.println(map2.keySet());

        System.out.print("获取集合中的所有值：");
        System.out.println(map2.values());

        System.out.print("获取所有的键值对：");
        //方法一
        Set set = map2.keySet();
        for (Object key: set) {
            System.out.printf( key+"="+map2.get(key)+" ");
        }
        //方法二
        System.out.println();
        System.out.print("方法二：");
        Set<Map.Entry> set1 = map2.entrySet();//返回键值对类型的set集合
        for (Map.Entry e : set1) {
            e.getKey();
            e.getValue();//Entry提供get方法获取key,value
            System.out.print(e+" ");
        }
        System.out.println();

        System.out.print("检查当前map中是否包含指定的键："+map2.containsKey("name"));
        System.out.println();
        System.out.print("检查当前map中是否包含指定的值："+map2.containsValue("张三"));

    }
}
