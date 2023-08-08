package yunge.DuoXianCheng.synchronizedDemo;

/**
 *
 */
public class Test {
    public static void main(String[] args) {
        RunnableImpl runnable = new RunnableImpl();
        Thread thread1 = new Thread(runnable,"一号窗口");
        Thread thread2 = new Thread(runnable,"二号窗口");
        Thread thread3 = new Thread(runnable,"三号窗口");

        thread1.start();
        thread2.start();
        thread3.start();

    }
}
