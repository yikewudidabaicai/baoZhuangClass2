package yunge.interfaceNEW.InterfaceDemo;

/**
 * jdk新特性
 */
public interface NewInterface {
    double PI = 3.14;

    String look();

    //1.默认方法 jdk8
    /**
     * 提供实现类可以直接使用或者重写的方法
     * 实现类可以重写也可以不重写
     * 可以用于接口升级
     */
    public default void defaultMethod(){
        System.out.println("这是接口的默认方法");

        System.out.println("默认方法调用了私有方法");
        privateMethod();

    }

    //2.静态方法 jdk8
    /**
     * 接口的静态方法不能被实现类重写
     * 直接通过接口名称调用
     * 不可以通过实现类的类名或者实现类的对象调用
     */
    public static void staticMethod(){
        System.out.println("这是接口的静态方法");

    }


    //3.私有方法
    /**
     * 提供当前接口里使用的通用代码
     * 只能被接口的默认方法或者静态方法调用
     */
    private void privateMethod(){
        System.out.print("这是接口的私有方法");
    }











}
