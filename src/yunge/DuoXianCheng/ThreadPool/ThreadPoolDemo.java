package yunge.DuoXianCheng.ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo {
    public static void main(String[] args) {
        Runnable runnable = new Runnable(
        ) {
            @Override
            public void run() {
                System.out.println("我要一个教练");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("教练来了： " + Thread.currentThread().getName());
                System.out.println("教我游泳,交完后，教练回到了游泳池");
            }
        };

        //创建线程池对象
        ExecutorService service = Executors.newFixedThreadPool(2);

        //从线程池获取线程并调用runnable 的run方法
        service.submit(runnable);
        service.submit(runnable);
        service.submit(runnable);


        //关闭线程池
        service.shutdown();




    }
}
