package yunge.DuoXianCheng;

public class VolatileDemo {
    //volatile关键字，可以保证线程之间变量的可见性
    private volatile static int num = 0;
    public static void main(String[] args) throws InterruptedException {
        new Thread(new Runnable(){
            public void run(){
                while(num==0) { //此处不要编写代码
                }
            }
        }).start();
        Thread.sleep(1000);
        //对num值进行修改，上面的线程中的while(num==0)能看到的修改的值吗，
        // 如果能看到while是可以停止的，如果不能看到while不一直运行
        num = 1;
    }
}

