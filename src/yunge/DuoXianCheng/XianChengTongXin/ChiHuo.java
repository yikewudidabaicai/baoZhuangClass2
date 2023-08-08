package yunge.DuoXianCheng.XianChengTongXin;

/**
 * 吃货线程类（消费者）
 */
public class ChiHuo extends Thread{
    private BaoZi bz;
    public ChiHuo(String name, BaoZi bz){
        super(name);
        this.bz = bz;
    }
    @Override
    public void run() {
        while(true){
            //同步，以包子类对象作为锁，保证锁统一
            synchronized (bz){

                if(bz.flag == false){
                    try {
                        //没有包子则等待
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //true 表示有包子则吃包子
                System.out.println("吃货正在吃"+bz.pier+bz.xianer+"包子");
                //消费完了修改标记false,表示没有数据
                bz.flag = false;
                //唤醒生产者线程
                bz.notify();
            }
        }
    }
}