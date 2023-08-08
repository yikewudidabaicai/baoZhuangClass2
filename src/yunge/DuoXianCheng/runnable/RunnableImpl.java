package yunge.DuoXianCheng.runnable;

import java.util.concurrent.locks.Lock;

public class RunnableImpl implements Runnable{
    public int num=100;
    String s = new String("0");

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            synchronized (s){
                /*try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }*/
                num--;
                //runnable实现类中获取线程名字的方法为Thread.currentThread().getName()
                System.out.println(Thread.currentThread().getName()+":"+num);
                //让出cpu资源
                Thread.yield();//线程礼让，让多个线程尽量均匀的分配到资源
            }
            }
    }
}
