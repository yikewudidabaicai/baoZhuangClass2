package yunge.DuoXianCheng.synchronizedDemo;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Test2 {
    public static void main(String[] args) {
        RunnableImpl2 runnable = new RunnableImpl2();
        Thread thread1 = new Thread(runnable,"一号窗口");
        Thread thread2 = new Thread(runnable,"二号窗口");
        Thread thread3 = new Thread(runnable,"三号窗口");
        thread3.start();
        thread2.start();
        thread1.start();
    }

}
