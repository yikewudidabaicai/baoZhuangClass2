package yunge.DuoXianCheng.synchronizedDemo.lock;

public class DicLock extends Thread {

    private boolean flag;
    public DicLock(boolean flag){
        this.flag = flag;
    }

    @Override
    public void run() {
        if(flag){
            synchronized (MyLock.objA){
                System.out.println("if objA");
                synchronized (MyLock.objB){
                    System.out.println("if objB");
                }
            }
        }else{
            synchronized (MyLock.objB){
                System.out.println("else objB");
                synchronized (MyLock.objA){
                    System.out.println("if objA");
                }
            }

        }
    }
}