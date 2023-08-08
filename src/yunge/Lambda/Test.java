package yunge.Lambda;

import javax.sound.midi.Soundbank;
import java.net.Socket;

/**
 *Lambda表达式使用前提
 *有一个接口
 *接口中有且仅有一个抽象方法
 */
public class Test {
    public static void main(String[] args) {
        //匿名内部类
        IambdaInterface a = new IambdaInterface() {
            @Override
            public void say() {
                System.out.println("匿名内部类");
            }
        };
        a.say();


        //进阶
        //(形式参数) -> { 代码块 }
        IambdaInterface a2 = ()-> {System.out.println("进阶版");};

        a2.say();

       //简写
       IambdaInterface a3 = ()->System.out.println("lambda简写");

       a3.say();

       //方法参数推理

        test1(()-> System.out.println("方法参数推理"));

        //单参数
        intfacegarm intfacegarm = (int b)->System.out.println(b);
        intfacegarm.hello(9);
       //单参数简写
        intfacegarm intfacegarm2 = b->System.out.println(b);
        intfacegarm.hello(7);

        //多参数
        /**多参数时候参数的小括号不能省略
         * 参数小括号只有在单参数时候才能省略
         * 当方法体内只有一行代码时候大括号可以省略，
         * 否则大括号不能省略
         * */
        moregaramInterface mm = (String ss,int b) -> System.out.println(ss+b);
        mm.speak("数字是",9);
        //多参数简化
        moregaramInterface mm2 = (ss, b)-> System.out.println(ss+b);
        mm2.speak("数字是",99);

    }

    //方法简化
    public static void test1(IambdaInterface iambdaInterface){
        iambdaInterface.say();
    }

}
