package yunge.interfaceNEW.InterfaceDemo;

public class NewInterfaceIMPL implements NewInterface{
    @Override
    public String look() {
        System.out.println("这是实现类的方法");
        return "这是实现类look方法的返回值";
    }
}
