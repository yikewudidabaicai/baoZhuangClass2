package yunge.FanShe.FanSheMethods;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class FanSheMethods {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class c = Class.forName("yunge.FanShe.FanSheMethods.Person");

        //访问所有公共方法
        System.out.println("获取所有自己的包括父亲的公共方法");//// 获取自己的包括父亲的公共方法
        Method[] methods = c.getMethods();
        System.out.println("一共有："+methods.length);
        for (Method m:methods) {
            System.out.println(m.getReturnType()/*获取返回值类型*/+" "+
                    m.getName()/*获取方法名字*/+" "+
                    m.getParameterCount()/*获取方法发参数个数*/
            );
        }
        //获取单个公共对象
        System.out.println("获取单个公共对象");
        Method getString = c.getMethod("getString", String.class, int.class);

        //获取所有的共有和私有方法
        System.out.println("获取所有的共有和私有方法,只获取自身的方法，不获取从父类继承的方法");
        Method[] declaredMethods = c.getDeclaredMethods();
        System.out.println("一共有："+declaredMethods.length);
        for (Method m:declaredMethods) {
            System.out.println(m.getReturnType()/*获取返回值类型*/+" "+
                    m.getName()/*获取方法名字*/+" "+
                    m.getParameterCount()/*获取方法发参数个数*/
            );
        }

        //获取单个共有方法
        Person person = new Person();
        Method method = c.getMethod("method", String.class);
        System.out.println("运行了method方法");
        //指定对象和参数来运行method方法
        method.invoke(person,"Sssss");
        Object sssss = method.invoke(person, "Sssss");
        System.out.println(sssss);


        //获取单个私有共有方法
        Method declaredMethod = c.getDeclaredMethod("function");
        //设置权限 强制执行
        declaredMethod.setAccessible(true);
        Object invoke = declaredMethod.invoke(person);


    }
}
