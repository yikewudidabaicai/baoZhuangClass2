package yunge.Math;

/**
 * Math工具类的使用
 */
public class MathDemo {
    public static void main(String[] args) {
        //获取圆周率
        double pi = Math.PI;
        //圆的面积
        double v = pi * 5 * 5;

        /***********************部分常用功能*****************/

        //绝对值函数
        int abs1 = Math.abs(-1);
        long abs2 = Math.abs(10000L);
        double abs3 = Math.abs(-1.1);
        float abs4 = Math.abs(-1.1f);
       //随机数(0~1之间的随机数)
        double random = Math.random()*100;
        //取整
        double ceil = Math.ceil(85.33);//向上取整  86
        double cbrt = Math.floor(85.33);//向下取整 85
        System.out.println(ceil);
        System.out.println(cbrt);
        //四舍五入取整
        System.out.println("四舍五入");
        long round = Math.round(89.66);
        System.out.println(round);
        long round1 = Math.round(89.33);
        System.out.println(round1);
        //求次幂
        System.out.println("求次幂 二的五次方");
        double pow = Math.pow(2, 5);
        System.out.println(pow);

        //最大最小值
        System.out.println("求最大值");
        int max = Math.max(9, 10);
        System.out.println(max);
        System.out.println("求最小值");
        int min = Math.min(9, 10);
        System.out.println(min);


    }
}
