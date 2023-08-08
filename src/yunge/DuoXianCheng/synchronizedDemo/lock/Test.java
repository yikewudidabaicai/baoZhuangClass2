package yunge.DuoXianCheng.synchronizedDemo.lock;

public class Test {
    public static void main(String[] args) {

        DicLock d1 = new DicLock(true);
        d1.start();

        DicLock d2 = new DicLock(false);
        d2.start();
    }
}