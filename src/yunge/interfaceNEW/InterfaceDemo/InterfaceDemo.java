package yunge.interfaceNEW.InterfaceDemo;

public class InterfaceDemo {
    public static void main(String[] args) {
        NewInterface newInterfaceIMPL = new NewInterfaceIMPL();
        //调用重写的look方法
        newInterfaceIMPL.look();

        //调用默认方法
        newInterfaceIMPL.defaultMethod();

        //调用静态方法
        //只能用接口名直接调用
        NewInterface.staticMethod();



    }
}
