package yunge.DuoXianCheng.thread;

/**
 * 测试类
 * 方式一，继承Thread类，并重写run方法
 */
public class main {
    public static void main(String[] args) {
        //创建多个线程类
        ThreadDemo threadDemo1 = new ThreadDemo("线程1");
        ThreadDemo threadDemo2 = new ThreadDemo("线程2");
        ThreadDemo threadDemo3 = new ThreadDemo("线程3");

        //调用.start()方法开启线程
        threadDemo1.start();
        threadDemo2.start();
        threadDemo3.start();

        Demo demo = new Demo();

        demo.start();
    }
}
