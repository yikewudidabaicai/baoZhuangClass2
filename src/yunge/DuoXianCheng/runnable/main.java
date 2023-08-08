package yunge.DuoXianCheng.runnable;

public class main {
    public static void main(String[] args) {
        RunnableImpl runnable = new RunnableImpl();
        //命名线程名字方式一
        Thread thread1 = new Thread(runnable,"线程1");
        Thread thread2= new Thread(runnable);
        Thread thread3 = new Thread(runnable,"线程3");
        //命名线程名字方式二
        thread2.setName("线程2");

        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+"****************");

        }

        //设置线程优先级 数字越大优先级越高 不是100%抢到
        //1-10 默认为5
//        thread1.setPriority(10);
//        thread2.setPriority(1);
//        thread3.setPriority(5);



        thread1.start();
        thread2.start();
        thread3.start();
        for (int i = 0; i < 1000; i++) {
            System.out.println(i);
        }
    }
}
