package yunge.DuoXianCheng.synchronizedDemo;

import java.util.Arrays;

/**
 *
 */
public class RunnableImpl implements Runnable {
    public int  ticket = 100;
    private Object obj = new Object();
    @Override
    public void run() {
        while (true){
            //同步代码块加锁
            synchronized (this){
                if(ticket<1) {
                    System.out.println(Thread.currentThread().getName() + "没票了");
                    break;
                }
                System.out.println("第"+ticket+"张票在"+Thread.currentThread().getName()+"被卖出");
                ticket--;
            }
        }
    }
}
