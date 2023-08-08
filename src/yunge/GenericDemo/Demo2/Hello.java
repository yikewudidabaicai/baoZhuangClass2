package yunge.GenericDemo.Demo2;

public class Hello <T>{

    /****可变参数方法，可以传入0个或者多个参数的方法***/

    public void speak(T...a){
        System.out.println(a.length);
        for (T s:
             a) {
            System.out.println(s);
        }
        System.out.println("这是可变参方法");
    }
}
