package yunge.DuoXianCheng.synchronizedDemo;

/**
 *
 */
public class RunnableImpl2 implements Runnable {
    public int  ticket = 1000;
    private Object obj = new Object();
    @Override
    public void run() {
        while (true) {
            if (ticket < 1) {
                System.out.println(Thread.currentThread().getName()+"没票了");
                break;
            }
            saleTicket();
        }
    }
    //同步方法
    public synchronized void saleTicket(){
        if(ticket>=1) {
            System.out.println("第" + ticket + "张票在" + Thread.currentThread().getName() + "被卖出");
            ticket--;
        }
    }

}
