package yunge.FanShe;

import java.lang.reflect.Field;

public class Test {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        String s = "abc";
        Class aClass = s.getClass();
        System.out.println(s.hashCode());
       /* Field[] declaredFields = aClass.getDeclaredFields();
        System.out.println(declaredFields.length);
        for (Field f :
                declaredFields) {
            System.out.println(f);
        }*/
        Field value = aClass.getDeclaredField("value");
        value.setAccessible(true);
        value.set(s,"abcd".getBytes());
        System.out.println(s.hashCode());



    }
}
