package yunge.DuoXianCheng.XianChengTongXin;

/**
 * 测试类
 */
public class Demo {
    public static void main(String[] args) {
        //等待唤醒案例
        BaoZi bz = new BaoZi();
        //创建生产者和消费者线程类对象，并且传入同一个包子类对象作为共同资源
        ChiHuo ch = new ChiHuo("吃货",bz);
        BaoZiPu bzp = new BaoZiPu("包子铺",bz);

        ch.start();
        bzp.start();
    }
}