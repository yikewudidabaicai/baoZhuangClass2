package yunge.DuoXianCheng.XianChengTongXin;

/**
 * 包子铺线程类（生产者）
 */
public class BaoZiPu extends Thread {

    private BaoZi bz;

    public BaoZiPu(String name, BaoZi bz){
        super(name);
        this.bz = bz;
    }

    @Override
    public void run() {
        int count = 0;
        //造包子
        while(true){
            //同步，以包子类对象作为锁，保证锁统一
            synchronized (bz){
                if(bz.flag == true){
                    try {
                        //如果有包子则等待，先不生产
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                // 没有包子则造包子
                System.out.println("包子铺开始做包子");
                if(count%2 == 0){
                    // 冰皮  五仁
                    bz.pier = "冰皮";
                    bz.xianer = "五仁";
                }else{
                    // 薄皮  牛肉大葱
                    bz.pier = "薄皮";
                    bz.xianer = "牛肉大葱";
                }
                count++;
			  //生产完了修改标记为true表示有数据
                bz.flag=true;
                System.out.println("包子造好了："+bz.pier+bz.xianer);
                System.out.println("吃货来吃吧");
                //包子生产完则唤醒正在等待的吃货线程
                bz.notify();
            }
        }
    }
}