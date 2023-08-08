package yunge.DesionModel.ZhuangShiModel;

public class Test {
    public static void main(String[] args) {
        Hello hello = new Hello();
        hello.hello();

        ZhuangShi zhuangShi = new ZhuangShi();
        zhuangShi.setHello(hello);
        zhuangShi.zengQiang();

    }
}
