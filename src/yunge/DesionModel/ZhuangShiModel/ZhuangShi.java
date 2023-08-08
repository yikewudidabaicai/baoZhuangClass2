package yunge.DesionModel.ZhuangShiModel;

public class ZhuangShi {
    private Hello hello;

    public void setHello(Hello hello) {
        this.hello = hello;
    }

    /**
     * 装饰Hello类中的hello方法
     */
    public void zengQiang(){
        System.out.println("请优雅的说：");
        hello.hello();
        System.out.println("弯腰鞠躬，演讲结束");
    }
}
