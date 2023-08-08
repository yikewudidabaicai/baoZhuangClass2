package yunge.DesionModel.MoBanSheJiModel;

/**
 * 模板设计模式
 */
public abstract class MoBan {
    public int jisuan(int a,int b){
        System.out.println("数字"+a+"和数字"+b+"进行运算");
        int sum = code(a,b);
        System.out.println("计算结果是："+sum);
        return sum;
    }
    public abstract int code(int a,int b);
}
