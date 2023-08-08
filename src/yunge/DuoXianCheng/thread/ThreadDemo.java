package yunge.DuoXianCheng.thread;

/**
 * 方式一，继承Thread类
 * 方式二，实现Runnable接口
 */
public class ThreadDemo extends Thread{
    //继承Thread类并重写run方法
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            //getName()方法获取当前线程的名称
            System.out.println(this.getName()+":" +i);
        }
    }
    public ThreadDemo() {
    }
    public ThreadDemo(String name) {
        super(name);
    }
}
