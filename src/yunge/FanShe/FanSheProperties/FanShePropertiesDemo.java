package yunge.FanShe.FanSheProperties;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class FanShePropertiesDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //创建输入流对象
        BufferedReader br = new BufferedReader(new FileReader("src\\yunge\\FanShe\\FanSheProperties\\ApplicationConfig.properties"));
        Properties properties = new Properties();
        properties.load(br);

        System.out.println(properties);

        String ClassName = properties.getProperty("ClassName");
        String MethodName = properties.getProperty("MethodName");
        System.out.println(ClassName);
        System.out.println(MethodName);

        //反射获取对象
        Class c = Class.forName(ClassName);
        //获取方法
        Method method = c.getMethod(MethodName);
        //传入对象运行方法
        method.invoke(c.getConstructor().newInstance());

    }
}
